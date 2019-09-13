package com.example.trainapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsFragment extends Fragment {

    //variable declaration
    private TextView mTextMessage;
    private RatingBar ratingBar;
    private TextView aboutUs;
    private TextView feedback;
    private TextView updates;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_settings, container, false);
        //get by id from xml
        mTextMessage = (TextView) rootView.findViewById(R.id.message);
        ratingBar = (RatingBar) rootView.findViewById(R.id.ratingBar);
        aboutUs = (TextView) rootView.findViewById(R.id.setting_about);
        feedback = (TextView) rootView.findViewById(R.id.setting_feedback);
        updates = (TextView) rootView.findViewById(R.id.setting_updates);
        final AppCompatActivity activity = (AppCompatActivity) rootView.getContext();
        // rating bar function
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(activity, "Stars: " + (int) v, Toast.LENGTH_SHORT).show();
            }
        });

        //call aboutUs dialogBox function
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogBox dialogBox = new DialogBox();
                dialogBox.show(activity.getSupportFragmentManager(), "About Us");
            }
        });

        //redirect to feedback page
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openFeedbackActivity();
            }
        });

        //call check update dialog Box function
        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UpdateDialogBox updateDialogBox = new UpdateDialogBox();
                updateDialogBox.show(activity.getSupportFragmentManager(), "Updates");
            }
        });

        return rootView;
    }

}


