package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="roles")
public class Role {

    @ApiModelProperty(notes = "The database generated book ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long role_id;

    private String role_name;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "role")
    private Set<Customer> customers;

    public Role() {
    }

    public Role(String role_name, Set<Customer> customers) {
        this.role_name = role_name;
        this.customers = customers;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
