package com.dakiiii.alcphase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final Intent aboutAlcIntent = new Intent(".AboutAlcActivity");
    private final Intent myProfileIntent = new Intent(".MyProfileActivity");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button aboutAlcButton = findViewById(R.id.buttonAboutAlc);
        Button myProfileButton = findViewById(R.id.buttonMyProfile);

        aboutAlcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aboutAlcIntent);
            }
        });

        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(myProfileIntent);
            }
        });
    }


}
