package com.orange.sleipnir.repository.entity;

public class Order {

    private Long orderId;
    private Integer accountId;
    private Integer userId;

    public Order() {
    }

    public Order(Long orderId, Integer accountId, Integer userId) {
        this.orderId = orderId;
        this.accountId = accountId;
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", accountId=" + accountId + ", userId=" + userId + "]";
    }

}
