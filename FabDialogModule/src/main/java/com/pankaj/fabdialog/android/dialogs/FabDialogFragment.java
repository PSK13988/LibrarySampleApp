package com.pankaj.fabdialog.android.dialogs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pankaj.fabdialog.android.R;
import com.pankaj.fabdialog.android.fragments.DecrementFragment;
import com.pankaj.fabdialog.android.fragments.IncrementFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link FabDialogFragment} is class to show Dialog when user clicks on {@link android.support.design.widget.FloatingActionButton} button
 */
public class FabDialogFragment extends DialogFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_layout, container);

        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        CustomAdapter adapter = new CustomAdapter(getChildFragmentManager());
        adapter.addFragment("Increment", new IncrementFragment());
        adapter.addFragment("Decrement", new DecrementFragment());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

    public class CustomAdapter extends FragmentStatePagerAdapter {
        List<Fragment> mFragmentCollection = new ArrayList<>();
        List<String> mTitleCollection = new ArrayList<>();

        public CustomAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(String title, Fragment fragment) {
            mTitleCollection.add(title);
            mFragmentCollection.add(fragment);
        }

        //Needed for
        @Override
        public CharSequence getPageTitle(int position) {
            return mTitleCollection.get(position);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentCollection.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentCollection.size();
        }
    }
}
