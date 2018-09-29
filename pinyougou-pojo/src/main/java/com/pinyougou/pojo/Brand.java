package com.pinyougou.pojo;

import java.io.Serializable;

/**
 * 品牌实体类
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2018-09-27<p>
 */
public class Brand implements Serializable {
    private Long id;
    private String name;
    private String firstChar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
