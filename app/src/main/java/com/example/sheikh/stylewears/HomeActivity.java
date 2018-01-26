package com.example.sheikh.stylewears;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.id.list;

public class HomeActivity extends AppCompatActivity {

    // Defining different things to be included in our single item of List.

    int[] IMAGES ={R.drawable.gentscategory, R.drawable.ladiescategory, R.drawable.kidscategory, R.drawable.bagscategory};
    String[] CATEGORIES = {"Gents", "Ladies", "Kids", "Bags"};
    String[] DESCRIPTIONS ={"Cool Men Wears", "Attractive Designs", "Cute Kids Collection", "Quality Bags"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Finding the listView widget from XML File
        ListView listView = (ListView) findViewById(R.id.list_item);

        //Creating object of our custom List Adaptar to bind our data to list.
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        //Set onClickListener for the change on item selection
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(HomeActivity.this, GentsActivity.class);
                    startActivity(intent);
                }

                else if (i == 1){
                    Intent intent = new Intent(HomeActivity.this, LadiesActivity.class);
                    startActivity(intent);
                }

                else if (i == 2){
                    Intent intent = new Intent(HomeActivity.this, KidsActivity.class);
                    startActivity(intent);
                }

                else if (i == 3){
                    Toast.makeText(HomeActivity.this,"We are Updating It. Sorry!", Toast.LENGTH_LONG).show();

                }
            }
        }
        );

    }


    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            // This will tell the total number of items in the list
            return IMAGES.length;
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


            //It will help to show the layout we created in custom_layout.xml
            view = getLayoutInflater().inflate(R.layout.custom_layout, null);

            //Getting references of widgets inside variables
            ImageView imageView = (ImageView) view.findViewById(R.id.imageViewList);
            TextView tv_Categories = (TextView) view.findViewById(R.id.tv_Categories);
            TextView tv_Description = (TextView) view.findViewById(R.id.tv_Description);

            //Changing color of textviews by using index in list
            if(i == 0 ){
                tv_Categories.setTextColor(Color.parseColor("#000000"));
            }
            else if( i==1 ){
                tv_Categories.setTextColor(Color.parseColor("#FF1493"));
            }

            else if( i==2 ){
                tv_Categories.setTextColor(Color.parseColor("#FF8C00"));
            }

            else if( i==3 ){
                tv_Categories.setTextColor(Color.parseColor("#0000FF"));
            }

            //setting array values to custom list view
            imageView.setImageResource(IMAGES[i]);
            tv_Categories.setText(CATEGORIES[i]);
            tv_Description.setText(DESCRIPTIONS[i]);

            return view;
        }


    }

}
