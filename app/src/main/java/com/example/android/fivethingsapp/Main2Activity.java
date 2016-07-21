package com.example.android.fivethingsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.fivethingsapp.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent Intent_page2 = this.getIntent();
    }
    public void switchActivity(View view){

        int btnId = view.getId();

        switch (btnId) {
            case R.id.to_page3_Btn:
                Intent Intent_page3 = new Intent(this, Main3Activity.class);
                startActivity(Intent_page3);
                break;
        }
    }
}
