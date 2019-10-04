package com.example.demo.Models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "book")
@ApiModel(description = "Propreties of a book in the dataBase")
public class Book {
    @ApiModelProperty(notes = "The database generated book ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long book_id;

    @ApiModelProperty(notes = "book name")
    private String book_name;
    @ApiModelProperty(notes = "The name of the author")
    private String book_author;
    @ApiModelProperty(notes = "The price od the book")
    private float book_price;
    @ApiModelProperty(notes = "The quantity that the store has od the book")
    private int quantity;
    @ApiModelProperty(notes = "The photo of the book")
    private String book_photoURL;

    @ApiModelProperty(notes = "The category of the book")
    @ManyToOne()
    @JoinColumn(name = "bookCategory_id",nullable = false)
    private BookCategory bookCategory;

    @ApiModelProperty(notes = "The orders that has this book")
    @ManyToMany
    @JoinTable(name = "orders_books",
            joinColumns = {
                    @JoinColumn(name = "book_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "order_id")}
    )
    private Set<Orderr> orders; //orders
    @ApiModelProperty(notes = "The list of promotions that this book involved")
    @ManyToMany
    @JoinTable(name = "promotion_books",
            joinColumns = {
                    @JoinColumn(name = "book_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "promotion_id")}
    )
    private Collection<Promotion> book_promotions;



    public Book() {

    }

    public Book(String book_name, String book_author, float book_price, int quantity, String book_photoURL, BookCategory bookCategory) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_price = book_price;
        this.quantity = quantity;
        this.book_photoURL = book_photoURL;
        this.bookCategory = bookCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBook_photoURL() {
        return book_photoURL;
    }

    public void setBook_photoURL(String book_photoURL) {
        this.book_photoURL = book_photoURL;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public float getBook_price() {
        return book_price;
    }

    public void setBook_price(float book_price) {
        this.book_price = book_price;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Set<Orderr> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orderr> orders) {
        this.orders = orders;
    }

    public Collection<Promotion> getBook_promotions() {
        return book_promotions;
    }

    public void setBook_promotions(Collection<Promotion> book_promotions) {
        this.book_promotions = book_promotions;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
