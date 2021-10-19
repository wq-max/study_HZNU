package com.ay.model;

import java.io.Serializable;

public class AyUser implements Serializable {

    private Integer id;
    private String name;
    private String password;

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
