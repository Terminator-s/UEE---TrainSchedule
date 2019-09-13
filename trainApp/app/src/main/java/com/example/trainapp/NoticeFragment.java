package com.example.trainapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NoticeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView= inflater.inflate(R.layout.activity_notices, null);
        RecyclerView recList = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this.getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        NoticeAdapter na = new NoticeAdapter(createList(30));
        recList.setAdapter(na);

        return rootView;
    }
    private List<Notices> createList(int size) {

        List<Notices> result = new ArrayList<Notices>();
        Notices ci = new Notices("Yaal devi delayed", "yaall devi train delayed due to traffic", "Aug 15 2019 2:00P.M");
        Notices ci1 = new Notices("Yaal devi delayed", "yaall devi train delayed due to traffic", "Aug 15 2019 2:00P.M");
        Notices ci2 = new Notices("Yaal devi delayed", "yaall devi train delayed due to traffic", "Aug 15 2019 2:00P.M");
        Notices ci3 = new Notices("Yaal devi delayed", "yaall devi train delayed due to traffic", "Aug 15 2019 2:00P.M");
        Notices ci4 = new Notices("Yaal devi delayed", "yaall devi train delayed due to traffic", "Aug 15 2019 2:00P.M");

        result.add(ci);
        result.add(ci1);
        result.add(ci2);
        result.add(ci3);
        result.add(ci4);


        return result;
    }
}