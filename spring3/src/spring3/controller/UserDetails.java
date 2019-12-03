package spring3.controller;

public class UserDetails {
	
	
	public UserDetails(String s,int i) {
		System.out.println("from parameterize constructor: "+s+" "+i);
	}
	
	public UserDetails() {
		System.out.println("from null constructor");
	}
	
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setup() {
		System.out.println("from init method");
	}
	
	public void cleanUp() {
		System.out.println("from destroy method");
	}

}
