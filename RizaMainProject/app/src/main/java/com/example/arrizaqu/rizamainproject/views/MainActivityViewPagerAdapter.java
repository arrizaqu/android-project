package com.example.arrizaqu.rizamainproject.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.arrizaqu.rizamainproject.fragments.FragmentAboutUs;
import com.example.arrizaqu.rizamainproject.fragments.FragmentRush;
import com.example.arrizaqu.rizamainproject.fragments.MeetABrow;

/**
 * Created by arrizaqu on 02/06/2017.
 */

public class MainActivityViewPagerAdapter extends FragmentStatePagerAdapter {
    public MainActivityViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragmentViewPager;
        switch (position){
            case 0 :
                    fragmentViewPager = FragmentAboutUs.newInstance();
                break;
            case 1 :
                fragmentViewPager = FragmentRush.newInstance();
                break;
            case 2 :
                fragmentViewPager = MeetABrow.newInstance();
                break;
            default :
                fragmentViewPager = null;
        }

        return fragmentViewPager;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch(position){
            case 0 :
                title = "About Us";
                break;
            case 1 :
                title = "Rush";
                break;
            case 2:
                title = "Meet A Brow";
                break;
            default :
                title = null;
        }

        return title;
    }
}
