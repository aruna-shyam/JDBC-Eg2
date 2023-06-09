package com.techpalle;

import java.sql.*;
public class A 
{  
	
	Connection con=null;
    Statement s=null;
	PreparedStatement ps=null;
	
	public static String classname="com.mysql.cj.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/jdbc";
	public static String username="root";            
	public static String password="admin";
	
	 
   public void creating() throws ClassNotFoundException, SQLException 
   {
	       
				Class.forName(classname);
				con=DriverManager.getConnection(url,username,password);
			    
				s=con.createStatement();
				
				s.executeUpdate("create table emp(eid int primary key auto_increment,"
						+ "ename varchar(50) not null,esal int,email varchar(80) unique)");
				s.close();
			    con.close();
				
  }
	   
			
   public void inserting(String name,int sal,String mail) throws ClassNotFoundException, SQLException 
	{
		
            Class.forName(classname);
		   
			con=DriverManager.getConnection(url,username,password);
			
			ps=con.prepareStatement("insert into emp(ename,esal,email) values (?,?,?)");
			ps.setString(1,name);
			ps.setInt(2,sal);
			ps.setString(3, mail);
			
			ps.executeUpdate();
			 
			ps.close();
			con.close();
		    
	} 
   public void updating( int id,String name,int sal,String mail) throws ClassNotFoundException, SQLException 
  	{
  		
            Class.forName(classname);
  		   
  			con=DriverManager.getConnection(url,username,password);
  			
  			ps=con.prepareStatement("update emp set ename=?, esal=?, email=? where eid=?");
  			ps.setString(1,name);
  			ps.setInt(2,sal);
  			ps.setString(3, mail);
  			ps.setInt(4, id);
  			
  			ps.executeUpdate();
  			 
  			ps.close();
  			con.close();
  		    
  	}
   public void deleting(int id) throws ClassNotFoundException, SQLException 
  	{
  		
             
	        Class.forName(classname);
  		 
  			con=DriverManager.getConnection(url,username,password);
  			
  			ps=con.prepareStatement("delete from emp where eid=?");
  			ps.setInt(1,id);
  			
  			ps.executeUpdate();
  			 
  			ps.close();
  			con.close();
  		    
  	} 
	  
	
		 
}
	 
	
  

