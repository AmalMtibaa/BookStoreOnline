package com.example.demo.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "promotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long promotion_id;
    private int promotion_percentage;

    @ManyToMany(mappedBy = "book_promotions")
    private Collection<Book> promotion_books;

    public Promotion() {
    }

    public Promotion(int promotion_percentage, Collection<Book> promotion_books) {
        this.promotion_percentage = promotion_percentage;
        this.promotion_books = promotion_books;
    }

    public Long getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(Long promotion_id) {
        this.promotion_id = promotion_id;
    }

    public int getPromotion_percentage() {
        return promotion_percentage;
    }

    public void setPromotion_percentage(int promotion_percentage) {
        this.promotion_percentage = promotion_percentage;
    }

    public Collection<Book> getPromotion_books() {
        return promotion_books;
    }

    public void setPromotion_books(Collection<Book> promotion_books) {
        this.promotion_books = promotion_books;
    }
}
