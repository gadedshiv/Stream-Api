import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsflatMap {

	public static void main(String[] args) {
		
		List<Customer> customers= CustRepository.getAllCustomer();
		
		//to get all names list 
		List<String>names=customers.stream().map(customer->customer.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		//toget all email list
		
		List<String> emails = customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		
		//to get all mobileNo list
		
		List mobiles= customers.stream().map(customer->customer.getMobile()).collect(Collectors.toList());
		System.out.println(mobiles);
		
		List mobileList= customers.stream().flatMap(customer->customer.getMobile().stream()).collect(Collectors.toList());
		System.out.println(mobileList);
		
		/*
		 * List sortedList=customers.stream().sorted().collect(Collectors.toList());
		 * 
		 * sortedList.stream().forEach(System.out::println);
		 */
		List<Customer> sortedList2=customers.stream().sorted((a,b)->a.getName().compareTo(b.getName())).collect(Collectors.toList());
		
		sortedList2.stream().map(c->c.getName()+" "+c.getEmail()).forEach(System.out::println);

		
	}

}
