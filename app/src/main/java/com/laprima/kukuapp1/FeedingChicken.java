package com.laprima.kukuapp1;

import android.os.Bundle;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FeedingChicken extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Inflate the layout for this fragment

        return inflater.inflate(R.layout.activity_feeding_chicken, container, false);
    }
}
