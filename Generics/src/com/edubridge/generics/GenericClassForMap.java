package com.edubridge.generics;
class Dictionary<K,V>
{
	//where k, v defines any kind of type values
	K Key;
	V Value;
	
	void print(K Key,V Value)
	{
		this.Key = Key;
		this.Value = Value;
		System.out.println("The Va;lue is : "+Key +" "+Value);
		
	}
}

public class GenericClassForMap {

	public static void main(String[] args) {
		Dictionary<Character,String> obj = new Dictionary<>();
		obj.print('c', "Cyclone");
		obj.print('d', "DoomsDay");

	}

}
