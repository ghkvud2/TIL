package com.oop.cleancode.payment.step2;

public class NaverDiscountPolicy implements Discountable {
    @Override
    public long getDiscountAmt(long originAmt) {
        return (long) (originAmt * .1);
    }
}
