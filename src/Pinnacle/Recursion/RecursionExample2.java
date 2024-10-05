package Pinnacle.Recursion;

public class RecursionExample2 {
	
//static int count=0;  
//static void p(){  
//count++;  
//if(count<=5){  
//System.out.println("hello "+count);  
//p();  
//}  
//}  
//public static void main(String[] args) {  
//p();  
//}
//}
	 public static void main(String[] args) {
		    int result = sum(10);
		    System.out.println(result);
		  }
		  public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }
		}

