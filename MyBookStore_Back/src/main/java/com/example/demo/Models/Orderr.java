package com.example.demo.Models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "orderr")
public class Orderr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long order_id;

    private Date creation_date;
    private float totalPrice;

    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer orderCustomer;

    @ManyToMany(mappedBy = "orders")
    private Collection<Book> order_books;

    public Orderr() {
    }

    public Orderr(Date creation_date, float totalPrice, Customer order_customer, Collection<Book> order_books) {
        this.creation_date = creation_date;
        this.totalPrice = totalPrice;
        this.orderCustomer = order_customer;
        this.order_books = order_books;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Customer getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(Customer orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Collection<Book> getOrder_books() {
        return order_books;
    }

    public void setOrder_books(Collection<Book> order_books) {
        this.order_books = order_books;
    }

    @Override
    public String toString() {
        return "Orderr{" +
                "order_id=" + order_id +
                ", creation_date=" + creation_date +
                ", totalPrice=" + totalPrice +
                ", orderCustomer=" + orderCustomer +
                ", order_books=" + order_books +
                '}';
    }
}
