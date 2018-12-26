package com.pankaj.customlibrarysampleapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.pankaj.customlibrarysampleapp.R;
import com.pankaj.fabdialog.android.activities.FabButtonActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * HeaderActvity with content header and inherit {@link BaseFabActivity} for Fab button behaviour
 */
public class HeaderActivity extends BaseFabActivity {
    @OnClick(R.id.tvClose)
    void closeActivity() {
        finish();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }
}
