package com.example.demo.Models;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;

    private String customer_name;
    private String customer_lastName;
    private String customerEmail;
    private String customer_pswd;

    @OneToMany(mappedBy = "orderCustomer")
    private Collection<Orderr> orders;


    @ApiModelProperty(notes = "The role of the customer")
    @ManyToOne()
    @JoinColumn(name = "role_id",nullable = false)
    private Role role;

    public Customer() {
    }

    public Customer(String customer_name, String customer_lastName, String customer_email, String customer_pswd, Collection<Orderr> orders, Role role) {
        this.customer_name = customer_name;
        this.customer_lastName = customer_lastName;
        this.customerEmail = customer_email;
        this.customer_pswd = customer_pswd;
        this.orders = orders;
        this.role = role;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_lastName() {
        return customer_lastName;
    }

    public void setCustomer_lastName(String customer_lastName) {
        this.customer_lastName = customer_lastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomer_pswd() {
        return customer_pswd;
    }

    public void setCustomer_pswd(String customer_pswd) {
        this.customer_pswd = customer_pswd;
    }

    public Collection<Orderr> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Orderr> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_lastName='" + customer_lastName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customer_pswd='" + customer_pswd + '\'' +
                ", orders=" + orders +
                '}';
    }
}
