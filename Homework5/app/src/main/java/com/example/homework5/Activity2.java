package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle b = getIntent().getExtras();


        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);
        TextView textView3 = (TextView) findViewById(R.id.textview3);
        TextView textView4 = (TextView) findViewById(R.id.textview4);
        TextView textView5 = (TextView) findViewById(R.id.textview5);
        TextView textView6 = (TextView) findViewById(R.id.textview6);
        TextView textView7 = (TextView) findViewById(R.id.textview7);
        TextView textView8 = (TextView) findViewById(R.id.textview8);
        TextView textView9 = (TextView) findViewById(R.id.textview9);

        textView1.setText(b.getString("key1"));
        textView2.setText(b.getString("key2"));
        textView3.setText(b.getString("key3"));
        textView4.setText(b.getString("key4"));
        textView5.setText(b.getString("key5"));
        textView6.setText(b.getString("key6"));
        textView7.setText(b.getString("key7"));
        textView8.setText(b.getString("key8"));
        textView9.setText(b.getString("key9"));
    }
}