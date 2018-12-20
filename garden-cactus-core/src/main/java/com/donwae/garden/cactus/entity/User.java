package com.donwae.garden.cactus.entity;

import com.fasterxml.jackson.annotation.JsonView;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * User Object
 * @auther Jeremy
 * 2018/10/15 下午5:17
 */
public class User {

    interface SimpleView {}
    interface DetailView extends SimpleView {}

    private String id;

    private String username;

    @NotBlank
    private String password;

    private Date birthday;

    @JsonView(SimpleView.class)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonView(SimpleView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(DetailView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @JsonView(DetailView.class)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
