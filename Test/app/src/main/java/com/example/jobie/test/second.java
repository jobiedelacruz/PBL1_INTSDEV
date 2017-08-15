package com.example.jobie.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {


    //Report or send feedback
    public Button but3;

    public void init3() {
        but3=(Button)findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy3 = new Intent(second.this, feedback.class);
                startActivity(toy3);
            }
        });


    }
//recurring user
    public Button but4;

    public void init4() {
        but4=(Button)findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy4 = new Intent(second.this, recurring.class);
                startActivity(toy4);
            }
        });
    }

   //new user
    public Button but9;

    public void init9() {
        but9= (Button) findViewById(R.id.button9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy9 = new Intent(second.this, calib.class);
                startActivity(toy9);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init3();
        init4();
        init9();
    }
}
