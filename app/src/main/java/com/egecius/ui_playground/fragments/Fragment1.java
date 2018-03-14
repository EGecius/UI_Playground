package com.egecius.ui_playground.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import com.egecius.ui_playground.R;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        setOnClickListener(rootView);

        return rootView;
    }

    private void setOnClickListener(View rootView) {
        rootView.findViewById(R.id.to_fragment_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MyFragmentActivity) getActivity()).showFragment2();
            }
        });
    }



}
