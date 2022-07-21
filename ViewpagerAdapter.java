package com.cookandroid.jye;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class ViewpagerAdapter extends FragmentStateAdapter {
    private int  mPageCount = 2;

    public ViewpagerAdapter( AppCompatActivity fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch (position) {
          case 0:
              CallFragment callFragment = new CallFragment();
              return callFragment;

          case 1:
              ContactFragment contactFragment = new ContactFragment();
              return  contactFragment;

          default:
              return  null;
        }

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }


    @Override
    public int getItemCount() {
        return mPageCount;
    }
}
