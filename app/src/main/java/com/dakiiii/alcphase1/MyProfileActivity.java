package com.dakiiii.alcphase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar myProfileToolbar = findViewById(R.id.toolbar_myprofile);
        myProfileToolbar.setTitle("My Profile");
        setSupportActionBar(myProfileToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        TextView nameTextView, trackTextView, countryTextView, emailTextView, phoneNumberTextView
                ,slackUsernameTextView;
        nameTextView = findViewById(R.id.name_textView);
        trackTextView = findViewById(R.id.track_textview);
        countryTextView = findViewById(R.id.country_textview);
        emailTextView = findViewById(R.id.email_textview);
        phoneNumberTextView = findViewById(R.id.phone_textview);
        slackUsernameTextView = findViewById(R.id.slackusername_textview);
        AlcChap meAlcChap = new AlcChap("Aaron Edaku", "Android", "Uganda",
                "devdakiiii@gmail.com", "0759720699","@AaronEdaku");

        nameTextView.setText(meAlcChap.getName());
        trackTextView.setText(meAlcChap.getTrack());
        countryTextView.setText(meAlcChap.getCountry());
        emailTextView.setText(meAlcChap.getEmail());
        phoneNumberTextView.setText(meAlcChap.getPhoneNumber());
        slackUsernameTextView.setText(meAlcChap.getSlackUsername());


    }
}
