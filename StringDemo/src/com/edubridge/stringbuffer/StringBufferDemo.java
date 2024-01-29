package com.edubridge.stringbuffer;

public class StringBufferDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Neeraj");
		//System.out.println(b.capacity());
		//StringBuffer b1=new StringBuffer("Internet of Things");
		//System.out.println(b1.capacity());
	//	b1=new StringBuffer(" ");
		String str="Edubridge";
		//StringBuffer s1=new StringBuffer(str.length());
		//System.out.println(s1.capacity());
		/* as string is immutable, we can't do a modification*/
		StringBuffer s4=new StringBuffer("Internet");
		System.out.println(s4.append(" India"));
		//StringBuffer b=new StringBuffer("Neeraj");
		System.out.println(b.charAt(3));
		b.setCharAt(4,'z');
		System.out.println(b);
	}

}
