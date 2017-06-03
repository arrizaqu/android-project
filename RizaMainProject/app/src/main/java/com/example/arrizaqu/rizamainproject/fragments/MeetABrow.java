package com.example.arrizaqu.rizamainproject.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arrizaqu.rizamainproject.R;

/**
 * Created by arrizaqu on 02/06/2017.
 */

public class MeetABrow extends Fragment{
    public static MeetABrow newInstance(){
        return new MeetABrow();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_meet_a_brow, container, false);
        return rootView;
    }
}
