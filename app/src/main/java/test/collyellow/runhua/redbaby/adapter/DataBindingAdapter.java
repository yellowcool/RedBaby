package test.collyellow.runhua.redbaby.adapter;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import test.collyellow.runhua.redbaby.App;

/**
 * Created by collyellow on 2016/12/9.
 */

public class DataBindingAdapter {
    @BindingAdapter({"bind:loadImageId","bind:placeHolder"})
    public static void loadImage(ImageView view, int id, Drawable drawable){
        Glide.with(App.context).load(id).placeholder(drawable).into(view);
    }
}
