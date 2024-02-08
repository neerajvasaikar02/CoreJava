package com.edubridge.interfacedemo;
/*program to demonstrate on nested interface*/
//outer interface
public interface Books {
	
	void showBooks();
	
	//nested interface
	//inner interface
	interface StoryBooks{
		void showStoryBooks();
	}
}

