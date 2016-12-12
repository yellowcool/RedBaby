package test.collyellow.runhua.redbaby.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import test.collyellow.runhua.redbaby.App;
import test.collyellow.runhua.redbaby.R;
import test.collyellow.runhua.redbaby.holder.GoodDetailRecyclerViewHolder;

/**
 * Created by collyellow on 2016/12/12.
 */

public class GoodDetailRecyclerViewAdapter extends RecyclerView.Adapter {
    public GoodDetailRecyclerViewAdapter(){

    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(App.context,R.layout.good_detail_recycler_items,null);
        return new GoodDetailRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
