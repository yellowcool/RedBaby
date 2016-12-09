package test.collyellow.runhua.redbaby.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import test.collyellow.runhua.redbaby.App;
import test.collyellow.runhua.redbaby.R;
import test.collyellow.runhua.redbaby.adapter.LimiteActivityRecyclerAdapter;
import test.collyellow.runhua.redbaby.bean.LimiteBean;
import test.collyellow.runhua.redbaby.databinding.ActivityLimiteBinding;

/**
 * Created by collyellow on 2016/12/9.
 */
public class LimiteTimeActivity extends AppCompatActivity {

    private ActivityLimiteBinding binding;
    private List<LimiteBean> lists = new ArrayList<>();
    private LimiteActivityRecyclerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_limite);
        initData();
        init();
    }



    private void initData() {
        lists.add(new LimiteBean("乳加力胶囊", 68, 48, R.mipmap.category_diaper01));
        lists.add(new LimiteBean("乳加力胶囊", 63, 40, R.mipmap.category_food01));
        lists.add(new LimiteBean("乳加力胶囊", 66, 54, R.mipmap.category_mama01));
        lists.add(new LimiteBean("乳加力胶囊", 68, 48, R.mipmap.category_milk01));
        lists.add(new LimiteBean("乳加力胶囊", 168, 65, R.mipmap.category_vehicle01));
        lists.add(new LimiteBean("乳加力胶囊", 100, 88, R.mipmap.category_wash01));
        lists.add(new LimiteBean("乳加力胶囊", 68, 48, R.mipmap.category_diaper01));
        lists.add(new LimiteBean("乳加力胶囊", 63, 40, R.mipmap.category_food01));
        lists.add(new LimiteBean("乳加力胶囊", 66, 54, R.mipmap.category_mama01));
        lists.add(new LimiteBean("乳加力胶囊", 68, 48, R.mipmap.category_milk01));
        lists.add(new LimiteBean("乳加力胶囊", 168, 65, R.mipmap.category_vehicle01));
        lists.add(new LimiteBean("乳加力胶囊", 100, 88, R.mipmap.category_wash01));
    }
    private void init() {
        adapter = new LimiteActivityRecyclerAdapter(lists);
        adapter.setOnLimiteRecyclerItemsClicked(new LimiteActivityRecyclerAdapter.OnLimiteRecyclerItemsClickedListener() {
            @Override
            public void onLimiteRecyclerItemsClicked(View view,int position) {
                Intent intent = new Intent(App.context,GoodDetailActivity.class);
                startActivity(intent);
                Toast.makeText(LimiteTimeActivity.this, "view id is : "+position, Toast.LENGTH_SHORT).show();
            }
        });
        binding.limiteActivityRecyclerview.setLayoutManager(new LinearLayoutManager(App.context));
        binding.limiteActivityRecyclerview.setAdapter(adapter);
    }
}
