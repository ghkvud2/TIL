package com.strategy.book.model;

import com.strategy.book.interfaces.PricePolicy;

public class Rent {
	private Member member;
	private Book book;
	private PricePolicy pricePolicy;
	int rentCount;

	public Rent(Member member, Book book, PricePolicy pricePolicy, int rentCount) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy;
		this.rentCount = rentCount;
		this.member.addAccPrice(pricePolicy.calcPrice(this.book.getPrice(), this.rentCount));
	}

	public int getPrice() {
		return pricePolicy.calcPrice(book.getPrice(), this.rentCount);
	}

}
