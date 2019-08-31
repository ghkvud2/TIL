package com.strategy.book.interfaces;


public class MemberDiscountPricePolicy implements PricePolicy {

	@Override
	public int calcPrice(int price, int rentCount) {
		return (int) (price * rentCount * 0.9);
	}

}
