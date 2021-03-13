package com.cubycode.clickme.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.activities.TrendsActivity;

import java.util.ArrayList;

public class RecyclerViewAdapterHashTags extends RecyclerView.Adapter<RecyclerViewAdapterHashTags.HashTagsViewHolder> {

    Context context;
    ArrayList<String> feedsList;

    public RecyclerViewAdapterHashTags(Context context, ArrayList<String> feedsList) {
        this.context = context;
        this.feedsList = feedsList;
    }

    @NonNull
    @Override
    public HashTagsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_custom_adapter_trends_and_hashtags, parent, false);
        HashTagsViewHolder trendsViewHolder = new HashTagsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HashTagsViewHolder holder, final int position) {
//        holder.tvClientName.setText(""+reportList.get(position).getClient_name());
//        holder.tvReportId.setText(""+reportList.get(position).getId());
//        holder.tvCityName.setText(""+reportList.get(position).getCityName());

        holder.rlReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view.getContext().startActivity(new Intent(context, TrendsActivity.class));

            }
        });
    }

    @Override
    public int getItemCount() {
        return feedsList.size();
    }

    static class HashTagsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvClientName;
        private TextView tvCityName;
        private RelativeLayout rlReports;
        private TextView tvReportId;


        public HashTagsViewHolder(@NonNull View itemView) {
            super(itemView);
//            tvClientName = itemView.findViewById(R.id.tv_client_name);
//            tvCityName = itemView.findViewById(R.id.tv_city_name);
//            tvReportId = itemView.findViewById(R.id.tv_report_id);
            rlReports = itemView.findViewById(R.id.rl_hashtag_and_trends);
        }
    }

}
