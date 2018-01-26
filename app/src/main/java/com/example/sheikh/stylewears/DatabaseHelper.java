package com.example.sheikh.stylewears;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sheikh on 1/25/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    //Database Name
    public static final String DATABASE_NAME ="Products.db";
    public static final String TABLE_NAME ="Men_Wears";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Product_Name";
    public static final String COL_3 = "Old_Price";
    public static final String COL_4 = "New_Price";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , Product_Name TEXT, Old_Price INTEGER, New_Price INTEGER)");


        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        ContentValues contentValues3 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();


        contentValues.put(COL_2, "Embroided Yellow Kurta");
        contentValues.put(COL_3, 2300);
        contentValues.put(COL_4, 1800);

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);




        contentValues2.put(COL_2, "Charcoal Mock Jacket");
        contentValues2.put(COL_3, 2300);
        contentValues2.put(COL_4, 1800);

		sqLiteDatabase.insert(TABLE_NAME, null, contentValues2);

        contentValues3.put(COL_2, "Purple Formal Shirt");
        contentValues3.put(COL_3, 2300);
        contentValues3.put(COL_4, 1800);

		 sqLiteDatabase.insert(TABLE_NAME, null, contentValues3);


        contentValues4.put(COL_2, "Navy Casual Shirt");
        contentValues4.put(COL_3, 2300);
        contentValues4.put(COL_4, 1800);

		sqLiteDatabase.insert(TABLE_NAME, null, contentValues4);


    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
