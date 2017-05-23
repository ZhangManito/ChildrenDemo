package com.zhang.finishandroid;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;

public class WelcomePageActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private final static int[] IMAGE_ID={
            R.drawable.guid_1,
            R.drawable.guid_2,
            R.drawable.guid_3,
            R.drawable.guid_4,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mViewPager = (ViewPager) findViewById(R.id.welcome_view_pager);
        mViewPager.setAdapter(new Adapter());
    }
    class Adapter extends PagerAdapter{

        @Override
        public int getCount() {
            return IMAGE_ID.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
            container.removeView((View) object);
        }

        @Override
        public View instantiateItem(ViewGroup container, int position) {
            ImageView imageView=new ImageView(WelcomePageActivity.this);
            imageView.setBackgroundResource(IMAGE_ID[position]);
            container.addView(imageView);
            return imageView;
        }
    }
}
