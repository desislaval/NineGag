package com.example.android.ninegag;

import android.media.Image;
import android.widget.ImageButton;

public class PostItem {
    int imageTitle;
    int imageRes;
    int upButton;
    int downButton;

    public PostItem(int imageTitle, int imageRes, int upButton, int downButton) {
        this.imageTitle = imageTitle;
        this.imageRes = imageRes;
        this.upButton = upButton;
        this.downButton = downButton;
    }

    public void setUpButton(int upButton) {
        this.upButton = upButton;
    }

    public void setDownButton(int downButton) {
        this.downButton = downButton;
    }

    public int getImageRes() {
        return imageRes;
    }

    public int getImageTitle() {
        return imageTitle;
    }
}
