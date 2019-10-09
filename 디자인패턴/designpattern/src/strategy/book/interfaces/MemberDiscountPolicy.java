package strategy.book.interfaces;

public class MemberDiscountPolicy implements PricePolicy {
    @Override
    public int calcPrice(int price, int numOfBook) {
        return (int) (price * numOfBook * 0.9);
    }
}
