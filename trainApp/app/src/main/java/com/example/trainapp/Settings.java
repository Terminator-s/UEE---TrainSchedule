package com.example.homepage;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    private TextView mTextMessage;
    private RatingBar ratingBar;
    //private Button checkRating;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_Search:
                    mTextMessage.setText(R.string.Search);
                    return true;
                case R.id.navigation_Recant:
                    mTextMessage.setText(R.string.Recant);
                    return true;
                case R.id.navigation_Notifications:
                    mTextMessage.setText(R.string.Notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        //checkRating =  (Button) findViewById(R.id.button_check);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(Settings.this, "Stars: " + (int)v, Toast.LENGTH_SHORT).show();
            }
        });

      /*  checkRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Settings.this, "Stars: " + (int)ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });*/
    }

}
