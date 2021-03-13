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

public class RecyclerViewAdapterTrends extends RecyclerView.Adapter<RecyclerViewAdapterTrends.TrendsViewHolder> {

    Context context;
    ArrayList<String> trendsList;

    public RecyclerViewAdapterTrends(Context context, ArrayList<String> trendsList) {
        this.context = context;
        this.trendsList = trendsList;
    }

    //    public RecyclerViewAdapterReports(Context context, ArrayList<ReportsModel> reportList) {
//        this.context = context;
//        this.reportList = reportList;
//        Paper.init(context);
//    }

    @NonNull
    @Override
    public TrendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_custom_adapter_trends_and_hashtags, parent, false);
        TrendsViewHolder trendsViewHolder = new TrendsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TrendsViewHolder holder, final int position) {
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
        return trendsList.size();
    }

    static class TrendsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvClientName;
        private TextView tvCityName;
        private RelativeLayout rlReports;
        private TextView tvReportId;


        public TrendsViewHolder(@NonNull View itemView) {
            super(itemView);
//            tvClientName = itemView.findViewById(R.id.tv_client_name);
//            tvCityName = itemView.findViewById(R.id.tv_city_name);
//            tvReportId = itemView.findViewById(R.id.tv_report_id);
//            rlReports = itemView.findViewById(R.id.rl_reports);
        }
    }

}
