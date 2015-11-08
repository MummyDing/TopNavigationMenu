package com.demo.mummyding.topnavigationmenu;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.demo.mummyding.topnavigationmenu.adapter.FragmentPagerAdapter;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    private SmartTabLayout smartTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        smartTabLayout = (SmartTabLayout) findViewById(R.id.smarttab);
        adapter = new FragmentPagerAdapter(getSupportFragmentManager(),8);
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
    }
}
