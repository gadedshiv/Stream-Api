import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=List.of(1,2,3,4,5,6,1,2,7,8,9,10);
		
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
		System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
		System.out.println(numbers.stream().noneMatch(n->n>50));
	}

}
