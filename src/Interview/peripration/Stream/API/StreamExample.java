package Interview.peripration.Stream.API;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
                //** Find the even number from ArrayList using stream API
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(5,10,15,20,25,35);
		List<Integer> filterList =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filterList);
		
		List<Integer> mapList = list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(mapList);
		
		///////////////
		List<Integer> marks = Arrays.asList(50,60,15,20,25,35,40);
	long 	marksList =marks.stream().filter(i-> i<35).count();
	System.out.println(marksList);

	}

}
