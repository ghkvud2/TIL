package common;

public interface PaymentService {

    // 실시간 할인내역 확인
    Discount getDiscount(DiscountRequest request);

    // 결제처리
    void payment(PaymentRequest request);
}
