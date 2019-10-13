package step2;

import common.*;

public class PaymentService2 implements PaymentService {

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
        if ("NAVER".equals(discountCode))
            return new NaverDiscountPolicy();
        else if ("DANAWA".equals(discountCode))
            return new DanawaDiscountPolicy();
        else if ("FANCAFE".equals(discountCode))
            return new FancafeDiscountPolicy();
        else
            return Discountable.NONE;
    }
}
