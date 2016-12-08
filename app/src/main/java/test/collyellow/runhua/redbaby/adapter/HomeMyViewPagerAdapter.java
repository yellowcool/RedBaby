package test.collyellow.runhua.redbaby.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by collyellow on 2016/12/8.
 */

public class HomeMyViewPagerAdapter extends PagerAdapter {
    public HomeMyViewPagerAdapter(List<ImageView> lists) {
        this.lists = lists;
    }

    private List<ImageView> lists;

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(lists.get(position));
        return lists.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(lists.get(position));
    }
}
