package com.zizi.mouad.apprentissageacademy.AFragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zizi.mouad.apprentissageacademy.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoEnsa extends Fragment {


    public VideoEnsa() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_video_ensa, container, false );
    }

}
