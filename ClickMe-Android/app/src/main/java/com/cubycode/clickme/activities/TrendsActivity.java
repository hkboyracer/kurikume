package com.cubycode.clickme.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.GridViewAdapterPopularStar;
import com.cubycode.clickme.adapter.RecyclerViewAdapterFeeds;
import com.cubycode.clickme.adapter.RecyclerViewAdapterLatestTrends;
import com.cubycode.clickme.adapter.RecyclerViewAdapterTrends;
import com.cubycode.clickme.adapter.RecyclerViewAdapterTrendsFeeds;

import java.util.ArrayList;

public class TrendsActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvTrends;
    private RecyclerView rvFeeds;
    ArrayList<String> trendsList;
    ArrayList<String> feedsList;
    RecyclerViewAdapterTrendsFeeds recyclerViewAdapterTrendsFeeds;
    RecyclerViewAdapterLatestTrends recyclerViewAdapterLatestTrends;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_trends);
        init();
        setList();
        setFeedsAdapter(getApplicationContext(),feedsList);
        setTrendsAdapter(getApplicationContext(),trendsList);
    }

    private void init(){
        rvFeeds = findViewById(R.id.rv_feeds);
        rvTrends = findViewById(R.id.rv_trends);
//        goToMainBtn.setOnClickListener(this);

    }

    void setList(){
        trendsList = new ArrayList<>();
        feedsList = new ArrayList<>();
        trendsList.add("one");
        trendsList.add("two");
        trendsList.add("three");
        trendsList.add("four");
        trendsList.add("five");
        feedsList.add("one");
        feedsList.add("two");
        feedsList.add("three");
        feedsList.add("four");
        feedsList.add("five");

    }

    void setFeedsAdapter(Context context, ArrayList<String> feedsList){
        recyclerViewAdapterTrendsFeeds = new RecyclerViewAdapterTrendsFeeds(context,feedsList);
        rvFeeds.setHasFixedSize(true);
        rvFeeds.setLayoutManager(new LinearLayoutManager(this));
        rvFeeds.setAdapter(recyclerViewAdapterTrendsFeeds);
    }

    void setTrendsAdapter(Context context, ArrayList<String> trendsList){
        recyclerViewAdapterLatestTrends = new RecyclerViewAdapterLatestTrends(context,trendsList);
        rvTrends.setHasFixedSize(true);
        rvTrends.setLayoutManager(new LinearLayoutManager(this));
        rvTrends.setAdapter(recyclerViewAdapterLatestTrends);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.btn_go_to_main:
//                startActivity(new Intent(PopularStarActivity.this, HomePageActivity.class));
//                finish();
//                break;

        }
    }
}
