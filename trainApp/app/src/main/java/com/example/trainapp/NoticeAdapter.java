package com.example.trainapp;

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

        public NoticeViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title);
            vTime = (TextView) v.findViewById(R.id.time);
            vHeadline = (TextView) v.findViewById(R.id.title);
            vDetail = (TextView) v.findViewById(R.id.title);

        }
    }
}