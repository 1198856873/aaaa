package com.example.lenovo.h1705a_qizhongtest.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lenovo on 2017/12/29.
 */
@Entity
public class SQL  {
    @Id(autoincrement = true)
    private Long id;
    private String string;
    @Generated(hash = 1396386023)
    public SQL(Long id, String string) {
        this.id = id;
        this.string = string;
    }
    @Generated(hash = 1055771633)
    public SQL() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getString() {
        return this.string;
    }
    public void setString(String string) {
        this.string = string;
    }
    
}
