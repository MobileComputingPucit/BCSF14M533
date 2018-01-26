package com.example.sheikh.stylewears;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LadiesActivity extends AppCompatActivity {



    DatabaseHelper databaseHelper = new DatabaseHelper(this);
    String dbstring = "";

    int[] PRODUCT_IMAGES={R.drawable.lehengaladies, R.drawable.skirtladies, R.drawable.summerlawnladies, R.drawable.bridalladies};
    String[] PRODUCT_NAME = {"Lehenga","Skirts","Lawn suites","Bridal Wears"};
    String[] PRODUCT_DETAILS = {"Show Details", "Show Details","Show Details", "Show Details"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladies);

        ListView mylistView = (ListView) findViewById(R.id.products_list_ladies);

        SecondCustomAdapter secondCustomAdapter = new SecondCustomAdapter();
        mylistView.setAdapter(secondCustomAdapter);

        mylistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){

                    String name="";
                    String old ="";
                    String newprice ="";

                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();


                    String query = "SELECT * FROM Ladies_Wears WHERE ID_LADIES='1'";
                    Cursor c = sqLiteDatabase.rawQuery(query, null);

                    if(c.moveToFirst()){
                        do{
                            name = c.getString(1);
                            old = c.getString(2);
                            newprice = c.getString(3);

                        }while(c.moveToNext());

                        c.close();
                    }

                    dbstring ="Product: " + name + "\n" + "Old Price: " + old + "\n" + "New Price: " + newprice;


                    Intent intent = new Intent(LadiesActivity.this, KurtaMen.class);
                    intent.putExtra("database_value",dbstring);
                    startActivity(intent);

                    sqLiteDatabase.close();

                }


                else if (i == 1){
                    String name="";
                    String old ="";
                    String newprice ="";

                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();


                    String query = "SELECT * FROM Ladies_Wears WHERE ID_LADIES='2'";
                    Cursor c = sqLiteDatabase.rawQuery(query, null);

                    if(c.moveToFirst()){
                        do{
                            name = c.getString(1);
                            old = c.getString(2);
                            newprice = c.getString(3);

                        }while(c.moveToNext());

                        c.close();
                    }

                    dbstring ="Product: " + name + "\n" + "Old Price: " + old + "\n" + "New Price: " + newprice;


                    Intent intent = new Intent(LadiesActivity.this, KurtaMen.class);
                    intent.putExtra("database_value",dbstring);
                    startActivity(intent);

                    sqLiteDatabase.close();

                }

                else if (i == 2){
                    String name="";
                    String old ="";
                    String newprice ="";

                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();


                    String query = "SELECT * FROM Ladies_Wears WHERE ID_LADIES='3'";
                    Cursor c = sqLiteDatabase.rawQuery(query, null);

                    if(c.moveToFirst()){
                        do{
                            name = c.getString(1);
                            old = c.getString(2);
                            newprice = c.getString(3);

                        }while(c.moveToNext());

                        c.close();
                    }

                    dbstring ="Product: " + name + "\n" + "Old Price: " + old + "\n" + "New Price: " + newprice;


                    Intent intent = new Intent(LadiesActivity.this, KurtaMen.class);
                    intent.putExtra("database_value",dbstring);
                    startActivity(intent);

                    sqLiteDatabase.close();

                }

                else if (i == 3){
                    String name="";
                    String old ="";
                    String newprice ="";

                    SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();


                    String query = "SELECT * FROM Ladies_Wears WHERE ID_LADIES='4'";
                    Cursor c = sqLiteDatabase.rawQuery(query, null);

                    if(c.moveToFirst()){
                        do{
                            name = c.getString(1);
                            old = c.getString(2);
                            newprice = c.getString(3);

                        }while(c.moveToNext());

                        c.close();
                    }

                    dbstring ="Product: " + name + "\n" + "Old Price: " + old + "\n" + "New Price: " + newprice;


                    Intent intent = new Intent(LadiesActivity.this, KurtaMen.class);
                    intent.putExtra("database_value",dbstring);
                    startActivity(intent);

                    sqLiteDatabase.close();

                }

            }
        });

    }

    class SecondCustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {

            return PRODUCT_IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.products_design, null);

            ImageView imageView = (ImageView) view.findViewById(R.id.product_picture);
            TextView textView = (TextView) view.findViewById(R.id.tvProductName);
            TextView button = (TextView) view.findViewById(R.id.button);

            imageView.setImageResource(PRODUCT_IMAGES[i]);
            textView.setText(PRODUCT_NAME[i]);
            button.setText(PRODUCT_DETAILS[i]);

            return view;
        }
    }
}
