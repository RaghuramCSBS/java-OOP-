package javaFun;
class A{
	A(){
		System.out.println("class A default contructor");
	}
}
class B extends A{
	B(){
		//super();
		this(5);
		System.out.println("class B default contructor");
	}
	B(int n){
		System.out.println("class B parameterized constructor "+n);
	}
}

public class contructorchaining {
	public static void main(String[] args) {
		B obj=new B();
		
		
	}

}
