package javaFun;
abstract class P{
//abstract method should be in abstract class
//abstract class should not need to have abstract method
//abstract class can't have objects
//to access abstract class we need to inherit it to child class
//abstract method need to be override 
abstract void abc();
void show() {
	System.out.println("in class A");
}
}
class Q extends P{
	 void abc(){
		 
		System.out.println("ABC in Class B");
	}
}
public class Abstract {
	public static void main(String[] args) {
		Q obj=new Q();
		obj.abc();
		obj.show();
	}

}
