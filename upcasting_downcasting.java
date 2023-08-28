package javaFun;
class parent{
	void show() {
		System.out.println("parent");
	}
}
class child extends parent{
	void show1() {
		System.out.println("chlid");
	}
}

public class upcasting_downcasting {
	public static void main(String[] args) {
		//upcasting is implicit
		parent obj=new child();
		// is internally equal to -> parent object=(parent) child();
		obj.show();
		//below line get error because  show1() is undefined for type parent
		//obj.show1();
System.out.println("............................................................................................");
		//downcasting is explicit 
		child obj1=(child)obj;
		obj1.show();
		obj1.show1();
		
		
		
		
	}

}
