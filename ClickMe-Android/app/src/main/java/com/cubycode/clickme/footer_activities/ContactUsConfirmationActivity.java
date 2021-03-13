package com.cubycode.clickme.footer_activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cubycode.clickme.R;

public class ContactUsConfirmationActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.activity_contactus_confirmation);

        TextView btnContactUs = findViewById(R.id.tv_contact_sent);
        btnContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(ContactUsConfirmationActivity.this, "Message sent", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
