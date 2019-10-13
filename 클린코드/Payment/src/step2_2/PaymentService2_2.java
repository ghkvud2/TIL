package step2_2;

import common.Discount;
import common.DiscountRequest;
import common.PaymentRequest;
import common.PaymentService;

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
