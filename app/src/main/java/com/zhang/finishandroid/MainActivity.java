package com.zhang.finishandroid;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.zhang.finishandroid.fragment.HomePageFragment;
import com.zhang.finishandroid.fragment.OldPracticeFragment;
import com.zhang.finishandroid.fragment.PersonalFragment;
import com.zhang.finishandroid.fragment.TimeFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager mHome_viewPager;
    private TabLayout mHome_tabLayout;
    private Menu mMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHome_viewPager = (ViewPager) findViewById(R.id.home_view_pager);
        mHome_tabLayout = (TabLayout) findViewById(R.id.home_tab_layout);
        mMenu=new MenuBuilder(this);
        getMenuInflater().inflate(R.menu.tab_values,mMenu);
        mHome_viewPager.setAdapter(new Adapter(getSupportFragmentManager()));
        mHome_tabLayout.setupWithViewPager(mHome_viewPager);
        for (int i = 0; i < mMenu.size(); i++) {
            TabLayout.Tab tab = mHome_tabLayout.getTabAt(i);
            MenuItem item=mMenu.getItem(i);
            tab.setCustomView(getTabView(item,i));
        }
    }

    private View getTabView(MenuItem item, int i) {
        View view=View.inflate(this,R.layout.tab_item,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.iv_nav_item);
        imageView.setImageDrawable(item.getIcon());
        return view;
    }

    class Adapter extends FragmentPagerAdapter {

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment=new HomePageFragment();
                    break;
                case 1:
                    fragment=new OldPracticeFragment();
                    break;
                case 2:
                    fragment=new TimeFragment();
                    break;
                case 3:
                    fragment=new PersonalFragment();
                    break;
                default:
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return mMenu.size();
        }
    }
}
