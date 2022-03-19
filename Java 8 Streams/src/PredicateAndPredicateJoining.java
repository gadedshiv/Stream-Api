import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateAndPredicateJoining {
	
	public static void main(String[] args) {
		
		System.out.println("################# Prdicate ##################");
		
		List numbers=List.of(1,2,3,6,9,7,21,24,30,31,37,40,55,15);
		
		Predicate<Integer> predicate=i-> i>30;
		System.out.println(numbers.stream().filter(predicate).peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("################# Prdicate Joining AND ##################");
		Predicate<Integer> predicate2=i-> i%2==0;
		System.out.println(numbers.stream().filter(predicate.and(predicate2)).peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("################# Prdicate Joining OR ##################");
		System.out.println(numbers.stream().filter(predicate.or(predicate2)).peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("################# Prdicate Joining Negate ##################");
		System.out.println(numbers.stream().filter(predicate.negate()).peek(System.out::println).collect(Collectors.toList()));
	}

}
