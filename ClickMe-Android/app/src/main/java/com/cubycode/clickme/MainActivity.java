package com.cubycode.clickme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.cubycode.clickme.adapter.RecyclerViewAdapterFeeds;
import com.cubycode.clickme.adapter.RecyclerViewAdapterHashTags;
import com.cubycode.clickme.adapter.RecyclerViewAdapterPopularStars;
import com.cubycode.clickme.adapter.RecyclerViewAdapterTrends;
import com.cubycode.clickme.footer_activities.AboutUsActivity;
import com.cubycode.clickme.footer_activities.ContactUsActivity;
import com.cubycode.clickme.footer_activities.DisclaimerActivity;
import com.cubycode.clickme.footer_activities.PrivacyPolicyActivity;
import com.cubycode.clickme.footer_activities.TermsOfServiceActivity;

import java.util.ArrayList;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {


    private RecyclerView rvTrends;
    private RecyclerView rvFeeds;
    private RecyclerView rvHashTags;
    private RecyclerView rvPopularStars;
    ArrayList<String> trendsList;
    ArrayList<String> feedsList;
    ArrayList<String> popularStarsList;
    ArrayList<String> hashTagsList;
    RecyclerViewAdapterFeeds recyclerViewAdapterFeeds;
    RecyclerViewAdapterTrends recyclerViewAdapterTrends;
    RecyclerViewAdapterHashTags recyclerViewAdapterHashTags;
    RecyclerViewAdapterPopularStars recyclerViewAdapterPopularStars;
    ImageView ivSearchToolbar;
    RelativeLayout rlSearchBar;
    RelativeLayout rlSearchIvForToolbar;
    TextView tvAboutUs;
    TextView tvContactUs;
    TextView tvDisclaimer;
    TextView tvPrivacyPolicy;
    TextView tvTermsOfService;
    LinearLayout llScrollToTop;
    NestedScrollView nestedScrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_main);

        init();
        setListeners();
        setList();
        setFeedsAdapter(getApplicationContext(),feedsList);
        setTrendsAdapter(getApplicationContext(),trendsList);
        setPopularStarsAdapter(getApplicationContext(),popularStarsList);
        setHashTagsAdapter(getApplicationContext(),hashTagsList);
    }

    void init(){
        rvTrends = findViewById(R.id.rv_trends);
        rvFeeds = findViewById(R.id.rv_feeds);
        rvPopularStars = findViewById(R.id.rv_popular_stars);
        rvHashTags = findViewById(R.id.rv_hashtags);
        ivSearchToolbar = findViewById(R.id.iv_search_toolbar);
        rlSearchBar = findViewById(R.id.rl_searchbar_for_toolbar);
        rlSearchIvForToolbar = findViewById(R.id.rl_search_iv_for_toolbar);
        tvAboutUs = findViewById(R.id.tv_about_us);
        tvContactUs = findViewById(R.id.tv_contact_us);
        tvDisclaimer = findViewById(R.id.tv_disclaimer);
        tvPrivacyPolicy = findViewById(R.id.tv_privacy_policy);
        tvTermsOfService = findViewById(R.id.tv_terms_of_service);
        llScrollToTop = findViewById(R.id.ll_scroll_to_top);
        nestedScrollView = findViewById(R.id.nested_scrollview);
    }

    void setList(){
        feedsList = new ArrayList<>();
        trendsList = new ArrayList<>();
        hashTagsList = new ArrayList<>();
        popularStarsList = new ArrayList<>();
        feedsList.add("one");
        feedsList.add("two");
        feedsList.add("three");
        feedsList.add("four");
        feedsList.add("five");
        trendsList.add("one");
        trendsList.add("two");
        trendsList.add("three");
        trendsList.add("four");
        trendsList.add("five");
        popularStarsList.add("one");
        popularStarsList.add("two");
        popularStarsList.add("three");
        popularStarsList.add("four");
        popularStarsList.add("five");
        hashTagsList.add("one");
        hashTagsList.add("two");
        hashTagsList.add("three");
        hashTagsList.add("four");
        hashTagsList.add("five");
    }

    void setListeners(){
        ivSearchToolbar.setOnClickListener(this);
        rlSearchBar.setOnClickListener(this);
        rlSearchIvForToolbar.setOnClickListener(this);
        tvAboutUs.setOnClickListener(this);
        tvContactUs.setOnClickListener(this);
        tvDisclaimer.setOnClickListener(this);
        tvPrivacyPolicy.setOnClickListener(this);
        tvTermsOfService.setOnClickListener(this);
        llScrollToTop.setOnClickListener(this);
        nestedScrollView.setOnClickListener(this);
    }

    void setSlider(){

//        ImageSlider imageSlider = findViewById(R.id.slider);
//        ArrayList<SlideModel> slideModels = new ArrayList<>();
//        slideModels.add(new SlideModel("https://p.ecopetit.cat/wpic/lpic/26-263518_tumblr-photography-wallpaper-rocks-on-earth-background.jpg","1 Image"));
//        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","2 Image"));
//        slideModels.add(new SlideModel("https://live.staticflickr.com/7006/6621416427_8504865e6a_z.jpg","3 Image"));
//        imageSlider.setImageList(slideModels, ImageView.ScaleType.CENTER);
    }

    void setFeedsAdapter(Context context, ArrayList<String> feedsList){
        recyclerViewAdapterFeeds = new RecyclerViewAdapterFeeds(context,feedsList);
        rvFeeds.setHasFixedSize(true);
        rvFeeds.setLayoutManager(new LinearLayoutManager(this));
        rvFeeds.setAdapter(recyclerViewAdapterFeeds);
    }

    void setTrendsAdapter(Context context, ArrayList<String> trendsList){
        recyclerViewAdapterTrends = new RecyclerViewAdapterTrends(context,trendsList);
        rvTrends.setHasFixedSize(true);
        rvTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rvTrends.setAdapter(recyclerViewAdapterTrends);
    }

    void setHashTagsAdapter(Context context, ArrayList<String> hashTagsList){
        recyclerViewAdapterHashTags = new RecyclerViewAdapterHashTags(context,hashTagsList);
        rvHashTags.setHasFixedSize(true);
        rvHashTags.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rvHashTags.setAdapter(recyclerViewAdapterHashTags);
    }

    void setPopularStarsAdapter(Context context, ArrayList<String> popularStarsList){
        recyclerViewAdapterPopularStars = new RecyclerViewAdapterPopularStars(context,popularStarsList);
        rvPopularStars.setHasFixedSize(true);
        rvPopularStars.setLayoutManager(new LinearLayoutManager(this));
        rvPopularStars.setAdapter(recyclerViewAdapterPopularStars);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_search_toolbar:
                rlSearchBar.setVisibility(View.VISIBLE);
                break;
            case R.id.rl_search_iv_for_toolbar:
                rlSearchBar.setVisibility(View.GONE);
                break;
            case R.id.tv_about_us:
                startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
                break;
            case R.id.tv_contact_us:
                startActivity(new Intent(MainActivity.this, ContactUsActivity.class));
                break;
            case R.id.tv_disclaimer:
                startActivity(new Intent(MainActivity.this, DisclaimerActivity.class));
                break;
            case R.id.tv_privacy_policy:
                startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
                break;
            case R.id.tv_terms_of_service:
                startActivity(new Intent(MainActivity.this, TermsOfServiceActivity.class));
                break;
            case R.id.ll_scroll_to_top:
                nestedScrollView.fullScroll(ScrollView.FOCUS_UP);
                break;

        }

    }

    public String getURLForResource (int resourceId) {
        //use BuildConfig.APPLICATION_ID instead of R.class.getPackage().getName() if both are not same
        return Uri.parse("android.resource://"+R.class.getPackage().getName()+"/" +resourceId).toString();
    }
}