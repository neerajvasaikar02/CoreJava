package com.edubridge.pojo;

public class Product {
	
private int productid;
private String productname;
private int productPrice;
private int productQuantity;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getProductPrice() {
	return productPrice;
}
public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
public Product(String productname, int productPrice, int productQuantity) {
	super();
	this.productname = productname;
	this.productPrice = productPrice;
	this.productQuantity = productQuantity;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", productPrice=" + productPrice
			+ ", productQuantity=" + productQuantity + "]";
}

}
