/*
package com.pankaj.fabdialog.android.databases;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

*/
/**
 * A basic class representing an entity that is a row in a one-column database table.
 *
 * @ Entity - You must annotate the class as an entity and supply a table name if not class name.
 * @ PrimaryKey - You must identify the primary key.
 * @ ColumnInfo - You must supply the column name if it is different from the variable name.
 * <p>
 * See the documentation for the full rich set of annotations.
 * https://developer.android.com/topic/libraries/architecture/room.html
 *//*


@Entity(tableName = "count_table")
public class Count {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "count")
    private Integer mCount;

    public Count(@NonNull Integer count) {
        this.mCount = count;
    }

    public Integer getCount() {
        return this.mCount;
    }
}*/
