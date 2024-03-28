package com.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok.entity.Menu;

@SpringBootApplication
public class LombokdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokdemoApplication.class, args);
		Menu m1=new Menu();
		
		Menu m2=new Menu(101,"idli",30,2);
		Menu m3=new Menu(102,"vada",40,4);
		
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
