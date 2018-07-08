package com.example.szh.welcome;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Xcircleindicator mXcircleindicator;
    List<View> lisViews=new ArrayList<View>();
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPager = findViewById(R.id.ViewPager);
        mXcircleindicator =  findViewById(R.id.Xcircleindicator);
        //添加数据
        View view1 = LayoutInflater.from(this).inflate(R.layout.viewpager_item_one, null);
//        view1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("11111");
//            }
//        });
        lisViews.add(view1);
        lisViews.add(LayoutInflater.from(this).inflate(R.layout.viewpager_item_one, null));
        lisViews.add(LayoutInflater.from(this).inflate(R.layout.viewpager_item_one, null));

        ViewPagerAdapter mAdapter=new ViewPagerAdapter(lisViews);
        mPager.setAdapter(mAdapter);

        //设置总共的页数
        mXcircleindicator.initData(lisViews.size(), 0);
        //设置当前的页面
        mXcircleindicator.setCurrentPage(0);
        mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                mXcircleindicator.setCurrentPage(arg0);

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {


            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
}
