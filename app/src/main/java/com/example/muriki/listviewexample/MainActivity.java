package com.example.muriki.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"Prison Break", "Mahabharath", "Chandrakantha", "Jungle Book", "Thehkikaath"};

        //we can also use default layout from android
        // ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favoriteTVShows);
       // ListAdapter theAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.textView1,favoriteTVShows);
            ListAdapter theAdapter = new MyAdapter(this,favoriteTVShows);


        ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String tvShowPicked = "You Selected " + String.valueOf(parent.getItemAtPosition(position));

                Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
            }

        });

    }

}
