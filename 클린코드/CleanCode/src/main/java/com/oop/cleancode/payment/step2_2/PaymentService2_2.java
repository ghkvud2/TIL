package com.oop.cleancode.payment.step2_2;


import com.oop.cleancode.payment.common.Discount;
import com.oop.cleancode.payment.common.DiscountRequest;
import com.oop.cleancode.payment.common.PaymentRequest;
import com.oop.cleancode.payment.common.PaymentService;

public class PaymentService2_2 implements PaymentService {

    private DiscounterFactory discounterFactory;

    public PaymentService2_2(DiscounterFactory discounterFactory) {
        this.discounterFactory = discounterFactory;
    }

    @Override
    public Discount getDiscount(DiscountRequest request) {
        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();
        Discountable discountPolicy = getDiscounter(discountCode);
        long discountAmt = discountPolicy.getDiscountAmt(productAmt);
        return new Discount(discountAmt);
    }

    @Override
    public void payment(PaymentRequest request) {
        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();
        Discountable discountPolicy = getDiscounter(discountCode);
        long paymentAmt = productAmt - discountPolicy.getDiscountAmt(productAmt);
    }

    private Discountable getDiscounter(String discountCode) {
        return discounterFactory.getDiscounter(discountCode);
    }
}
