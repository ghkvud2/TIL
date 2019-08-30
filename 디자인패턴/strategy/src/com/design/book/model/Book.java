package com.design.book.model;

public class Book {
	private String sign;
	private String pubDate;
	private int price;

	public Book(String sign, String pubDate, int price) {
		this.sign = sign;
		this.pubDate = pubDate;
		this.price = price;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
