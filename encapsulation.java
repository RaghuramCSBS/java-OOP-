package javaFun;
class Employee{
	private String name;
	private int salary;
	// methods to set and get these private numbers
	void SetEmpDetails(String n,int s){
		name=n;
		salary=s;
	}
	String GetName() {
		return name;
	}
	int GetSalary() {
		return salary;
	}
	
}

public class encapsulation {
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.SetEmpDetails("sowmya",100000000);
		System.out.println(obj.GetName());
		System.out.print(obj.GetSalary());
		
		
		
	}

}
