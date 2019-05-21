package com.example.tumblr.data.model;

public class Post {
    User user;
    String caption;
    String caption_title;
    int image_post;
    String note;

    public Post(User user, String caption, String caption_title, int image_post, String note) {
        this.user = user;
        this.caption = caption;
        this.caption_title = caption_title;
        this.image_post = image_post;
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public String getCaption() {
        return caption;
    }

    public String getCaption_title() {
        return caption_title;
    }

    public int getImage_post() {
        return image_post;
    }

    public String getNote() {
        return note;
    }
}
