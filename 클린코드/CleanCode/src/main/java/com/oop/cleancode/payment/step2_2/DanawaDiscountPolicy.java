package com.oop.cleancode.payment.step2_2;

public class DanawaDiscountPolicy implements Discountable {
    @Override
    public long getDiscountAmt(long originAmt) {
        return (long)(originAmt * .15);
    }

}
