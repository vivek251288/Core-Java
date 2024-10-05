package Interview.peripration.Stream.API;

public class StaticMethodOverride {
	//class SuperClass {
	    static void staticMethod() {
	        System.out.println("Static method in SuperClass");
	    }
	}

	class SubClass extends StaticMethodOverride {
	    static void staticMethod() {
	        System.out.println("Static method in SubClass");
	    }
	
	//}
//	public class Main33 {
	    public static void main(String[] args) {
	    	StaticMethodOverride superClass = new StaticMethodOverride();
	    	StaticMethodOverride subClassAsSuper = new SubClass();
	        SubClass subClass = new SubClass();

	        superClass.staticMethod();         // Output: Static method in SuperClass
	        subClassAsSuper.staticMethod();    // Output: Static method in SuperClass
	        subClass.staticMethod();           // Output: Static method in SubClass
	    }
	}
	
	

