import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustRepository {
	
	public static List<Customer> getAllCustomer(){
		return Stream.of(new Customer("Debo","abc@gmail.com",List.of("9898989898","9797979797")),
				new Customer("Adhya","adhya@gmail.com",List.of("9696969696","95959595959")),
				new Customer("Pradnya","pradnya@gmail.com",List.of("954954954","9494949449"))
				).collect(Collectors.toList());
	}

}
