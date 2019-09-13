package com.example.trainapp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.*;

public class SearchFragment  extends Fragment implements DatePickerDialog.OnDateSetListener{

    private Spinner startSpin, endSpin;
    private Button btnSubmit;
    private TextView dateText;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.activity_search, container,false);
        dateText = rootView.findViewById(R.id.date);
        //        addItemsOnStartSpinner();
//        addItemsOnEndSpinner();
//        addListenerOnButton();
//        addListenerOnSpinnerItemSelection();
        rootView.findViewById(R.id.datebtn).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //showDate();
            }
        });
        return rootView;
    }

    // add items into spinner dynamically
//    private void addItemsOnStartSpinner() {
//
//        startSpin = (Spinner) findViewById(R.id.startSpinner);
//        List<String> list = new ArrayList<>();
//        list.add("cmb6");
//        list.add("cmb9");
//        list.add("cmb2");
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this,
//                android.R.layout.simple_spinner_item, list);
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        startSpin.setAdapter(dataAdapter);
//    }

    // add items into spinner dynamically
//    private void addItemsOnEndSpinner() {
//
//        endSpin = (Spinner) findViewById(R.id.endSpinner);
//        List<String> list = new ArrayList<String>();
//        list.add("cmb6");
//        list.add("cmb9");
//        list.add("cmb2");
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_item, list);
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        endSpin.setAdapter(dataAdapter);
//    }

//    private void addListenerOnSpinnerItemSelection() {
//        startSpin = (Spinner) findViewById(R.id.startSpinner);
//        startSpin.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//
//        endSpin = (Spinner) findViewById(R.id.endSpinner);
//        endSpin.setOnItemSelectedListener(new CustomOnItemSelectedListener());
//    }

    // get the selected dropdown list value
//    private void addListenerOnButton() {
//
//        startSpin = (Spinner) findViewById(R.id.startSpinner);
//        endSpin = (Spinner) findViewById(R.id.endSpinner);
//        btnSubmit = (Button) findViewById(R.id.btnSubmit);
//
//        btnSubmit.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(Search.this,
//                                "start station : "+ String.valueOf(startSpin.getSelectedItem()) +
//                                "end station : "+ String.valueOf(endSpin.getSelectedItem()),
//                        Toast.LENGTH_SHORT).show();
//            }
//
//        });
//    }

//    private void showDate(){
//        DatePickerDialog datePickerDialog = new DatePickerDialog(
//                this,
//                this,
//                Calendar.getInstance().get(Calendar.YEAR),
//                Calendar.getInstance().get(Calendar.MONTH),
//                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
//        );
//        datePickerDialog.show();
//    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date = dayOfMonth+"/"+month+"/"+year;
        dateText.setText(date);
    }
}

//class CustomOnItemSelectedListener implements OnItemSelectedListener {
//
//    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
//        Toast.makeText(parent.getContext(),
//                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
//                Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//    }
//
//}