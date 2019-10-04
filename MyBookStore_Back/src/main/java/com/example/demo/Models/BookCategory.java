package com.example.demo.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "bookcategoryTable")
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookCategory_id;
    private String category_name;
    private String category_color;
    private String category_description;


    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "bookCategory")
    private Set<Book> books=new HashSet<Book>();


    public BookCategory() {
    }

    public BookCategory(String category_name) {
        this.category_name = category_name;

    }

    public BookCategory(String category_name, String category_color, String category_description) {
        this.category_name = category_name;
        this.category_color = category_color;

    }

    public Long getBookCategory_id() {
        return bookCategory_id;
    }

    public void setBookCategory_id(Long bookCategory_id) {
        this.bookCategory_id = bookCategory_id;
    }


    public void setBooks(Set<Book> books) {
        this.books = books;
    }


    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_color() {
        return category_color;
    }

    public void setCategory_color(String category_color) {
        this.category_color = category_color;
    }

    public String getCategory_description() {
        return category_description;
    }

    public void setCategory_description(String category_description) {
        this.category_description = category_description;
    }
}
