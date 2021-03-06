package com.zizi.mouad.apprentissageacademy.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zizi.mouad.apprentissageacademy.AFragments.CoursCollege1;
import com.zizi.mouad.apprentissageacademy.AFragments.VideoCollege1;

public class College1Page extends FragmentPagerAdapter {


    private int numOfTab;

    public College1Page(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0 : fragment = new CoursCollege1();
            break;
            case 1 : fragment= new VideoCollege1();
            break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
