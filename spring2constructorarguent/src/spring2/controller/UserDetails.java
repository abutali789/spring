package spring2.controller;

public class UserDetails {
	
	public UserDetails(String str,int a) {
		System.out.println("from parameterize constructor: "+str+"  "+a);
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

}
