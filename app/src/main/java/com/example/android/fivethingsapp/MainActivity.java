package com.example.android.fivethingsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchActivity(View view){

        int btnId = view.getId();

        switch (btnId) {
            case R.id.to_page2_Btn:
                Intent Intent_page2 = new Intent(this, Main2Activity.class);
                startActivity(Intent_page2);
                break;
        }
    }
}
