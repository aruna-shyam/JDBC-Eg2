package com.techpalle;

import java.sql.SQLException;

public class MyProgram 
{
public static void main(String[] args) 
{
	A a=new A();
	try 
	{
		/*a.creating();
		a.inserting("Aruna",10000,"aruna@gmail.com")
		a.updating(4,"Chikku", 19000, "chikku134@gmail.com");*/
		a.deleting(4);
	
	} 
	catch (ClassNotFoundException e) 
	{
		
		e.printStackTrace();
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
		
}

}
