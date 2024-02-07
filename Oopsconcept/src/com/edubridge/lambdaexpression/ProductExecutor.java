package com.edubridge.lambdaexpression;
/*implemented functional interface method with lambda expression*/
public class ProductExecutor {

	public static void main(String[] args) {
		//lambda expression
		Product p=(price)->{
			System.out.println("Price is: "+price);
		};
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBrand());
		p.displayProductPrice(1500);
	}

}
