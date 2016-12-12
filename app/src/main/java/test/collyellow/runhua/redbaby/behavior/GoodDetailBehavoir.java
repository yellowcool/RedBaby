package test.collyellow.runhua.redbaby.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import test.collyellow.runhua.redbaby.view.MySelfLinearLayout;

/**
 * Created by collyellow on 2016/12/9.
 */

public class GoodDetailBehavoir extends CoordinatorLayout.Behavior {
    private MySelfLinearLayout mDependency;
    public GoodDetailBehavoir(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof MySelfLinearLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        mDependency = (MySelfLinearLayout) dependency;
        child.setY(dependency.getY()+dependency.getHeight());
        Log.e("dependency",mDependency.getY()+"========"+mDependency.getHeight());
        return true;
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return true;
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {


        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dx, int dy, int[] consumed) {

        mDependency.setY(-dy+mDependency.getY());
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed);
    }

}
