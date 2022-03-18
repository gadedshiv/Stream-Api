import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekAndSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#############Peek Method###############");
		List<String> strList=Stream.of("one","two","three","four","five","six","seven","eight","nine","ten").filter(obj->obj.length()==3).peek(System.out::println).collect(Collectors.toList());
		System.out.println(strList);
		
		System.out.println("###############Skip Method###############");
		
		List<String> strList1=Stream.of("one","two","three","four","five","six","seven","eight","nine","ten").skip(2).filter(obj->obj.length()==3).peek(System.out::println).collect(Collectors.toList());
		System.out.println(strList1);
	}

}
