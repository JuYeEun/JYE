package com.cookandroid.jye;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpagerAdapter extends FragmentPagerAdapter {


    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position==0){

            return new CallFragment();

        }else if(position==1){

            return new ContactFragment();
        }else {

            return new StatusFragment();
        }
    }


    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPagerTitle(int position) {

        if(position==0){

            return "버스";

        }else if(position==1){

            return "정류장";
        }else {

            return "Status";
        }

    }
}
