package com.gradedproject.q1;

import com.gradedproject.q1.AdminDepartment;
import com.gradedproject.q1.HrDepartment;
import com.gradedproject.q1.TechDepartment;
import com.gradedproject.q1.SuperDepartment;

public class DriverClass {

	public static void main(String[] args) {
		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 = new HrDepartment();
		TechDepartment obj3 = new TechDepartment();
		System.out.println(" Welcome to " + obj1.departmentName());
		System.out.println(obj1.getTodayWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println("");
		System.out.println(" Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println("Fill today's timeSheet and mark yout attendance");
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println("");
		System.out.println(" Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodayWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}

}
