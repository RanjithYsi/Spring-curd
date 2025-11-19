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

import com.Dao.EmployeeDao;
import com.Pojo.Emp_Pojo;



@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	
	@Resource(name = "jdbc/EmlpoyeePay_System")
	private DataSource dataresource;
	
	EmployeeDao da;
	
	public void init(ServletConfig config)
	{
		 da = new EmployeeDao(dataresource);
	}
	
	
    public Employee() 
    {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		try {
			
			int Emp_id 		= Integer.parseInt(request.getParameter("id"));
			String Emp_Name = request.getParameter("name");
			String Emp_Dept = request.getParameter("dept");
			int Emp_salary	= Integer.parseInt(request.getParameter("salary"));
			
			Emp_Pojo emp = new Emp_Pojo(Emp_id,Emp_Name,Emp_Dept,Emp_salary);
			
			da.add(emp);
		
			List<Emp_Pojo> em = new ArrayList<>();
			em = da.emplist();
			System.out.println("List optained from Dao");
			
			request.setAttribute("EmployeeListfromServlet",em);
			
		
			RequestDispatcher dis = request.getRequestDispatcher("EmpList.jsp");
			dis.forward(request, response);
			
	}
	catch(Exception e)
	{
		System.out.print(e);
		e.printStackTrace();
	}

		
		
		doGet(request, response);
	}

}
