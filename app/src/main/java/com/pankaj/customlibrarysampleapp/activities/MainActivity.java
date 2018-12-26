package com.pankaj.customlibrarysampleapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pankaj.customlibrarysampleapp.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * {@link MainActivity is navigation to all activity} inherits {@link BaseFabActivity}
 *  to get Fab button feature
 */
public class MainActivity extends BaseFabActivity {
    @OnClick(R.id.tvOpenHomeActivity)
    void openHomeActivity() {
        startActivity(new Intent(MainActivity.this, HeaderActivity.class));
    }

    @OnClick(R.id.tvOpenMenuActivity)
    void openMenuActivity() {
        startActivity(new Intent(MainActivity.this, MenuActivity.class));
    }

    @OnClick(R.id.tvOpenScrollingActivity)
    void openScrollingActivity() {
        startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
    }

    @OnClick(R.id.tvOpenSimpleActivity)
    void openSimpleActivity() {
        startActivity(new Intent(MainActivity.this, SimpleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //FabDialog.init(this);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
}
