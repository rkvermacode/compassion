package com.rk.developer.study.network.compassion;

import android.widget.ImageView;
import android.widget.TextView;

public class Models {
   private String topText;
   private String bottomText;
   private int imageView;
   private String subText;
   private String bootomSubText;

    public Models(String topText, String bottomText, int imageView, String subText,String bootomSubText) {
        this.topText = topText;
        this.bottomText = bottomText;
        this.imageView = imageView;
        this.subText = subText;
        this.bootomSubText = bootomSubText;
    }

    public String getBootomSubText() {
        return bootomSubText;
    }

    public void setBootomSubText(String bootomSubText) {
        this.bootomSubText = bootomSubText;
    }

    public String getTopText() {
        return topText;
    }

    public void setTopText(String topText) {
        this.topText = topText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }
}
