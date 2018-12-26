package com.pankaj.fabdialog.android.databases;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * View Model to keep a reference to the word repository and
 * an up-to-date list of all words.
 */

public class CountViewModel extends AndroidViewModel {

    private CountRepository mRepository;
    // Using LiveData and caching what getAlphabetizedWords returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.
    private LiveData<Count> mAllCounter;

    public CountViewModel(Application application) {
        super(application);
        mRepository = new CountRepository(application);
        mAllCounter = mRepository.getAllWords();
    }

    public LiveData<Count> getAllCounter() {
        return mAllCounter;
    }

    public void insert(Count count) {
        mRepository.insert(count);
    }

    public int getTotalRowCount() {
        return mRepository.getRowCount();
    }

    public void delete(Count count) {
        mRepository.delete(count);
    }
}