package test.collyellow.runhua.redbaby.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import test.collyellow.runhua.redbaby.R;

/**
 * Created by collyellow on 2016/12/9.
 */
public class GoodDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.good_detail);
    }
}
