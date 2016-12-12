package test.collyellow.runhua.redbaby.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import test.collyellow.runhua.redbaby.R;
import test.collyellow.runhua.redbaby.adapter.GoodDetailRecyclerViewAdapter;
import test.collyellow.runhua.redbaby.databinding.GoodDetailBinding;

/**
 * Created by collyellow on 2016/12/9.
 */
public class GoodDetailActivity extends AppCompatActivity {

    private GoodDetailBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.good_detail);
        binding.goodDetailRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.goodDetailRecyclerview.setAdapter(new GoodDetailRecyclerViewAdapter());
    }
}
