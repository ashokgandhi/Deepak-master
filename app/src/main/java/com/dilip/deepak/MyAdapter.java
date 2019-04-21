package com.dilip.deepak;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {


    private Context myContext;
    int totalTabs;



    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    //this is for fragment tabs

    @Override
    public Fragment getItem(int position) {
       /* switch (position) {
            case 0:
                ItFair itFair = new ItFair();
                return itFair;

            case 1:
                WorkShop workShop = new WorkShop();
                return workShop;

            case 2:
                Seminar seminamr = new Seminar();
                return seminamr;
                default:
                    return null;
        }*/

       if(position==0){
           return new ItFair();
       }
       else if(position==1){
           return new Seminar();
       }
       else {
           return new WorkShop();
       }
    }

        //this count total number of tab
        @Override
        public int getCount () {
            return 3;
        }

        @Override
    public CharSequence getPageTitle(int position){
        if(position==0){
            return "ItFair";
        }
        else if(position==1){
            return "Seminar";
        }
        else {
            return "Workshop";
        }
        }
}


