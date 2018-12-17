package com.sunone.springboot.entity;

import java.sql.Date;

public class College {
    private int cid;
    private String cname;
    private String caddress;
    private String cpic;
    private  Date createtime;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCaddress() {
        return caddress;
    }
    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }
    public String getCpic() {
        return cpic;
    }
    public void setCpic(String cpic) {
        this.cpic = cpic;
    }
    public Date getCreatetime() {
        return createtime;
    }
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }



}