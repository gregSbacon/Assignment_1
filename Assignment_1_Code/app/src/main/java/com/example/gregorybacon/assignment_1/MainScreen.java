package com.example.gregorybacon.assignment_1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    String loc = "Welcome to the App! The App is LOCKED!";
    String unloc = "The App is Unlocked.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        butUN_init();
        TV_init();


        }

        private void butUN_init(){
            Button button_unlock = (Button) findViewById(R.id.button_unlock);
            button_unlock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainScreen.this, SecondScreen.class));
                }
            });
        }

        private void TV_init(){
            TextView txt = (TextView) findViewById(R.id.text1);
            String result = getIntent().getStringExtra(SecondScreen.unlock_txt);
            txt.setText(result); //Can comment line if uncommenting code below (shouldn't matter)

            /*
            I know the textview isnt showiung because there is nothing in result yet.
            For some reason this code builds but the emulator says "Assignment_1 keeps stopping".
            I have tried many ways to do this without success. Even passing integers back instead of strings and so on.

            if(result.equals(unloc)) txt.setText(result);
            else txt.setText(loc);
            */


        }

}
