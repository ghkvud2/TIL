package com.strategy.book.interfaces;


public class OrdinaryPricePolicy implements PricePolicy {

	@Override
	public int calcPrice(int price, int rentCount) {
		return price * rentCount;
	}

}
