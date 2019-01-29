package com.pankaj.fabdialog.android.fragments;

import android.arch.lifecycle.Observer;
//import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pankaj.fabdialog.android.R;
//import com.pankaj.fabdialog.android.databases.Count;
//import com.pankaj.fabdialog.android.databases.CountViewModel;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link IncrementFragment} interface
 * to handle interaction events.
 * Use the {@link IncrementFragment()}
 * create an instance of this fragment.
 */
public class IncrementFragment extends Fragment {
    private TextView tvIncrement;
    private Button btnIncrement;
    private Button btnDecrement;
    //private CountViewModel mCountViewModel;
    private int counter = 0;

    public IncrementFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get a new or existing ViewModel from the ViewModelProvider.
        //mCountViewModel = ViewModelProviders.of(this).get(CountViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_increment, container, false);
        tvIncrement = view.findViewById(R.id.tvIncrement);
        btnIncrement = view.findViewById(R.id.btnIncrement);
        btnDecrement = view.findViewById(R.id.btnDecrement);

        initView();

        return view;
    }

    private void initView() {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //counter = mCountViewModel.getTotalRowCount();
                Log.d("IncrementFragment", " loadedCounter = " + counter);
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tvIncrement.setText("Value --> " + counter);


        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.

        /*mCountViewModel.getAllCounter().observe(this, new Observer<Count>() {
            @Override
            public void onChanged(@Nullable Count count) {
                if (count != null && count.getCount() > 0) {
                    textView.append("value --> " + count.getCount() + ", ");
                    Toast.makeText(getContext(), "" + count.getCount(), Toast.LENGTH_LONG).show();
                    counter = count.getCount();
                }
            }
        });*/

        // setListener
        setListeners();
    }

    private void setListeners() {
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //counter = mCountViewModel.getTotalRowCount();
                        Log.d("IncrementFragment", "Counter = " + counter);
                        counter++;
                        Log.d("IncrementFragment", "Incremented Counter = " + counter);

                    }
                });
                t.start();
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //Count count = new Count(counter);
                //mCountViewModel.insert(count);
                tvIncrement.setText("Value --> " + counter);
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) {
                   // Count count = new Count(counter);
                   //mCountViewModel.delete(count);
                    counter--;
                    tvIncrement.setText("Value --> " + counter);
                } else {
                    Toast.makeText(getContext(), "" + getString(R.string.str_counter_is_zero), Toast.LENGTH_SHORT).show();
                    tvIncrement.setText("Value --> " + 0);
                }
            }
        });

    }
}
