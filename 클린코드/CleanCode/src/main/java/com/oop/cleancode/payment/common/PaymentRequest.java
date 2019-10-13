package com.oop.cleancode.payment.common;

public class PaymentRequest {

    private String discountCode;
    private long productAmt;

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public long getProductAmt() {
        return productAmt;
    }

    public void setProductAmt(long productAmt) {
        this.productAmt = productAmt;
    }
}
