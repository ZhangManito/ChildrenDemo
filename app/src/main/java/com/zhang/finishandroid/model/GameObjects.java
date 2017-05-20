package com.zhang.finishandroid.model;

/**
 * Created by 张国梁 on 2017/5/20.
 */

public class GameObjects {
    int ImageId;
    String title;

    public GameObjects() {
    }

    public GameObjects(int imageId, String title) {
        ImageId = imageId;
        this.title = title;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
