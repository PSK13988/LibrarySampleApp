package com.pankaj.fabdialog.android.activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.pankaj.fabdialog.android.R;
import com.pankaj.fabdialog.android.dialogs.FabDialogFragment;

/**
 * Parent class which provides {@link FloatingActionButton} button at right bottom in User interface
 * of child activity
 */
public class FabButtonActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    private FrameLayout activityContainer;

    /**
     * Override setContentView method of AppCompatActivity to add Fab button
     *
     * @param layoutResID
     */
    @Override
    public void setContentView(int layoutResID) {
        RelativeLayout rlparentView = (RelativeLayout) getLayoutInflater().inflate(R.layout.layout_fab_button, null);
        initViews(rlparentView);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(rlparentView);
    }

    /**
     * Initialize FabButtonActivity Views
     *
     * @param view : parent use to initialize child views
     */
    private void initViews(View view) {
        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        activityContainer = (FrameLayout) view.findViewById(R.id.activity_container);
        // Set listeners
        setListeners();
    }

    /**
     * Method for setting listeners on views
     */
    private void setListeners() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogFragment();
            }
        });
    }

    /**
     * Method for opening DialogFragment
     */
    private void openDialogFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);
        DialogFragment dialogFragment = new FabDialogFragment();
        dialogFragment.show(ft, "dialog");
    }


} // End of FabButtonActivity class
