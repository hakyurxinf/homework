package com.example.myhomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.DialogInterface;
import android.content.Intent;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class Counteractivity extends AppCompatActivity {
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);


         TextView textView1 = (TextView) findViewById(R.id.textview_count);
        Button btnJump2 = (Button) findViewById(R.id.btn_jump3);
        btnJump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView1.setText("The number is   "+count + "");
            }
        });

        Button btnJump3 = (Button) findViewById(R.id.btn_jump4);
        btnJump3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                textView1.setText("The number is   "+count + "");
            }
        });

        Button btnJump4 = (Button) findViewById(R.id.btn_jump5);
        btnJump4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                textView1.setText("The number is   "+count + "");
            }
        });
    }

}
