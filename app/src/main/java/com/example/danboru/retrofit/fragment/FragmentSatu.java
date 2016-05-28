package com.example.danboru.retrofit.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danboru.retrofit.R;


public class FragmentSatu extends Fragment {

    public FragmentSatu() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle){

        return inflater.inflate(R.layout.fragment_fragment_satu, container, false);
    }

}
