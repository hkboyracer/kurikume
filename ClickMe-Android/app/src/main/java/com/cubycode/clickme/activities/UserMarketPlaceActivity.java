package com.cubycode.clickme.activities;

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

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterFeeds;
import com.cubycode.clickme.adapter.RecyclerViewAdapterHashTags;
import com.cubycode.clickme.adapter.RecyclerViewAdapterMarketPlace;
import com.cubycode.clickme.adapter.RecyclerViewAdapterMarketPlaceCategories;
import com.cubycode.clickme.adapter.RecyclerViewAdapterPopularStars;
import com.cubycode.clickme.adapter.RecyclerViewAdapterTrends;
import com.cubycode.clickme.footer_activities.AboutUsActivity;
import com.cubycode.clickme.footer_activities.ContactUsActivity;
import com.cubycode.clickme.footer_activities.DisclaimerActivity;
import com.cubycode.clickme.footer_activities.PrivacyPolicyActivity;
import com.cubycode.clickme.footer_activities.TermsOfServiceActivity;

import java.util.ArrayList;

public class UserMarketPlaceActivity extends AppCompatActivity implements View.OnClickListener {


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
    RecyclerViewAdapterMarketPlace recyclerViewAdapterMarketPlace;
    RecyclerViewAdapterMarketPlaceCategories recyclerViewAdapterMarketPlaceCategories;
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
        setContentView(R.layout.activity_user_marketplace);

        init();
        setListeners();
        setList();
        setFeedsAdapter(getApplicationContext(),feedsList);
        setTrendsAdapter(getApplicationContext(),trendsList);
        setPopularStarsAdapter(getApplicationContext(),popularStarsList);
        setHashTagsAdapter(getApplicationContext(),hashTagsList);
    }

    void init(){
        rvTrends = findViewById(R.id.rv_one_marketplace);
        rvFeeds = findViewById(R.id.rv_two_marketplace);
        rvPopularStars = findViewById(R.id.rv_three_marketplace);
        rvHashTags = findViewById(R.id.rv_four_marketplace);
        ivSearchToolbar = findViewById(R.id.iv_search_toolbar);
//        rlSearchBar = findViewById(R.id.rl_searchbar_for_toolbar);
//        rlSearchIvForToolbar = findViewById(R.id.rl_search_iv_for_toolbar);
        tvAboutUs = findViewById(R.id.tv_about_us);
        tvContactUs = findViewById(R.id.tv_contact_us);
        tvDisclaimer = findViewById(R.id.tv_disclaimer);
        tvPrivacyPolicy = findViewById(R.id.tv_privacy_policy);
        tvTermsOfService = findViewById(R.id.tv_terms_of_service);
//        llScrollToTop = findViewById(R.id.ll_scroll_to_top);
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
//        rlSearchBar.setOnClickListener(this);
//        rlSearchIvForToolbar.setOnClickListener(this);
        tvAboutUs.setOnClickListener(this);
        tvContactUs.setOnClickListener(this);
        tvDisclaimer.setOnClickListener(this);
        tvPrivacyPolicy.setOnClickListener(this);
        tvTermsOfService.setOnClickListener(this);
//        llScrollToTop.setOnClickListener(this);
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
        recyclerViewAdapterMarketPlace = new RecyclerViewAdapterMarketPlace(context,feedsList);
        rvFeeds.setHasFixedSize(true);
        rvFeeds.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvFeeds.setAdapter(recyclerViewAdapterMarketPlace);
    }

    void setTrendsAdapter(Context context, ArrayList<String> trendsList){
        recyclerViewAdapterMarketPlaceCategories = new RecyclerViewAdapterMarketPlaceCategories(context,trendsList);
        rvTrends.setHasFixedSize(true);
        rvTrends.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvTrends.setAdapter(recyclerViewAdapterMarketPlaceCategories);
    }

    void setHashTagsAdapter(Context context, ArrayList<String> hashTagsList){
        recyclerViewAdapterMarketPlace = new RecyclerViewAdapterMarketPlace(context,trendsList);
        rvHashTags.setHasFixedSize(true);
        rvHashTags.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rvHashTags.setAdapter(recyclerViewAdapterMarketPlace);
    }

    void setPopularStarsAdapter(Context context, ArrayList<String> popularStarsList){
        recyclerViewAdapterMarketPlace = new RecyclerViewAdapterMarketPlace(context,trendsList);
        rvPopularStars.setHasFixedSize(true);
        rvPopularStars.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        rvPopularStars.setAdapter(recyclerViewAdapterMarketPlace);
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
                startActivity(new Intent(UserMarketPlaceActivity.this, AboutUsActivity.class));
                break;
            case R.id.tv_contact_us:
                startActivity(new Intent(UserMarketPlaceActivity.this, ContactUsActivity.class));
                break;
            case R.id.tv_disclaimer:
                startActivity(new Intent(UserMarketPlaceActivity.this, DisclaimerActivity.class));
                break;
            case R.id.tv_privacy_policy:
                startActivity(new Intent(UserMarketPlaceActivity.this, PrivacyPolicyActivity.class));
                break;
            case R.id.tv_terms_of_service:
                startActivity(new Intent(UserMarketPlaceActivity.this, TermsOfServiceActivity.class));
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