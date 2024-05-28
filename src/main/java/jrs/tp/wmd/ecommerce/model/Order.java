package jrs.tp.wmd.ecommerce.model;


import java.util.Date;

public class Order {
    private long id;
    private Customer customer;
    private Date orderDate;

    // Default constructor
    public Order() {
    }

    // Parameterized constructor
    public Order(long id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.orderDate = new Date();  // Initializing with the current date
    }

    // Getter for id
    public long getId() {
        return id;
    }

    // Setter for id
    public void setId(long id) {
        this.id = id;
    }

    // Getter for orderDate
    public Date getOrderDate() {
        return orderDate;
    }

    // Setter for orderDate
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    // Getter for customer
    public Customer getCustomer() {
        return customer;
    }

    // Setter for customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
