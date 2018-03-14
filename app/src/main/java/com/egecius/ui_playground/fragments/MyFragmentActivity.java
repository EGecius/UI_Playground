package com.egecius.ui_playground.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.egecius.ui_playground.R;

public class MyFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fragment);

    }

    void showFragment2() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.placeholder, new Fragment2())
                .commit();
    }
}
