package com.demo.mummyding.topnavigationmenu.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.demo.mummyding.topnavigationmenu.fragment.BlankFragment;

/**
 * Created by mummyding on 15-11-8.
 */
public class FragmentPagerAdapter extends FragmentStatePagerAdapter {
    private int COUNT;
    public FragmentPagerAdapter(FragmentManager fm,int size) {
        super(fm);
        COUNT = size;
    }

    @Override
    public Fragment getItem(int position) {
        BlankFragment blankFragment = new BlankFragment();
        Bundle bundle = new Bundle();
        bundle.putString("pos",position+"");
        blankFragment.setArguments(bundle);
        return blankFragment;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "标签页"+position;
    }
}
