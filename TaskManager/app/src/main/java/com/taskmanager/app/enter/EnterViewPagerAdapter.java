package com.taskmanager.app.enter;

import android.app.FragmentManager;
import android.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Monstr on 17.06.2014.
 */
public class EnterViewPagerAdapter extends android.support.v13.app.FragmentPagerAdapter {

    private List<Fragment> fragments;


    public EnterViewPagerAdapter(FragmentManager fm) {
        super(fm);
        this.fragments=new ArrayList<Fragment>();
        fragments.add(new FragmentLogin());
        fragments.add(new FragmentRegistr());
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
