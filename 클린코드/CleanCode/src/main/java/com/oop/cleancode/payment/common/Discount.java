package com.oop.cleancode.payment.common;

public class Discount {
    //할인 금액
    private long discountAmt;

    public Discount(long discountAmt) {
        this.discountAmt = discountAmt;
    }

    public long getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(long discountAmt) {
        this.discountAmt = discountAmt;
    }
}
