package test.collyellow.runhua.redbaby.holder;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by collyellow on 2016/12/9.
 */

public class LimiteActivityRecyclerHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {
  private T binding;
    public LimiteActivityRecyclerHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public T getBinding(){
        return binding;
    }
}
