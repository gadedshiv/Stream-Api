import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionAndFunctionalChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("################### Function ###############");
		List numbers= List.of(1,2,3,4,5,6,7,8,9);
		Function<Integer,Integer> function=i->i+i;
		System.out.println(numbers.stream().map(function).peek(System.out::println).collect(Collectors.toList()));
		Function<Integer,Integer> function2=i->i*i;
		System.out.println(numbers.stream().map(function).peek(System.out::println).collect(Collectors.toList()));
		
		System.out.println("################### Function Chaining ###############");
		System.out.println(numbers.stream().map(function.andThen(function2)).peek(System.out::println).collect(Collectors.toList()));
		System.out.println(numbers.stream().map(function.compose(function2)).peek(System.out::println).collect(Collectors.toList()));
		

	}

}
