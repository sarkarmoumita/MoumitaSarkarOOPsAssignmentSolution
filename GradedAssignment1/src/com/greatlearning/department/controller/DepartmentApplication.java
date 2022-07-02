package com.greatlearning.department.controller;
import com.greatlearning.department.superDepartment.superDepartment;
import com.greatlearning.department.Admin.AdminDepartment;
import com.greatlearning.department.HR.HRDepartment;
import com.greatlearning.department.Tech.TechDepartment;

public class DepartmentApplication {

	public static void main(String[] args) {
		
		superDepartment obj1=new AdminDepartment();
		HRDepartment obj2=new HRDepartment();
		TechDepartment obj3=new TechDepartment();
		System.out.println("Welcome to "+obj1.DepartmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+obj2.DepartmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to "+obj3.DepartmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}

}