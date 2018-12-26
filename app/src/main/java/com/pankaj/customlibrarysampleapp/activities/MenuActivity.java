package com.pankaj.customlibrarysampleapp.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.pankaj.customlibrarysampleapp.R;
import com.pankaj.fabdialog.android.activities.FabButtonActivity;

/**
 * {@link MenuActivity} load {@link com.pankaj.customlibrarysampleapp.fragments.MenuActivityFragment}
 * inside it and inherit {@link BaseFabActivity} for Fab feature
 */
public class MenuActivity extends BaseFabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
