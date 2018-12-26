package com.pankaj.fabdialog.android.fragments;


import android.arch.lifecycle.ViewModelProviders;
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
import com.pankaj.fabdialog.android.databases.Count;
import com.pankaj.fabdialog.android.databases.CountViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DecrementFragment#}
 * create an instance of this fragment.
 */
public class DecrementFragment extends Fragment {
    private TextView tvDecrement;
    private Button btnDecrement;
    private int counter = 0;
    private CountViewModel mCountViewModel;

    public DecrementFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get a new or existing ViewModel from the ViewModelProvider.
        mCountViewModel = ViewModelProviders.of(this).get(CountViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_decrement, container, false);
        tvDecrement = view.findViewById(R.id.tvDecrement);
        btnDecrement = view.findViewById(R.id.btnDecrement);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                counter = mCountViewModel.getTotalRowCount();
                Log.d("IncrementFragment", " loadedCounter = " + counter);
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        tvDecrement.setText("Value --> " + counter);

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Not functioning now", Toast.LENGTH_SHORT).show();
//                Thread t = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        counter = mCountViewModel.getTotalRowCount();
//                        Log.d("IncrementFragment", "Counter = " + counter);
//                        counter++;
//                        Log.d("IncrementFragment", "Incremented Counter = " + counter);
//
//                    }
//                });
//                t.start();
//                try {
//                    t.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Count count = new Count(counter);
//                mCountViewModel.delete(count);
//                counter--;
//
//                 tvDecrement.setText("Value --> " + counter);
//                }
            }
        });
        return view;
    }

}
