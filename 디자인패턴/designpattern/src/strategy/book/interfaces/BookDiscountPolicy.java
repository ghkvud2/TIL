package strategy.book.interfaces;

public class BookDiscountPolicy implements PricePolicy {
    @Override
    public int calcPrice(int price, int numOfBook) {
        return (int) (price * numOfBook * 0.95);
    }

}
