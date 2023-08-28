package javaFun;
interface AA{
	//internally method are abstract and instance variables are static(no need to be create object to access variable)and final(constant)
	//in abstract class method method can be abstract and normal and variables can be static,non static,final,non final
	//both cannot be created objects
	void b();
}
class L implements AA{
	
	public void b(){
		System.out.println("b");
	}
	
}
public class Interface {
	public static void main(String[] args) {
		L obj=new L();
		obj.b();
		
	}

}
