package com.example.muriki.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muriki.listviewexample.R;

class MyAdapter extends ArrayAdapter<String> {


    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater theInflater = LayoutInflater.from(getContext()); //this is to put into right view for us

        View theView =  theInflater.inflate(R.layout.row_layout2,parent,false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);

        theTextView.setText(tvShow);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView);

        theImageView.setImageResource(R.drawable.dot);

        return theView;

    }
}