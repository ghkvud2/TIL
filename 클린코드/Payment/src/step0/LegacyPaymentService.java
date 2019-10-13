package step0;

import common.Discount;
import common.DiscountRequest;
import common.PaymentRequest;
import common.PaymentService;

public class LegacyPaymentService implements PaymentService {

    //실시간 할인내역 확인
    @Override
    public Discount getDiscount(DiscountRequest request) {
        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();
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
        return new Discount(discountAmt);
    }


    @Override
    public void payment(PaymentRequest request) {

        long productAmt = request.getProductAmt();
        String discountCode = request.getDiscountCode();

        long paymentAmt = 0;

        if ("NAVER".equals(discountCode)) {
            paymentAmt = (long) (productAmt * .1);
        } else if ("DANAWA".equals(discountCode)) {
            paymentAmt = (long) (productAmt * .15);
        } else if ("FANCAFE".equals(discountCode)) {
            if (productAmt < 1000)
                paymentAmt = productAmt;
            else
                paymentAmt = paymentAmt - 1000;
        } else
            paymentAmt = productAmt;

    }
}
