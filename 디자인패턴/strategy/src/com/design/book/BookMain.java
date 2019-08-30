package com.design.book;

import com.design.book.interfaces.BookDiscountPricePolicy;
import com.design.book.interfaces.MemberDiscountPricePolicy;
import com.design.book.interfaces.OrdinaryPricePolicy;
import com.design.book.model.Book;
import com.design.book.model.Member;
import com.design.book.model.Rent;

public class BookMain {

	public static void main(String[] args) {

		Member member1 = new Member("member1", 0);
		Member member2 = new Member("member2", 0);

		Book book1 = new Book("book1", "2001", 1000);
		Book book2 = new Book("book2", "2002", 2000);
		Book book3 = new Book("book3", "2003", 3000);

		Rent rent1 = new Rent(member1, book1, new OrdinaryPricePolicy(), 2);
		Rent rent2 = new Rent(member2, book2, new OrdinaryPricePolicy(), 3);
		Rent rent3 = new Rent(member1, book3, new BookDiscountPricePolicy(), 2);
		Rent rent4 = new Rent(member2, book2, new MemberDiscountPricePolicy(), 2);

		System.out.println(rent1.getPrice());
		System.out.println(rent2.getPrice());
		System.out.println(rent3.getPrice());
		System.out.println(rent4.getPrice());

	}
}
