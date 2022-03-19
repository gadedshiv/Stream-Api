import java.util.List;
import java.util.stream.IntStream;

import javax.swing.GroupLayout.ParallelGroup;

public class ReduceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(IntStream.range(1, 11).reduce((a,b)->a+b));
		
		System.out.println(IntStream.range(1, 11).reduce(100,(a,b)->a+b));
		
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println(numbers.parallelStream().reduce(100,(a,b)->a+b,(a,b)-> a+b));


	}

}
