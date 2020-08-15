package com.example.madminiproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numberoftabs;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        this.numberoftabs = numberoftabs;
    }

    //https://www.youtube.com/watch?v=B7ohofe-Nk8
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new newquiz_bim();
            case 1:
                return new tab2();
            case 2:
                return new tab3();
            case 3:
                return new tab4();
            default:
                return null;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
