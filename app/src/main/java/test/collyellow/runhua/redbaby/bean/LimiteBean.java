package test.collyellow.runhua.redbaby.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import test.collyellow.runhua.redbaby.BR;


/**
 * Created by collyellow on 2016/12/9.
 */

public class LimiteBean extends BaseObservable {
    private String title;
    private int oldPrice;
    private int newPrice;
    private int imageId;

    public LimiteBean(String title, int newPrice, int oldPrice, int imageId) {
        this.title = title;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
        this.imageId = imageId;
    }

    @Bindable
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
        notifyPropertyChanged(BR.imageId);
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public int getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(int oldPrice) {
        this.oldPrice = oldPrice;
        notifyPropertyChanged(BR.oldPrice);
    }

    @Bindable
    public int getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(int newPrice) {
        this.newPrice = newPrice;
        notifyPropertyChanged(BR.newPrice);
    }
}
