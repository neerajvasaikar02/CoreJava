package com.edubridge.typesofvariables;
//programtodemonstrate on types ofvariables;
public class TypesofVariables {
			//instance variabe
			float salary=78999.56f;
			///static variable
			static int x=10;
			
			String display()
			{
				//local variable
				@SuppressWarnings("unused")
				char abc='z';
				System.out.println(abc);
				return "Local Variable";
			}
			

	public static void main(String[] args) {
		System.out.println(x);
		TypesofVariables obj=new TypesofVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);

	}

}
