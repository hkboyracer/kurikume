package com.cubycode.clickme.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterHashTags;
import com.cubycode.clickme.adapter.RecyclerViewAdapterSelectHashTags;

import java.util.ArrayList;

public class SelectHashTagActivity extends AppCompatActivity implements View.OnClickListener {


    private Button goToMainBtn;
    private RecyclerView rvHashTags;
    RecyclerViewAdapterSelectHashTags recyclerViewAdapterHashTags;
    ArrayList<String> hashTagsList;
    TextView tvHeaderName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_select_hashtag);
        init();
        setList();
        setHashTagsAdapter(getApplicationContext(),hashTagsList);
    }

    private void init(){
        goToMainBtn = findViewById(R.id.btn_go_to_main);
        tvHeaderName = findViewById(R.id.tv_header_page_name);
        tvHeaderName.setText("ホットな話題");
        rvHashTags = findViewById(R.id.rv_hashtags);
        goToMainBtn.setOnClickListener(this);

    }

    void setList(){
        hashTagsList = new ArrayList<>();
        hashTagsList.add("one");
        hashTagsList.add("two");
        hashTagsList.add("three");
        hashTagsList.add("four");
        hashTagsList.add("five");
    }

    void setHashTagsAdapter(Context context, ArrayList<String> hashTagsList){
        recyclerViewAdapterHashTags = new RecyclerViewAdapterSelectHashTags(context,hashTagsList);
        rvHashTags.setHasFixedSize(true);
        rvHashTags.setLayoutManager(new LinearLayoutManager(this));
        rvHashTags.setAdapter(recyclerViewAdapterHashTags);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_go_to_main:
                startActivity(new Intent(SelectHashTagActivity.this, HomePageActivity.class));
                finish();
                break;

        }
    }
}
