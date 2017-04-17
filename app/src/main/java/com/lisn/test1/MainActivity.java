package com.lisn.test1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.ButterKnife;
import butterknife.InjectView;

import static android.R.attr.fragment;

public class MainActivity extends AppCompatActivity {


    @InjectView(R.id.tabs)
    PagerSlidingTabStrip tabs;
    @InjectView(R.id.pager)
    ViewPager pager;
    @InjectView(R.id.activity_main)
    LinearLayout activityMain;

    /**
     * 获取当前屏幕的密
     */
    private DisplayMetrics dm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        dm = getResources().getDisplayMetrics();
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        /*
        * viewpager每次切换的时候， 会重新创建当前界面及左右界面三个界面， 每次切换都要重新oncreate,
        * 所以只要设置viewPager setOffscreenPageLimit即可避免这个问题。
            viewPager.setOffscreenPageLimit(3);表示三个界面之间来回切换都不会重新加载
        * */
        pager.setOffscreenPageLimit(3);
        tabs.setViewPager(pager);
        setTabsValue();
    }
    /**
     * 对PagerSlidingTabStrip的各项属性进行赋值
     */
    private void setTabsValue() {
        // 设置Tab是自动填充满屏幕
        tabs.setShouldExpand(true);
        // 设置Tab的分割线是�?�明�?
        tabs.setDividerColor(Color.TRANSPARENT);
        // 设置Tab底部线的高度
        // tabs.setUnderlineHeight((int)
        // TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, dm));
        // 设置Tab Indicator的高�?
        // tabs.setIndicatorHeight((int)
        // TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, dm));
        // 设置Tab标题文字的大�?
        tabs.setTextSize((int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 16, dm));
        // 设置Tab Indicator的颜�?
        tabs.setIndicatorColor(Color.parseColor("#205b20"));
        // 设置选中Tab文字的颜�? (这是我自定义的一个方�?)
        tabs.setSelectedTextColor(Color.parseColor("#515151"));
        tabs.setTextColor(Color.parseColor("#7d7d7d"));
        // 取消点击Tab时的背景�?
        tabs.setTabBackground(R.drawable.tab_bg);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        private final String[] titles = getResources().getStringArray(R.array.Fragments);

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            switch (position){
                case 0:
                    fragment=new fragment1();
                    break;
                case 1:
                    fragment=new fragment2();
                    break;
                case 2:
                    fragment=new fragment3();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return titles.length;
        }


    }
}
