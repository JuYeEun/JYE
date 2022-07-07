package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    int mNumOfTabs;

    public MyPagerAdapter(@NonNull FragmentManager fm, int numTabs) {
        super(fm);
        this.mNumOfTabs = numTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                Fragment_1 tab1 = new Fragment_1();
                return tab1;
            case 1 :
                Fragment_2 tab2 = new Fragment_2();
                return tab2;
            default:
                return null;
        }

    }


    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
