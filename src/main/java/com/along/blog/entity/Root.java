package com.along.blog.entity;

import java.util.Date;

public class Root {

    private Integer id ;
    private String username ;
    private String password ;
    private Integer powerId ;
    private Integer status ;
    private Date createTime ;

    public Root() {}

    public Root(Integer id, String username, String password, Integer powerId, Integer status, Date createTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.powerId = powerId;
        this.status = status;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
