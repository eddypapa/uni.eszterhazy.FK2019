package hu.uni.eszterhazy.swtest.api.model;

import java.util.Date;

public class BookInstance {

    private Long inventoryNo;
    private Book book;
    private Date parachuted;
    private double price;

    public BookInstance(Long inventoryNo, Book book, Date parachased, double price) {
        this.inventoryNo = inventoryNo;
        this.book = book;
        this.parachuted = parachased;
        this.price = price;
    }

    public Long getInventoryNo() {
        return inventoryNo;
    }

    public Book getBook() {
        return book;
    }

    public Date getParachuted() {
        return parachuted;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookInstance{" +
                "inventoryNo=" + inventoryNo +
                ", book=" + book +
                ", parachuted=" + parachuted +
                ", price=" + price +
                '}';
    }
}
