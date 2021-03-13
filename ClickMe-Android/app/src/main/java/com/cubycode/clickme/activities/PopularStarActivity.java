package com.cubycode.clickme.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.GridViewAdapterPopularStar;

import java.util.ArrayList;

public class PopularStarActivity extends AppCompatActivity implements View.OnClickListener {

    private GridView gvPopularUser;
    GridViewAdapterPopularStar gridViewAdapterPopularStar;
    ArrayList<String> popularUserList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_popular_user);
        init();
        setList();
        setHashTagsAdapter(getApplicationContext(), popularUserList);
    }

    private void init(){
//        goToMainBtn = findViewById(R.id.btn_go_to_main);
        gvPopularUser = findViewById(R.id.gv_popular_user);
//        goToMainBtn.setOnClickListener(this);

    }

    void setList(){
        popularUserList = new ArrayList<>();
        popularUserList.add("one");
        popularUserList.add("two");
        popularUserList.add("three");
        popularUserList.add("four");
        popularUserList.add("five");
    }

    void setHashTagsAdapter(Context context, ArrayList<String> hashTagsList){
        gridViewAdapterPopularStar = new GridViewAdapterPopularStar(context,hashTagsList);
        gvPopularUser.setAdapter(gridViewAdapterPopularStar);
        gridViewAdapterPopularStar.notifyDataSetChanged();
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
