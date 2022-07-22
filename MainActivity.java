package com.cookandroid.jye;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    ViewpagerAdapter viewpagerAdapter; //0722


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        ////0722
        viewpagerAdapter = new ViewpagerAdapter(getSupportFragmentManager());


        //viewpagerAdapter 에  fragment 추가
        // AddFragment = ViewpagerAdapter.java 에서 확인
        //0722
        viewpagerAdapter.AddFragment(new CallFragment(),"버스");
        viewpagerAdapter.AddFragment(new ContactFragment(),"정류장");



        //ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewpagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        ///탭레이아웃 타이틀 부분에 이미지 추가 , 필요없음
        //tabLayout.getTabAt(0).setIcon(R.drawable.otver); // 첫번째 = 0번째 탭 레이아웃 타이틀부분에 이미지 삽입되어있음

   }
}
