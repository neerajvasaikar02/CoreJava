package com.edubridge.checkedexception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {
		File f=new File("Hello.txt");
		try {
			FileInputStream f1=new FileInputStream(f);
			System.out.println("FileExists");
		}catch (FileNotFoundException e) {
			System.out.println("File does  not exists" + " "+e);
		}
		

	}

}
