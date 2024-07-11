package com.sachin.springboot.myfirstwebapp.login;

public class Authentication {

	
	public Boolean Authenticate(String name,String password) {
		
		Boolean namevalid = name.equalsIgnoreCase("sachin");
		Boolean passvalid = password.equalsIgnoreCase("singh");
		
		System.out.println(namevalid +""+passvalid);
		return namevalid && passvalid;
	}
}
