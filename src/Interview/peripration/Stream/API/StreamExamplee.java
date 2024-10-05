package Interview.peripration.Stream.API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamplee {
               //sorted using stream APi
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5,10,15,20,25,35);
		List<Integer> sortedList =list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
