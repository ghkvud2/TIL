package strategy.book.interfaces;

import strategy.book.model.Book;

public interface PricePolicy {
    public int calcPrice(int price, int numOfBook);
}
