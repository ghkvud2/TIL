public interface Discountable {


    Discountable NONE = (originAmt) -> 0;

    long getDiscountAmt(long originAmt);

}
