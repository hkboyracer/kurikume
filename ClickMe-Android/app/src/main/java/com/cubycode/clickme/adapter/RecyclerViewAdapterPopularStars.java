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
import com.cubycode.clickme.activities.PopularStarActivity;

import java.util.ArrayList;

public class RecyclerViewAdapterPopularStars extends RecyclerView.Adapter<RecyclerViewAdapterPopularStars.PopularStarsViewHolder> {

    Context context;
    ArrayList<String> feedsList;

    public RecyclerViewAdapterPopularStars(Context context, ArrayList<String> feedsList) {
        this.context = context;
        this.feedsList = feedsList;
    }

    @NonNull
    @Override
    public PopularStarsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_custom_adapter_popular_stars, parent, false);
        PopularStarsViewHolder trendsViewHolder = new PopularStarsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PopularStarsViewHolder holder, final int position) {
//        holder.tvClientName.setText(""+reportList.get(position).getClient_name());
//        holder.tvReportId.setText(""+reportList.get(position).getId());
//        holder.tvCityName.setText(""+reportList.get(position).getCityName());

        holder.rlPopularUserCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view.getContext().startActivity(new Intent(context, PopularStarActivity.class));

            }
        });
    }

    @Override
    public int getItemCount() {
        return feedsList.size();
    }

    static class PopularStarsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvClientName;
        private TextView tvCityName;
        private RelativeLayout rlPopularUserCell;
        private TextView tvReportId;


        public PopularStarsViewHolder(@NonNull View itemView) {
            super(itemView);
//            tvClientName = itemView.findViewById(R.id.tv_client_name);
//            tvCityName = itemView.findViewById(R.id.tv_city_name);
//            tvReportId = itemView.findViewById(R.id.tv_report_id);
            rlPopularUserCell = itemView.findViewById(R.id.rl_popular_user_cell);
        }
    }

}
