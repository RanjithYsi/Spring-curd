package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;


import com.Pojo.*;


public class EmployeeDao
{
	
	@Resource(name = "jdbc/EmlpoyeePaySystem")
	private DataSource dataresource;
	
	public EmployeeDao(DataSource dataresource) 
	{
		super();
		this.dataresource = dataresource;
	}
	
	public EmployeeDao() 
	{
		super();
		
	}
	
	Connection conn = null;
	PreparedStatement prest;
	ResultSet rs = null;
	
	  public void add(Emp_Pojo da)throws Exception 
	  { 
		 int Emp_Id = da.getEmpId();
		 String Emp_Name = da.getEmpName(); 
		 String Emp_Dept = da.getEmpDept(); 
		 int Emp_Salary = da.getEmpSalary();
	  
		 conn = dataresource.getConnection();
	  
		 System.out.println("Inserting into da");
	  
		 String sql = "insert into employee1(Emp_id,Emp_Name,Emp_Dept,Emp_Salary) values (?,?,?,?)" ;
	  
		 prest = conn.prepareStatement(sql);
	  
		 prest.setInt(1, Emp_Id );
		 prest.setString(2, Emp_Name);
		 prest.setString(3, Emp_Dept);
		 prest.setInt(4, Emp_Salary );
		 prest.executeUpdate();
	  
		 System.out.print("Inserted into db");
	  }
	  
	  public List<Emp_Pojo> emplist()throws Exception
		{
		 
			List<Emp_Pojo> em1 = new ArrayList<>();
			conn = dataresource.getConnection();
			System.out.println("Connect to db");
			String getList = "select * from employee1";
			prest = conn.prepareStatement(getList);
			rs = prest.executeQuery();
			
			Emp_Pojo dao;
			
			while(rs.next())
			{
				int Emp_Id = rs.getInt(1);
				String Emp_Name = rs.getString(2);
				String Emp_Dept = rs.getString(3);
				int Emp_Salary = rs.getInt(4);
				
				dao = new Emp_Pojo(Emp_Id,Emp_Name,Emp_Dept,Emp_Salary);
				em1.add(dao);
			}
			return em1;
		}
	  		public void delete(Emp_Pojo del)throws Exception
	  		{
	  			try {
	  				conn =  dataresource.getConnection();
	  				}
	  			catch (SQLException e)
	  			{
	  				e.printStackTrace();
	  				}
	  			
	  				int Emp_id = del.getEmpId();
			
	  				System.out.println("deleting from database");
			
	  				String sql = "Delete from employee1 where Emp_id=?";
	  				
	  				try {
	  						prest = conn.prepareStatement(sql);
		  				}
		  			catch (SQLException e)
		  				{
		  					e.printStackTrace();
		  				}
	  				
	  				try {
	  						prest.setInt(1, Emp_id);
	  						prest.executeUpdate();
	  					} 
	  				catch (SQLException e)
	  					{
	  						e.printStackTrace();
	  					}
	  	
	  				System.out.print("deletion success");
	  		
		}
	  		public void update(Emp_Pojo update)
	  		{
	  			try
	  			{
	  			int Emp_id = update.getEmpId();
	  			
	  			String Emp_Name = update.getEmpName();
	  			String Emp_Dept = update.getEmpDept();
	  			int Emp_Salary  = update.getEmpSalary();
	  			
	  			conn =  dataresource.getConnection();
	  			
	  			System.out.println("Updating the database......");
	  			
	  			String update1 = "update employee1 set Emp_Name=?,Emp_Dept=?,Emp_Salary=? where Emp_id=?";
	  			
	  			prest = conn.prepareStatement(update1);
	  			
	  			
	  			prest.setString(1, Emp_Name);
	  			prest.setString(2, Emp_Dept);
	  			prest.setInt(3, Emp_Salary);
	  			prest.setInt(4, Emp_id);
	  			
	  			prest.executeUpdate();
	  			
	  			System.out.print("Updation success.......");
	  			
	  			
	  			}
	  			catch(Exception e)
	  			{
	  				System.out.print(e);
	  			}
}
}