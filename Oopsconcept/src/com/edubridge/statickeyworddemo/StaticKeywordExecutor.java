package com.edubridge.statickeyworddemo;
class LearnerDetails
{
	static String name;
	static int rollno;
	static String instituteName="EduBridge";
	public static void print()
	{
		System.out.println(name+" "+rollno+" "+instituteName);
	}
	
}
public class StaticKeywordExecutor {

	public static void main(String[] args) {
		
		 LearnerDetails.rollno=567;
		 LearnerDetails.name="Neeraj";
		 LearnerDetails.print();
		 
		 LearnerDetails.rollno=13;
		 LearnerDetails.name="RAJ";
		 LearnerDetails.print();


	}

}
