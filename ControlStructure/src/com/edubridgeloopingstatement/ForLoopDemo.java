package com.edubridgeloopingstatement;

import java.util.Scanner;
/*program to demonstrate on to print 1 to N numbers*/
public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		/*for(int i=1;i<=N;i++)
		{
			System.out.println(i+"");
		}*/
		for(int i=N;i>=1;i-- )
		{
			System.out.println(i+"");
		}
		s.close();
	}

}
