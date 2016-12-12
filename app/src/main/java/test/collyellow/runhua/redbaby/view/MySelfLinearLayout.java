package test.collyellow.runhua.redbaby.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by collyellow on 2016/12/9.
 */

public class MySelfLinearLayout extends LinearLayout {

    private float startY;
    private int measuredHeight;
    private View view;
    private View view1;

    public MySelfLinearLayout(Context context) {
        this(context, null);
    }

    public MySelfLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MySelfLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getChildAt(0).measure(widthMeasureSpec, heightMeasureSpec);
        measuredHeight = getChildAt(0).getMeasuredHeight();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        view = getChildAt(0);
        view1 = getChildAt(1);
        view.setAlpha(1);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float endY = event.getY();
                Log.e("yyyy",endY+"--------"+startY);
                float y = getY();
                float dy = endY - startY;
                if (dy + y>= 0) {
                    view.setAlpha(y/100);
                } else {
                    view.setAlpha(0);
                }
//                scrollBy(0, -(int) (endY - startY));
                setTranslationY((int)(y+dy));
//                startY = endY;
                break;
            case MotionEvent.ACTION_UP:
                float y1 = view1.getY();
                if (y1<0){
                    view1.setY(0);
                }else {
                    view1.setY(measuredHeight/2);
                }
                break;
        }
        return true;
    }
}
