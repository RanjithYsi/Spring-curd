package com.Pojo;

import java.util.List;

import javax.sql.DataSource;

public class Emp_Pojo 
{
	private int empId;
	private String empName;
	private String empDept;
	private int empSalary;
	
	
	public Emp_Pojo(int empId)
	{
		super();
		
	}

	public Emp_Pojo()
	{
		super();
		
	}

	public Emp_Pojo(int empId, String empName, String empDept, int empSalary) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public void delete(Emp_Pojo del)
	{
		
		
	}

	
}
