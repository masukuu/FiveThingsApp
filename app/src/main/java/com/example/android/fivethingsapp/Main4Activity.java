package com.example.android.fivethingsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void switchActivity(View view){

        int btnId = view.getId();

        switch (btnId) {
            case R.id.to_page5_Btn:
                Intent Intent_page5 = new Intent(this, Main5Activity.class);
                startActivity(Intent_page5);
                break;
        }
    }
}
