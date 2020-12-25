package core.util;

class Parent{
	public void walk() {
		System.out.println("Parent walk method called");
	}
	public void run() {
		
		System.out.println("Parent run method called");
	}
	
	// Method hiding
	public static void print() {
		System.out.println("Parent static Print method");
	}
}

class Child extends Parent{
	public void walk() {
		System.out.println("child walk method called");
		super.walk();
	}
	public void run() {
		System.out.println("child run method called");
		super.run();
	}
	public static void print() {
		System.out.println("Child static Print method");
	}
}


public class InheritanceCallHirarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method called for inheritance call hirarchy ");
		Parent p = new Child();
		p.walk();
		p.print();
		//p.run();
	}
}
