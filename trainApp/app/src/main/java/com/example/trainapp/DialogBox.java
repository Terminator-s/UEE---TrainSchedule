package com.example.trainapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogBox extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("AboutAs")
                .setMessage("Fastest and Smallest Train Schedules" +
                        "Train/Station Time Tables, and Many More." +
                        "Train Sri Lanka (Formerly 'Train Finder" +
                        "- Sri Lanka') helps you to smartly" +
                        "search trains in Sri Lanka and view the" +
                        "timetables of both trains and stations. It" +
                        "gives you the list of options that you can" +
                        "travel between any two stations.\n\n" +
                        "Features\n" +
                        "\n" +
                        "- Search for trains between any two stations in Sri Lanka at any date/time.\n" +
                        "- Get direct and connected train options with transit details, and total time\n" +
                        "- View full time table of any train or station\n" +
                        "- Access search history offline\n" +
                        "- View telephone numbers of all major stations in case you need any additional information\n\n" +
                        "=======================\n" +
                        "Initial data taken from :\n" +
                        "Sri Lanka Government Information Center\n" +
                        "(http://www.gic.gov.lk/gic/index.php?lang=en)\n" +
                        "=======================")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();
    }
}
