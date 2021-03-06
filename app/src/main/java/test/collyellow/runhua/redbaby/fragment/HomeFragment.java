package test.collyellow.runhua.redbaby.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import test.collyellow.runhua.redbaby.App;
import test.collyellow.runhua.redbaby.R;
import test.collyellow.runhua.redbaby.activity.LimiteTimeActivity;
import test.collyellow.runhua.redbaby.adapter.HomeMyViewPagerAdapter;
import test.collyellow.runhua.redbaby.databinding.HomeFragmentBinding;

/**
 * Created by collyellow on 2016/12/8.
 */

public class HomeFragment extends Fragment {

    private HomeFragmentBinding binding;
    private List<ImageView> lists = new ArrayList<>();
    private List<String> urls = new ArrayList<>();
    private HomeMyViewPagerAdapter homeMyViewPagerAdapter;

    public class Presenter {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.home_card_limit_time:
                    Intent intent = new Intent(App.context, LimiteTimeActivity.class);
                    startActivity(intent);
                    Log.e("limite", "limite");
                    break;
                case R.id.home_card_tuijian:
                    Log.e("tujina", "tuijina");
                    break;
                case R.id.home_card_cuxiao:
                    Log.e("cuxiao", "cuxiao");
                    break;
                case R.id.home_card_new:
                    Log.e("new", "newnwe");
                    break;
                case R.id.home_card_hot:
                    Log.e("hot", "hothot");
                    break;
                case R.id.search_ib:
                    Log.e("search", "serchimageButton");
                    break;
            }
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);
        binding.setPresenter(new Presenter());
        init();
        return binding.getRoot();
    }

    private void init() {
        urls.clear();
        lists.clear();
        urls.add("http://pic33.nipic.com/20130916/3420027_192919547000_2.jpg");
        urls.add("http://pic55.nipic.com/file/20141208/19462408_171130083000_2.jpg");
        urls.add("http://4493bz.1985t.com/uploads/allimg/150127/4-15012G52133.jpg");
        urls.add("http://img01.taopic.com/141116/318764-14111610353113.jpg");
        urls.add("http://pic69.nipic.com/file/20150614/20677594_124458962000_2.jpg");
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(App.context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            Glide.with(this).load(urls.get(i)).into(imageView);
            lists.add(imageView);
        }
        homeMyViewPagerAdapter = new HomeMyViewPagerAdapter(lists);
        binding.homeMyviewpager.setAdapter(homeMyViewPagerAdapter);
        for (int i = 0; i < urls.size(); i++) {
            View view = new View(App.context);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(30,30);
            params.leftMargin = 30;
            view.setLayoutParams(params);
            view.setBackgroundResource(R.drawable.viewpager_red_pot_selector);
            binding.viewpagerRedPot.addView(view);
        }
        binding.viewpagerRedPot.getChildAt(0).setSelected(true);
        binding.homeMyviewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0;i < urls.size();i++){
                    binding.viewpagerRedPot.getChildAt(i).setSelected(false);
                }
                binding.viewpagerRedPot.getChildAt(position).setSelected(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
