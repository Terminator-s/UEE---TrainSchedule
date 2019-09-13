package com.example.trainapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.activity_search_history, container,false);
        RecyclerView recList = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recList.setLayoutManager(new LinearLayoutManager(getActivity()));

        HistoryAdapter ca = new HistoryAdapter(createList(30));
        recList.setAdapter(ca);
        recList.setItemAnimator(new DefaultItemAnimator());

        return rootView;
    }
    private List<History> createList(int size) {

        List<History> result = new ArrayList<History>();
        History ci = new History("Kandy","Fort","Aug 15 2019 2:00P.M");
        History ci1 = new History("Dematagoda","Wellawatte","Aug 20 2019 4:00P.M");
        History ci2 = new History("Fort","Badulla","Aug 29 2019 12:00P.M");
        History ci3 = new History("Kalutara","Kolpity","Aug 15 2019 2:00P.M");
        History ci4 = new History("Anuradhapura","Jaffna","Aug 15 2019 2:00P.M");
        result.add(ci);
        result.add(ci1);
        result.add(ci2);
        result.add(ci3);
        result.add(ci4);



        return result;
    }

}
