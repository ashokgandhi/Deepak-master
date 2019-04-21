package com.dilip.deepak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity{



    TextView Computer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Computer=findViewById(R.id.TV_Computer);
        Computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main2Activity.this,computer.class);
                startActivity(intent);
            }
        });

        }
}
