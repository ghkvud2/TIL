package strategy.book;

import strategy.book.interfaces.BookDiscountPolicy;
import strategy.book.interfaces.MemberDiscountPolicy;
import strategy.book.interfaces.OrdinaryDiscountPolicy;
import strategy.book.model.Book;
import strategy.book.model.Member;
import strategy.book.model.Rental;

public class BookMain {

    public static void main(String[] args) {
        Member member1 = new Member("이화평");
        Member member2 = new Member("김주현");

        Book book1 = new Book("디자인패턴", 2005, 10000);
        Book book2 = new Book("토비의 스프링", 2001, 60000);
        Book book3 = new Book("헤드퍼스트 디자인패턴", 2005, 20000);

        Rental rental1 = new Rental(member1, book1, 2, new OrdinaryDiscountPolicy());
        Rental rental2 = new Rental(member2, book2, 3, new BookDiscountPolicy());
        Rental rental3 = new Rental(member2, book3, 1, new MemberDiscountPolicy());

        System.out.println(rental1.getPrice());
        System.out.println(rental2.getPrice());
        System.out.println(rental3.getPrice());
    }

}
