package com.zizi.mouad.apprentissageacademy.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zizi.mouad.apprentissageacademy.AFragments.Cours_CPGE;
import com.zizi.mouad.apprentissageacademy.AFragments.Video_CPGE;

public class CpgePage extends FragmentPagerAdapter {
    private int numOfTab;

    public CpgePage (FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0 : fragment = new Cours_CPGE();
                break;

            case 1 : fragment= new Video_CPGE();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
