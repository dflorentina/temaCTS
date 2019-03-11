package ro.ase.cts.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.Store.Products;
import ro.ase.cts.Exception.InvalidProductTypeException;
import ro.ase.cts.Store.Discount;;

public class StoreTests {
	float price=0.0f;
	@Test
public void testDiscountCalculatorFOOD(){
		Discount d=new Discount("Food",Products.FOOD,10);
	try {
		assertEquals(1,Discount.discountCalculator(Products.FOOD,10),0.001);
	} catch (InvalidProductTypeException e) {
		System.out.println(e.getMessage());
	}
}
	
	@Test
	public void testDiscountCalculatorBEVERAGES() {
		Discount d=new Discount("Food",Products.BEVERAGES,10);
		try {
			assertEquals(1.5, Discount.discountCalculator(Products.BEVERAGES, 10),0.01);
		} catch (InvalidProductTypeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountCalculatorBAKERY() {
		Discount d=new Discount("Food",Products.BAKERY,10);
		try {
			assertEquals(0.5, Discount.discountCalculator(Products.BAKERY, 10),0.01);
		} catch (InvalidProductTypeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountCalculatorSWEETS() {
		Discount d=new Discount("Food",Products.SWEETS,10);
		try {
			assertEquals(2, Discount.discountCalculator(Products.SWEETS, 10),0.01);
		} catch (InvalidProductTypeException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testDiscountCalculatorFROZEN() {
		Discount d=new Discount("Food",Products.FROZEN,10);
		try {
			assertEquals(1.5, Discount.discountCalculator(Products.FROZEN, 10),0.01);
		} catch (InvalidProductTypeException e) {
			System.out.println(e.getMessage());
		}
	}


	@Test
	public void testDiscountCalculatorNegativeValue() {
		Discount d=new Discount("Food",Products.FOOD,10);
		assertFalse(price<0);
	}
	
	@Test
	public void testPrice() throws Exception {
		Discount d=new Discount("Food",Products.FOOD,10);
		System.out.println("Test:" + d.display());
				
	}
	
}

