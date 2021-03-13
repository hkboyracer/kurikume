package com.cubycode.clickme.authentication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.HomeActivity;
import com.cubycode.clickme.MainActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.activities.UserMarketPlaceActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // hide the title bar
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
//                SharedPreferences settings = getSharedPreferences(MyUtils.PREFS_NAME, 0);// 0 for privet mode
//                boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);
//                if(hasLoggedIn) {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
//                }else {
//                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
//                    finish();
//                }
            }
        }, 1000);

    }
}
