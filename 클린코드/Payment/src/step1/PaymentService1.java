package step1;

import common.Discount;
import common.DiscountRequest;
import common.PaymentRequest;
import common.PaymentService;

public class PaymentService1 implements PaymentService {
    @Override
    public Discount getDiscount(DiscountRequest request) {
        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();
        long discountAmt = getDiscountAmt(discountCode, productAmt);
        return new Discount(discountAmt);
    }


    @Override
    public void payment(PaymentRequest request) {

        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();
        long paymentAmt = productAmt - getDiscountAmt(discountCode, productAmt);
    }

    private long getDiscountAmt(String discountCode, long productAmt) {
        long discountAmt = 0;
        if ("NAVER".equals(discountCode)) {
            discountAmt = (long) (productAmt * .1);
        } else if ("DANAWA".equals(discountCode)) {
            discountAmt = (long) (productAmt * .15);
        } else if ("FANCAFE".equals(discountCode)) {
            if (productAmt < 1000)
                discountAmt = productAmt;
            else
                discountAmt = 1000;
        }
        return discountAmt;
    }
}
