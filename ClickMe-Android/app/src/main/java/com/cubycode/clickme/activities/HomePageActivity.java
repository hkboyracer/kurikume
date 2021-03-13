package com.cubycode.clickme.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.HomeActivity;
import com.cubycode.clickme.MainActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.authentication.LoginActivity;
import com.cubycode.clickme.authentication.SignUpActivity;

public class HomePageActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView goToMainBtn;
    private TextView tvSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_homepage);
        init();
    }

    private void init(){
        goToMainBtn = findViewById(R.id.btn_go_to_main);
        goToMainBtn.setOnClickListener(this);
//        tvSignUp = findViewById(R.id.tv_signup);
//        tvSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_go_to_main:
                startActivity(new Intent(HomePageActivity.this, HomeActivity.class));
                finish();
                break;
//            case R.id.tv_signup:
//                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
//                break;

        }
    }
}
