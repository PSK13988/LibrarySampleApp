package com.pankaj.customlibrarysampleapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pankaj.customlibrarysampleapp.R;

/**
 * {@link SimpleActivity} plan activity not having Fab button behaviour
 */
public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }
}
