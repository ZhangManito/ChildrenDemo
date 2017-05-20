package com.zhang.finishandroid.model;

/**
 * Created by Administrator on 2017/5/20.
 */

public class Games {
    String title;
    int images;
    String content;

    public Games() {
    }

    public Games(String title, int images, String content) {
        this.title = title;
        this.images = images;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
