package com.strategy.book.interfaces;


public interface PricePolicy {
	int calcPrice(int price, int rentCount);
}
