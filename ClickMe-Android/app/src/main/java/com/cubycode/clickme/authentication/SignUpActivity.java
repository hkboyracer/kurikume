package com.cubycode.clickme.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.R;
import com.cubycode.clickme.activities.SelectHashTagActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


    private Button signupBtn;
    private TextView tvSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_signup);
        init();
    }

    private void init(){
        signupBtn = findViewById(R.id.btn_signup);
        signupBtn.setOnClickListener(this);
//        tvSignUp = findViewById(R.id.tv_signup);
//        tvSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_signup:
                startActivity(new Intent(SignUpActivity.this, SelectHashTagActivity.class));
                break;
//            case R.id.tv_signup:
//                startActivity(new Intent(SignUpActivity.this, SignUpActivity.class));
//                break;

        }
    }
}
