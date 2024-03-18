package com.eb.entity;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int qid;
	private String qName;
	private Map<String,String>answers;
	public Question(int qid, String qName, Map<String, String> answers) {
		super();
		this.qid = qid;
		this.qName = qName;
		this.answers = answers;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void disp() {
		System.out.println("Question No:"+qid+"\nQuestion:"+qName);
		
		System.out.println("*Answers**");
		
		Set<Entry<String,String>>set=answers.entrySet();
		
		Iterator<Entry<String,String>>itr=set.iterator();
		while(itr.hasNext()) {
			Entry<String,String>entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
