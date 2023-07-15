package com.gradedproject.q1;

class SuperDepartment {
	public String departmentName() {
		return "super Department";
	}

	public String getTodayWork() {
		return "no Work as of Now";
	}

	public String getWorkDeadline() {
		return "Nill";
	}

	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}

public class SuperDapartment {

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
