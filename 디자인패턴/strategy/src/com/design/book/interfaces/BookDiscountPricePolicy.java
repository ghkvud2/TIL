package com.design.book.interfaces;

public class BookDiscountPricePolicy implements PricePolicy {

	@Override
	public int calcPrice(int price, int rentCount) {
		return (int) (price * rentCount * 0.95);
	}

}
