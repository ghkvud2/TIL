package com.oop.cleancode.payment.step2;

/**
 * Created by redutan on 2016. 4. 1..
 */
class FancafeDiscountPolicy implements Discountable {
    private long discountAmt = 1000L;

    @Override
    public long getDiscountAmt(long originAmt) {
        if (originAmt < discountAmt)
            return originAmt;
        return discountAmt;
    }
}
