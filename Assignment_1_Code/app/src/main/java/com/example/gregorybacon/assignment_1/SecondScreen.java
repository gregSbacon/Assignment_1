package com.example.gregorybacon.assignment_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondScreen extends AppCompatActivity {
    int code = 0;
    public static final String unlock_txt = "The App is Unlocked.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        but1_init();
        but2_init();
        but3_init();
        but4_init();
        sub_init();
    }

    private void but1_init() {
        Button button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (code == 0) code = code + 1;
                else code = 0;

            }
        });
    }

    private void but2_init(){
        Button button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code == 1) code = code + 1;
                else code = 0;

            }
        });
    }

    private void but3_init(){
        Button button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code == 2) code = code + 1;
                else code = 0;

            }
        });
    }

    private void but4_init(){
        Button button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code == 3) code = code + 1;
                else code = 0;

            }
        });
    }

    private void sub_init(){
        Button button_submit = (Button) findViewById(R.id.button_submit);
        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(code == 4){
                    Intent toResult = new Intent(SecondScreen.this, MainScreen.class);
                    toResult.putExtra(unlock_txt, "The App is Unlocked.");
                    startActivity(toResult);
                }
                else {

                    startActivity(new Intent(SecondScreen.this, MainScreen.class));
                }
                code = 0;

            }
        });
    }

}
