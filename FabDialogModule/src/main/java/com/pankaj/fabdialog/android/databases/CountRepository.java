/*
package com.pankaj.fabdialog.android.databases;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

*/
/**
 * Abstracted Repository as promoted by the Architecture Guide.
 * https://developer.android.com/topic/libraries/architecture/guide.html
 *//*


public class CountRepository {

    private CounterDao mCounterDao;
    private LiveData<Count> mAllCounter;

    // Note that in order to unit test the CountRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    CountRepository(Application application) {
        CountRoomDatabase db = CountRoomDatabase.getDatabase(application);
        mCounterDao = db.counterDao();
        mAllCounter = mCounterDao.getAlphabetizedWords();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<Count> getAllWords() {
        return mAllCounter;
    }

    // You must call this on a non-UI thread or your app will crash.
    // Like this, Room ensures that you're not doing any long running operations on the main
    // thread, blocking the UI.
    public void insert(Count count) {
        new insertAsyncTask(mCounterDao).execute(count);
    }

    public int getRowCount() {
        return mCounterDao.getNumberOfRows();
    }

    public void delete(Count count) {
        new deleteAsyncTask(mCounterDao).execute(count);
    }

    private static class insertAsyncTask extends AsyncTask<Count, Void, Void> {

        private CounterDao mAsyncTaskDao;

        insertAsyncTask(CounterDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Count... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTask extends AsyncTask<Count, Void, Void> {

        private CounterDao mAsyncTaskDao;

        deleteAsyncTask(CounterDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Count... params) {
            mAsyncTaskDao.delete(params[0]);
            return null;
        }
    }
}
*/
