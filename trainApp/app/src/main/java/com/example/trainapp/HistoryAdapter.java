package com.example.trainapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {
    private List<History> historyList;

    public HistoryAdapter(List<History> historyList) {
        this.historyList = historyList;
    }


    @Override
    public int getItemCount() {
        return historyList.size();
    }

    @Override
    public void onBindViewHolder(HistoryViewHolder historyViewHolder, int i) {

        History ci = historyList.get(i);
        historyViewHolder.vStart.setText(ci.startStation);
        historyViewHolder.vEnd.setText(ci.endStation);
        historyViewHolder.vTime.setText(ci.timestamp);
        historyViewHolder.vTitle.setText(ci.startStation + "-" + ci.endStation);

    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.list_item, viewGroup, false);


        return new HistoryViewHolder(itemView);
    }

    public static class HistoryViewHolder extends RecyclerView.ViewHolder {

        protected TextView vStart;
        protected TextView vEnd;
        protected TextView vTime;
        protected TextView vTitle;
        protected CardView card_item;

        public HistoryViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title);
            vTime = (TextView)  v.findViewById(R.id.time);
            vStart = (TextView)  v.findViewById(R.id.title);
            vEnd = (TextView)  v.findViewById(R.id.title);
            card_item = (CardView) v.findViewById(R.id.card_view);

            card_item.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   AppCompatActivity activity =(AppCompatActivity) new AppCompatActivity();
                   Fragment fragment=new Fragment();
                   activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).commit();

                }
            });

        }
    }

}
