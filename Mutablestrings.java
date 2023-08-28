package javaFun;

public class Mutablestrings {
	
	public static void main(String[] args) {
		//StringBuffer is safe thread and slow
	StringBuffer buffer = new StringBuffer("Hello");
	buffer.append(" world");
	System.out.println(buffer); // Prints "Hello world"
	//StringBuilder is unsafe thread and fast
	StringBuilder builder = new StringBuilder("Hello");
	System.out.println(builder);
	
}}
