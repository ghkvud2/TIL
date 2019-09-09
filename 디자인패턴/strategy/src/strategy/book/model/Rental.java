package strategy.book.model;

import strategy.book.interfaces.PricePolicy;

public class Rental {
    private Member member;
    private Book book;
    private int numOfBook;
    private PricePolicy pricePolicy;

    public Rental(Member member, Book book, int numOfBook, PricePolicy pricePolicy) {
        this.member = member;
        this.book = book;
        this.numOfBook = numOfBook;
        this.pricePolicy = pricePolicy;
        this.member.addPrice(pricePolicy.calcPrice(book.getPrice(), this.numOfBook));
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getPrice() {
        return pricePolicy.calcPrice(this.book.getPrice(), this.numOfBook);
    }

}
