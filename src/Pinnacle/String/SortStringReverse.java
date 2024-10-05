package Pinnacle.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringReverse {
public static void main(String[] args) {
//	List<String> strings =new ArrayList<>();
//	strings.add("apple");
//	strings.add("banana");
//	strings.add("orange");
//	strings.add("pear");
//	Collections.sort(strings ,Collections.reverseOrder());
//	
//	
//	for(String str:strings) {
//		System.out.println(str);
//	}
//}}
	List<String> strings =new ArrayList<>();
	strings.add("vivek");
	strings.add("apple");
	strings.add("orrange");
	Collections.sort(strings, Collections.reverseOrder());
	
	for(String str:strings) {
		System.out.println(str);
	}
}}


