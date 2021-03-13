package com.cubycode.clickme.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.MainActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.activities.SelectHashTagActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private Button loginBtn;
    private TextView tvSignUp;
    private Button signupBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_login);
        init();
    }

    private void init(){
        loginBtn = findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
        tvSignUp = findViewById(R.id.tv_signup);
        tvSignUp.setOnClickListener(this);
        signupBtn = findViewById(R.id.btn_signup);
        signupBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
                break;
            case R.id.tv_signup:
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
                break;
            case R.id.btn_signup:
                startActivity(new Intent(LoginActivity.this, SelectHashTagActivity.class));
                break;

        }
    }
}
