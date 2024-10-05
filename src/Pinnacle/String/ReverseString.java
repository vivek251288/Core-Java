package Pinnacle.String;

public class ReverseString {
	public static void main(String[] args) {
		String orginal="Vivek Pandey";
		String reverse=new StringBuilder(orginal).reverse().toString();
		System.out.println("Orginal :"+orginal);
		System.out.println("Reverse :"+reverse);
		
	}

}
