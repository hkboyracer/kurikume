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

public class RecyclerViewAdapterFeeds extends RecyclerView.Adapter<RecyclerViewAdapterFeeds.FeedsViewHolder> {

    Context context;
    ArrayList<String> feedsList;

    public RecyclerViewAdapterFeeds(Context context, ArrayList<String> feedsList) {
        this.context = context;
        this.feedsList = feedsList;
    }

    @NonNull
    @Override
    public FeedsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_custom_adapter_feeds, parent, false);
        FeedsViewHolder trendsViewHolder = new FeedsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeedsViewHolder holder, final int position) {
//        holder.tvClientName.setText(""+reportList.get(position).getClient_name());
//        holder.tvReportId.setText(""+reportList.get(position).getId());
//        holder.tvCityName.setText(""+reportList.get(position).getCityName());

//        holder.rlReports.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                currentReportId = reportList.get(position).getId();
//                currentPosition = position;
//                Paper.book().write("current_report_id",currentReportId);
//                Paper.book().write("current_report_position",currentPosition);
////                view.getContext().startActivity(new Intent(context,MainActivity.class));
//                Intent intent = new Intent(context,MainActivity.class);
//                intent.putExtra("report_id",reportList.get(position).getId());
//                view.getContext().startActivity(intent);
//                listCheck = true;
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return feedsList.size();
    }

    static class FeedsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvClientName;
        private TextView tvCityName;
        private RelativeLayout rlReports;
        private TextView tvReportId;


        public FeedsViewHolder(@NonNull View itemView) {
            super(itemView);
//            tvClientName = itemView.findViewById(R.id.tv_client_name);
//            tvCityName = itemView.findViewById(R.id.tv_city_name);
//            tvReportId = itemView.findViewById(R.id.tv_report_id);
//            rlReports = itemView.findViewById(R.id.rl_reports);
        }
    }

}
