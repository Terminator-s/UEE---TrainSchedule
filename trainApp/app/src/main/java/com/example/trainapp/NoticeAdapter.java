package com.example.trainapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoticeAdapter  extends RecyclerView.Adapter<NoticeAdapter.NoticeViewHolder> {
    private List<Notices> noticesList;

    public NoticeAdapter(List<Notices> noticesList) {
        this.noticesList = noticesList;
    }


    @Override
    public int getItemCount() {
        return noticesList.size();
    }

    @Override
    public void onBindViewHolder(NoticeAdapter.NoticeViewHolder noticeViewHolder, int i) {
        Notices ci = noticesList.get(i);
        noticeViewHolder.vHeadline.setText(ci.Headline);
        noticeViewHolder.vDetail.setText(ci.Detail);
        noticeViewHolder.vTime.setText(ci.timestamp);
        noticeViewHolder.vTitle.setText(ci.Headline);

        noticeViewHolder.card_item.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment myFragment = new NoticeDetail();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.main_container, myFragment).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public NoticeAdapter.NoticeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.list_item, viewGroup, false);

        return new NoticeAdapter.NoticeViewHolder(itemView);
    }

    public static class NoticeViewHolder extends RecyclerView.ViewHolder {

        protected TextView vHeadline;
        protected TextView vDetail;
        protected TextView vTime;
        protected TextView vTitle;
        protected CardView card_item;

        public NoticeViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title);
            vTime = (TextView) v.findViewById(R.id.time);
            vHeadline = (TextView) v.findViewById(R.id.title);
            vDetail = (TextView) v.findViewById(R.id.title);
            card_item = (CardView) v.findViewById(R.id.card_view);

        }
    }
}