package com.example.grebannyirecyclerview;

import java.io.Serializable;

public class ItemModel implements Serializable  {
    private String name2;
    private String phoneNumber;

    public ItemModel(String name, String phoneNumber) {
        this.name2 = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName2() {
        return name2;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
