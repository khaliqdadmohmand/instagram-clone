package com.emericoapp.instagram.model;

public class PostModel {
    public String name;
    public int image;
    public int postImg;
    public String date;
    public String description;

    public PostModel(String name, int image, int postImg, String date, String description) {
        this.name = name;
        this.image = image;
        this.postImg = postImg;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPostImg() {
        return postImg;
    }

    public void setPostImg(int postImg) {
        this.postImg = postImg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
