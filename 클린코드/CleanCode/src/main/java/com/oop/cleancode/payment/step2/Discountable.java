package com.oop.cleancode.payment.step2;

public interface Discountable {


    Discountable NONE = (originAmt) -> 0;

    long getDiscountAmt(long originAmt);

}
