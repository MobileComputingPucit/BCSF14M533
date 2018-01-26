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

    public static final String TABLE_NAME_LADIES ="Ladies_Wears";
    public static final String COL_1_LADIES = "ID_LADIES";
    public static final String COL_2_LADIES = "Product_Name_LADIES";
    public static final String COL_3_LADIES = "Old_Price_LADIES";
    public static final String COL_4_LADIES = "New_Price_LADIES";

    public static final String TABLE_NAME_KIDS ="Kids_Wears";
    public static final String COL_1KIDS = "ID_KIDS";
    public static final String COL_2_KIDS = "Product_Name_KIDS";
    public static final String COL_3_KIDS= "Old_Price_KIDS";
    public static final String COL_4_KIDS = "New_Price_KIDS";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //Table for MEN PRODUCTS
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , Product_Name TEXT, Old_Price INTEGER, New_Price INTEGER)");
        sqLiteDatabase.execSQL("create table " + TABLE_NAME_LADIES + "(ID_LADIES INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , Product_Name_LADIES TEXT, Old_Price_LADIES INTEGER, New_Price_LADIES INTEGER)");
        sqLiteDatabase.execSQL("create table " + TABLE_NAME_KIDS + "(ID_KIDS INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , Product_Name_KIDS TEXT, Old_Price_KIDS INTEGER, New_Price_KIDS INTEGER)");

        //PUttING VALUES IN TABLE FOR MEN
        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        ContentValues contentValues3 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();


        contentValues.put(COL_2, "Embroided Yellow Kurta");
        contentValues.put(COL_3, 2300);
        contentValues.put(COL_4, 1800);

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);




        contentValues2.put(COL_2, "Charcoal Mock Jacket");
        contentValues2.put(COL_3, 4000);
        contentValues2.put(COL_4, 2000);

		sqLiteDatabase.insert(TABLE_NAME, null, contentValues2);

        contentValues3.put(COL_2, "Purple Formal Shirt");
        contentValues3.put(COL_3, 1200);
        contentValues3.put(COL_4, 700);

		 sqLiteDatabase.insert(TABLE_NAME, null, contentValues3);


        contentValues4.put(COL_2, "Navy Casual Shirt");
        contentValues4.put(COL_3, 750);
        contentValues4.put(COL_4, 500);

		sqLiteDatabase.insert(TABLE_NAME, null, contentValues4);


        //CREATE TABLE FOR LADIES


        //ENTERING DATA IN LADIES TABLE

        ContentValues contentValues5 = new ContentValues();
        ContentValues contentValues6 = new ContentValues();
        ContentValues contentValues7 = new ContentValues();
        ContentValues contentValues8 = new ContentValues();


        contentValues5.put(COL_2_LADIES, "Stylish Lehanga");
        contentValues5.put(COL_3_LADIES, 2600);
        contentValues5.put(COL_4_LADIES, 2000);

        sqLiteDatabase.insert(TABLE_NAME_LADIES, null, contentValues5);

        contentValues6.put(COL_2_LADIES, "Skirts for Functions");
        contentValues6.put(COL_3_LADIES, 1800);
        contentValues6.put(COL_4_LADIES, 1500);

        sqLiteDatabase.insert(TABLE_NAME_LADIES, null, contentValues6);

        contentValues7.put(COL_2_LADIES, "Summer Lawn Wear");
        contentValues7.put(COL_3_LADIES, 4300);
        contentValues7.put(COL_4_LADIES, 4000);

        sqLiteDatabase.insert(TABLE_NAME_LADIES, null, contentValues7);


        contentValues8.put(COL_2_LADIES, "Gorgeous Bridal Design");
        contentValues8.put(COL_3_LADIES, 15000);
        contentValues8.put(COL_4_LADIES, 14500);

        sqLiteDatabase.insert(TABLE_NAME_LADIES, null, contentValues8);


        ContentValues contentValues9 = new ContentValues();
        ContentValues contentValues10 = new ContentValues();
        ContentValues contentValues11 = new ContentValues();
        ContentValues contentValues12 = new ContentValues();

        contentValues9.put(COL_2_KIDS, "Cute Kids Coat");
        contentValues9.put(COL_3_KIDS, 2000);
        contentValues9.put(COL_4_KIDS, 1799);

        sqLiteDatabase.insert(TABLE_NAME_KIDS, null, contentValues9);

        contentValues10.put(COL_2_KIDS, "Blue Fancy Shirt");
        contentValues10.put(COL_3_KIDS, 700);
        contentValues10.put(COL_4_KIDS, 500);

        sqLiteDatabase.insert(TABLE_NAME_KIDS, null, contentValues10);

        contentValues11.put(COL_2_KIDS, "Fun party Kids Wear");
        contentValues11.put(COL_3_KIDS, 1850);
        contentValues11.put(COL_4_KIDS, 1699);

        sqLiteDatabase.insert(TABLE_NAME_KIDS, null, contentValues11);


        contentValues12.put(COL_2_KIDS, "Pant Shirt Kids");
        contentValues12.put(COL_3_KIDS, 1500);
        contentValues12.put(COL_4_KIDS, 1100);

        sqLiteDatabase.insert(TABLE_NAME_KIDS, null, contentValues12);


    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
