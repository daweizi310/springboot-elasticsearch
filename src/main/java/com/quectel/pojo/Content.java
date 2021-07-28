package com.quectel.pojo;

import java.io.Serializable;

/**
 * @Description: 抓取内容
 * @Author: Maxton.Zhang
 * @Date: 2021/7/22 14:57
 * @Version 1.0
 */
public class Content implements Serializable {
    private String title;
    private String price;
    private String img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
