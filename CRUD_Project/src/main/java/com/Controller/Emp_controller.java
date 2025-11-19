package com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.Pojo.*;
import com.Dao.*;

@WebServlet("/Emp_controller")
public class Emp_controller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	
		EmployeeDao dao;  
       @Resource(name = "jdbc/EmlpoyeePay_System")
       private DataSource datasource;
   	
	
	public void init(ServletConfig config)throws ServletException
	{
		 dao = new EmployeeDao(datasource);
	}
	
  
    public Emp_controller() 
    {
    	
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			
			int EmpId 	= Integer.parseInt(request.getParameter("delete"));
			
			System.out.print( EmpId );
			Emp_Pojo del = new Emp_Pojo(EmpId);
			
			dao.delete(del);
			
			List<Emp_Pojo> em = new ArrayList<>();
			em = dao.emplist();
			
			request.setAttribute("EmployeeListfromServlet",em);
			
			@SuppressWarnings("unused")
			RequestDispatcher dis = request.getRequestDispatcher("EmpList.jsp");
			dis.forward(request, response);
		
		}
	catch(Exception e)
	{
		System.out.print(e);
	}
		
		doGet(request, response);
	}

}
