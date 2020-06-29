package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT ="com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER ="com.example.application.example.EXTRA_NUMBER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText1 = (EditText) findViewById(R.id.edittext1);
        final EditText editText2 = (EditText) findViewById(R.id.edittext2);
        final EditText editText3 = (EditText) findViewById(R.id.edittext3);
        final EditText editText4 = (EditText) findViewById(R.id.edittext4);
        final EditText editText5 = (EditText) findViewById(R.id.edittext5);
        final EditText editText6 = (EditText) findViewById(R.id.edittext6);
        final EditText editText7 = (EditText) findViewById(R.id.edittext7);
        final EditText editText8 = (EditText) findViewById(R.id.edittext8);
        final EditText editText9 = (EditText) findViewById(R.id.edittext9);

        Button button = findViewById(R.id.enter);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);

                String text = editText1.getText().toString();

                String text2 = editText2.getText().toString();

                String text3 = editText3.getText().toString();

                String text4 = editText4.getText().toString();

                String text5 = editText5.getText().toString();

                String text6 = editText6.getText().toString();

                String text7 = editText7.getText().toString();

                String text8 = editText8.getText().toString();

                String text9 = editText9.getText().toString();


                intent.putExtra("key1",text);
                intent.putExtra("key2",text2);
                intent.putExtra("key3",text3);
                intent.putExtra("key4",text4);
                intent.putExtra("key5",text5);
                intent.putExtra("key6",text6);
                intent.putExtra("key7",text7);
                intent.putExtra("key8",text8);
                intent.putExtra("key9",text9);

                startActivity(intent);
            }
        });
    }

}