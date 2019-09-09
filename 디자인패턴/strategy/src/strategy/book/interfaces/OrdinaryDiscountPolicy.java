package strategy.book.interfaces;

public class OrdinaryDiscountPolicy implements PricePolicy {
    @Override
    public int calcPrice(int price, int numOfBook) {
        return price * numOfBook;
    }
}
