package dao;

import static dao.DBUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojos.employee;



public class employeedao {
	private Connection cn;
	private PreparedStatement pst1;
	
	
	public employeedao() throws Exception
	{ String query="select * from employeedetail where username=? and pwd=?";
		cn=getConnection();
		System.out.println("connection to db");
		pst1=cn.prepareStatement(query);
		//pst1.setString(arg0, arg1);
	}
	
	public void cleanUp() throws Exception {
		System.out.println("in clean-up");
		{
			if (pst1 != null)
				pst1.close();
		}
}
	
	public String validateUser(String username,String password) throws SQLException
	{
		
		String str="failed to login";
		pst1.setString(1, username);
		pst1.setString(2, password);
		try{
			ResultSet rst = pst1.executeQuery();
			if (rst.next())
				return "login success";
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return str;
}
	public void registerEmployee(employee e) throws SQLException
	{
		
		
	}
}