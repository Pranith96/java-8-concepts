package com.methodreferenceexample1;

public class MethodReferenceMain {

	public static void hi() {
		System.out.println("Hello...!!!!");
	}

	public void hello() {
		System.out.println("Welcome..!!!");
	}

	public static void main(String[] args) {

		Addition response = () -> System.out.println("Hello");
		response.add();

		Addition response1 = MethodReferenceMain::hi;
		response1.add();
		
		MethodReferenceMain methodReferenceMain = new MethodReferenceMain();
		
		Addition response2 = methodReferenceMain::hello;
		response2.add();
		
	}

}
