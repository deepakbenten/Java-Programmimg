package com.opps.inheritanse;

public class College extends Student{
	void collegeDetails() {
		int collegeId=1023;
		String collegeName="DSPMU";
		String Course="Computer Application..!";
		System.out.println("College Id : "+collegeId);
		System.out.println("College Name : "+collegeName);
		System.out.println("Course name : "+Course);
	}
	College(String department){
		//super(4587);
		
		System.out.println("Department : "+department);
	}
	College(){
		System.out.println("College class default constructor...!");
	}
	public static void main(String[] args) {
		Student sobj=new Student(87094297);
		sobj.studentDetails();
		System.out.println("------------------------");
		College cobj=new College("MCA");
		College cobj1=new College();
		cobj.collegeDetails();
		
	}

}
