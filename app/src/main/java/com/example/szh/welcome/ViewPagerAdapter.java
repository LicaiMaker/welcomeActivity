package com.example.szh.welcome;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private List<View> lisViews;


    public ViewPagerAdapter(List<View>  lisViews) {
        this.lisViews=lisViews;
    }
    @Override
    public int getCount() {
        return lisViews.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull View container, int position, @NonNull Object object) {
        ((ViewPager) container).removeView(lisViews.get(position));//删除页卡
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull View container, int position) {
        ((ViewGroup) container).addView(lisViews.get(position), 0);//添加页卡
        return lisViews.get(position);
    }
}
