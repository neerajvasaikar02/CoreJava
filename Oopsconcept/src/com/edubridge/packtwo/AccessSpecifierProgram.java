package com.edubridge.packtwo;
import com.edubridge.packone.*;
public class AccessSpecifierProgram {

	public static void main(String[] args) {
		AccessSpecifierDemo obj=new AccessSpecifierDemo();
		obj.emailId="neerajv009@gmail.com"; //public 
		obj.displayemaiId();
		//obj.percentage=88f;
		//default we can' t access in another class
		//obj.displaypercentage;
	}

}
