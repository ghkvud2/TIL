package strategy.book.model;

public class Book {
    private String name;
    private int pubYear;
    private int price;

    public Book(String name, int pubYear, int price) {
        this.name = name;
        this.pubYear = pubYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPubYear() {
        return pubYear;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
