package com.my;

public class PrivateDemo {
	
	private String name;
	private void sayHello(String name) {
		System.out.println("Hello! "+name);
	}
	

	public static void main(String[] args) {
		PrivateDemo privateDemo = new PrivateDemo();
		privateDemo.name = "Sravan";
	    privateDemo.sayHello(privateDemo.name);
	}

}
