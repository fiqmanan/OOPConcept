/************************************************
1. *Copyright. For internal Use only
*
*FILE: inheritance.java
*PROJECT:Problem Solving 3
*Module:1
*
*Description:
*This is just for example to understand the inheritance
*
*Note:
*
*Compiler dependencies or special instruction:
*This project is run using Textpad and compile using java
*
*Revision History
*Date: 2nd April 2019   By: Muhamad Zul Hisyam Bin Abdul Aziz   Description:This is the intial push

*************************************************/
class Teacher {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   void does(){
	System.out.println("Teaching");
   }
}

public class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics";
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}