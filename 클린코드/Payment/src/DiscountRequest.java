

public class DiscountRequest {

    private String discountCode; // 할인코드
    private long productAmt;    // 상품 가격

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
