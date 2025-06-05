package com.orange.sleipnir.repository.model;

import java.math.BigDecimal;

public class Order {

    private Long id;
    private Long userId;
    private String orderNo;
    private BigDecimal amount;

    public Order() {
    }

    public Order(Long id, Long userId, String orderNo, BigDecimal amount) {
        this.id = id;
        this.userId = userId;
        this.orderNo = orderNo;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderNo='" + orderNo + '\'' +
                ", amount=" + amount +
                '}';
    }
}
