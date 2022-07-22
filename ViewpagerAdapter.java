package com.cookandroid.jye;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    //////0722
    private final List<Fragment> listF = new ArrayList<>();
    private final  List<String> listT = new ArrayList<>();

    ////


    public ViewpagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        return listF.get(position);


        /*
        if(position==0){

            return new CallFragment();

        }else if(position==1){

            return new ContactFragment();
        }else {

            return new StatusFragment();
        }
    }*/


///////////////0721 , tabLayout Title 작성

    //private String tabTitles[] = new String[]{"버스", "정류장"};


        //return tabTitles[position];
////////////////

    }
/////////0722
    @Override
    public int getCount() {
        return listT.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listT.get(position);
    }

    public void AddFragment (Fragment fragment, String title){
        listF.add(fragment);
        listT.add(title);
    }
}