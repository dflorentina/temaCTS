package ro.ase.cts.Store;

import ro.ase.cts.Exception.InvalidProductTypeException;

public class Discount {
	
	private String name;
	private Products products;
	private float price;
	public float discount;

	
public Discount(String name, Products products, float price) {
		this.name = name;
		this.products = products;
		this.price = price;
	}


public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Products getProducts() {
		return products;
	}


	public void setProducts(Products products) {
		this.products = products;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


public static float discountCalculator(Products product, float price) throws InvalidProductTypeException{
	float discount=0.0f;
	switch(product){
		case FOOD:
			discount=price-(price*0.9f);
			break;
		case BEVERAGES:
			discount=price-(price*0.85f);
			break;
		case BAKERY:
			discount=price-(price*0.95f);
			break;
		case SWEETS:
			discount=price-(price*0.80f);
			break;
		case FROZEN:
			discount=price-(price*0.85f);
			break;
			
		default:
			throw new InvalidProductTypeException("Unknown product type!");
				
	}
	
	return discount;
	
}


public String display() {
	return new String("Price"  + " - Price " +this.price);
}
public String displayDiscount() {
	return new String("Discount"  + " - Price " +this.discount);
}
}
