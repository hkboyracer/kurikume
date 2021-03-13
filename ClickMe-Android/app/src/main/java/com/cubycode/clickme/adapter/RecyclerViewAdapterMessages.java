package com.cubycode.clickme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;

import java.util.ArrayList;

public class RecyclerViewAdapterMessages extends RecyclerView.Adapter<RecyclerViewAdapterMessages.HashTagsViewHolder> {

    Context context;
    ArrayList<String> notificationsList;

    public RecyclerViewAdapterMessages(Context context, ArrayList<String> feedsList) {
        this.context = context;
        this.notificationsList = feedsList;
    }

    @NonNull
    @Override
    public HashTagsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layoiut_custom_adapter_messages, parent, false);
        HashTagsViewHolder trendsViewHolder = new HashTagsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HashTagsViewHolder holder, final int position) {

//        holder.rlSelectHashTag.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                holder.tvCheck.setVisibility(View.VISIBLE);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return notificationsList.size();
    }

    static class HashTagsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCheck;
        private TextView tvCityName;
        private RelativeLayout rlSelectHashTag;
        private TextView tvReportId;


        public HashTagsViewHolder(@NonNull View itemView) {
            super(itemView);
//            tvCheck = itemView.findViewById(R.id.tv_check);
//            tvCityName = itemView.findViewById(R.id.tv_city_name);
//            tvReportId = itemView.findViewById(R.id.tv_report_id);
//            rlSelectHashTag = itemView.findViewById(R.id.rl_select_hashtag);
        }
    }

}
