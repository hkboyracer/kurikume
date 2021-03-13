package com.cubycode.clickme.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.TabProfileAdapter;
import com.google.android.material.tabs.TabLayout;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    Context applicationContext = ProfileActivity.this;
    TabLayout tabLayout;
    ViewPager viewPager;

//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        View root = inflater.inflate(R.layout.fragment_profile, container, false);
//        init(root);
//        setTabLayoutAdapter(applicationContext);
//        return root;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.fragment_profile);
        init();
        setTabLayoutAdapter(applicationContext);

    }

    private void init(){
        tabLayout = findViewById(R.id.tab_layout_profile);
        viewPager = findViewById(R.id.view_pager_profile);
        tabLayout.addTab(tabLayout.newTab().setText("すべて"));
        tabLayout.addTab(tabLayout.newTab().setText("メディア"));
        tabLayout.addTab(tabLayout.newTab().setText("いいね"));
//        tabLayout.addTab(tabLayout.newTab().setText("いいね"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    void setTabLayoutAdapter(Context context){
        final TabProfileAdapter adapter = new TabProfileAdapter(context,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void onClick(View v) {

    }

}