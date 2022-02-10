package com.method.contructorreference;

public class ConstructorReferenceMain {

	public static void main(String[] args) {

		Hello hello = DisplayMessage::new;
		hello.getMessage("Hello world");
	}

}
