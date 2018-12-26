package com.pankaj.customlibrarysampleapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pankaj.customlibrarysampleapp.R;
import com.pankaj.fabdialog.android.activities.FabButtonActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * {@link ScrollingActivity} contains long static text with scroll feature and inherit {@link BaseFabActivity}
 *  for Fab feature
 */
public class ScrollingActivity extends BaseFabActivity {
    @OnClick(R.id.btnNextActivity)
    void clickMe() {
        startActivity(new Intent(ScrollingActivity.this, MenuActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }
}
