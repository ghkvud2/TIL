package step2;

public class DanawaDiscountPolicy implements Discountable {
    @Override
    public long getDiscountAmt(long originAmt) {
        return (long)(originAmt * .15);
    }

}
