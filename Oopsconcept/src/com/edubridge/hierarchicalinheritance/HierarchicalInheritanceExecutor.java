package com.edubridge.hierarchicalinheritance;

public class HierarchicalInheritanceExecutor {

	public static void main(String[] args) {
	Tiramisu t=new Tiramisu();
	SnowCone c=new SnowCone();
	t.deviceName="Realme 10 pro pus 5G";
	t.version="Android 13";
	c.deviceName="Samsung";
	c.version="Android 12";
	t.print();
	c.print();
	}

}
