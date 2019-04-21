package com.dilip.deepak;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class event extends AppCompatActivity {

   TabLayout tabLayout;
   ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);


        tabLayout.addTab(tabLayout.newTab().setText("IT Fair"));
        tabLayout.addTab(tabLayout.newTab().setText("Seminar"));
        tabLayout.addTab(tabLayout.newTab().setText("WorkShop"));


        final MyAdapter adapter=new MyAdapter(this,getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);




        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
                }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
