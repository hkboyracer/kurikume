package com.cubycode.clickme.ui.notifications;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.cubycode.clickme.HomeActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.TabNotificationsAdapter;
import com.google.android.material.tabs.TabLayout;

public class NotificationsFragment extends Fragment implements View.OnClickListener {

    Context applicationContext = getActivity();
    TabLayout tabLayout;
    ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        init(root);
        setTabLayoutAdapter(applicationContext);
        HomeActivity.tvHeaderHome.setText("通知");
        return root;
    }

    private void init(View view){
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPager = view.findViewById(R.id.viewPager);
        tabLayout.addTab(tabLayout.newTab().setText("すべて"));
        tabLayout.addTab(tabLayout.newTab().setText("返信"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    void setTabLayoutAdapter(Context context){
        final TabNotificationsAdapter adapter = new TabNotificationsAdapter(context,getChildFragmentManager(), tabLayout.getTabCount());
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