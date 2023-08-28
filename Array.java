package javaFun;

public class Array {
	public static void main(String[] args) {
		int[] marks=new int[] {1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("***********************************************");
		int[] marks1= {1,2,3,4,5,6,7,8,9};
		for (int v:marks1) {
			System.out.print(v);
		}
		
	}

}
