package test.collyellow.runhua.redbaby;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import java.util.ArrayList;
import java.util.List;

import test.collyellow.runhua.redbaby.adapter.ActivityViewPagerAdapter;
import test.collyellow.runhua.redbaby.databinding.ActivityMainBinding;
import test.collyellow.runhua.redbaby.fragment.HomeFragment;
import test.collyellow.runhua.redbaby.fragment.HotFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {
    private List<Fragment> fragments = new ArrayList<>();
    private ActivityMainBinding binding;
    private ActivityViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
        adapter = new ActivityViewPagerAdapter(getSupportFragmentManager(), fragments);
        binding.activityViewpager.setAdapter(adapter);
    }

    private void init() {
        binding.bottomNavigation
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE)
                .addItem(new BottomNavigationItem(R.drawable.bar_home_normal, "首页")).setActiveColor("#22000000").setInActiveColor("#ffffff").setBarBackgroundColor("#ff0000")
                .addItem(new BottomNavigationItem(R.drawable.bar_search_normal, "搜索"))
                .addItem(new BottomNavigationItem(R.drawable.bar_class_normal, "品牌"))
                .addItem(new BottomNavigationItem(R.drawable.bar_shopping_normal, "购物车"))
                .addItem(new BottomNavigationItem(R.drawable.bar_more_normal, "更多"))
                .initialise();
        binding.bottomNavigation.setTabSelectedListener(this);
        fragments.add(new HomeFragment());
        fragments.add(new HotFragment());
        fragments.add(new HotFragment());
        fragments.add(new HotFragment());
        fragments.add(new HotFragment());
    }

    @Override
    public void onTabSelected(int position) {
        binding.activityViewpager.setCurrentItem(position);
        Log.e("position",position+"=====");
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
