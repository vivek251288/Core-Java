import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
	        // ArrayList example
	        List<String> arrayList = new ArrayList<String>();
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        System.out.println("ArrayList: " + arrayList);
	        System.out.println("Element at index 1: " + arrayList.get(1));

	        // LinkedList example
        List<String> linkedList = new LinkedList<String>();
            linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Cherry");
	        System.out.println("LinkedList: " + linkedList);
	        System.out.println("Element at index 1: " + linkedList.get(1));
	    }
	}


