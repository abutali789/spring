package spring5.controller;

public class UserDetails {

	A a1;

	public A getA1() {
		return a1;
	}

	public void setA1(A a1) {
		this.a1 = a1;
	}

	public void bMethod() {
		// System.out.println("from b method");

		a1.aMethod();
	}

}
