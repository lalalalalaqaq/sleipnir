package com.orange.sleipnir.repository.entity;

public class Address {

    private Long id;

    private String addressName;

    private Long userId;

    public Address() {
    }

    public Address(Long id, String addressName, Long userId) {
        this.id = id;
        this.addressName = addressName;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Address [id=" + id + ", addressName=" + addressName + ", userId=" + userId + "]";
    }

}
