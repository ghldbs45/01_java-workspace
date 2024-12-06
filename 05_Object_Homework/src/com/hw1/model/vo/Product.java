package com.hw1.model.vo;

public class Product {
	
	private String id;
	private String name;
	private String area;
	private int price;
	private double tax;

	
	public Product(String id,String name, String area,int price,double tax) {
		
		this.id = id;
		this.name = name;
		this.area = area;
		this.price = price;
		this.tax = tax;
	}
	public void setId(String id) {
		this.id = id;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setArea(String area) {
		this.area = area;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public void setTax(double tax) {
		this.tax = tax;
		
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getArea() {
		return area;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
	
	public String information() {
		
		return "productid : " + id + "  productName : " + name + "  productArea : " + area + "  price : "+price+"  tax : "+tax;
	
	
}
}