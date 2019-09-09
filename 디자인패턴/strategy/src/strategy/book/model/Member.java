package strategy.book.model;

public class Member {

    private String name;
    private int accPrice;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccPrice() {
        return accPrice;
    }

    public void setAccPrice(int accPrice) {
        this.accPrice = accPrice;
    }

    public void addPrice(int price) {
        this.accPrice += price;
    }
}
