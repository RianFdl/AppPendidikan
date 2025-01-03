package com.example.edu_app;
public class TrendingItem {
    private String title;
    private int likes;
    private int imageResId;

    public TrendingItem(String title, int likes, int imageResId) {
        this.title = title;
        this.likes = likes;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public int getImageResId() {
        return imageResId;
    }
}