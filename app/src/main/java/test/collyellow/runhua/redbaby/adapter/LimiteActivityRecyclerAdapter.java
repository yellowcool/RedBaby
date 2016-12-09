package test.collyellow.runhua.redbaby.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import test.collyellow.runhua.redbaby.App;
import test.collyellow.runhua.redbaby.BR;
import test.collyellow.runhua.redbaby.R;
import test.collyellow.runhua.redbaby.bean.LimiteBean;
import test.collyellow.runhua.redbaby.holder.LimiteActivityRecyclerHolder;

/**
 * Created by collyellow on 2016/12/9.
 */

public class LimiteActivityRecyclerAdapter extends RecyclerView.Adapter<LimiteActivityRecyclerHolder> {
    private List<LimiteBean> list;
    private OnLimiteRecyclerItemsClickedListener listener;
    private ViewDataBinding binding;

    public LimiteActivityRecyclerAdapter(List<LimiteBean> list) {
        this.list = list;
    }

    public interface OnLimiteRecyclerItemsClickedListener {
        void onLimiteRecyclerItemsClicked(View view,int position);
    }

    public void setOnLimiteRecyclerItemsClicked(OnLimiteRecyclerItemsClickedListener listener) {
        this.listener = listener;
    }

    @Override
    public LimiteActivityRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(App.context), R.layout.limit_recycler_items, parent, false);
        return new LimiteActivityRecyclerHolder(binding);
    }

    @Override
    public void onBindViewHolder(LimiteActivityRecyclerHolder holder, final int position) {
        holder.getBinding().setVariable(BR.item, list.get(position));
        holder.getBinding().executePendingBindings();
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null) {
                    listener.onLimiteRecyclerItemsClicked(view,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
