package com.abhilash.Inheritance;

public class ParentPrivateMethod extends Parent{

	public static void main(String[] args) {
		Parent instance = new ParentPrivateMethod();
		// This method is private in parent. So cannot be accessed in child class. The method should be
		// atleast protected for the child class to access or inherit it.
		//instance.print();
	}
}
