/*
package com.pankaj.fabdialog.android.databases;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

*/
/**
 * This is the backend. The database. This used to be done by the OpenHelper.
 * The fact that this has very few comments emphasizes its coolness.
 *//*


@Database(entities = {Count.class}, version = 1)
public abstract class CountRoomDatabase extends RoomDatabase {

    public abstract CounterDao counterDao();

    private static CountRoomDatabase INSTANCE;

    static CountRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CountRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            CountRoomDatabase.class, "count_database")
                            // Wipes and rebuilds instead of migrating if no Migration object.
                            // Migration is not part of this codelab.
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    */
/**
     * Override the onOpen method to populate the database.
     * For this sample, we clear the database every time it is created or opened.
     *//*

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            // If you want to keep the data through app restarts,
            // comment out the following line.
        }
    };


}
*/
