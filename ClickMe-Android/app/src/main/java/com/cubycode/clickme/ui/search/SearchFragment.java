package com.cubycode.clickme.ui.search;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.cubycode.clickme.HomeActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterSelectHashTags;
import com.cubycode.clickme.adapter.TabNotificationsAdapter;
import com.cubycode.clickme.adapter.TabSearchAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class SearchFragment extends Fragment implements View.OnClickListener {

    Context applicationContext = getActivity();
    TabLayout tabLayout;
    ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_search, container, false);
        init(root);
        HomeActivity.tvHeaderHome.setText("検索");
        setTabLayoutAdapter(applicationContext);
        return root;
    }

    private void init(View view){
        tabLayout = view.findViewById(R.id.tab_layout_search);
        viewPager = view.findViewById(R.id.view_pager_search);
        tabLayout.addTab(tabLayout.newTab().setText("ハッシュタグ"));
        tabLayout.addTab(tabLayout.newTab().setText("注目のユーザー"));
        tabLayout.addTab(tabLayout.newTab().setText("人気の投稿"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }

    void setTabLayoutAdapter(Context context){
        final TabSearchAdapter adapter = new TabSearchAdapter(context,getChildFragmentManager(), tabLayout.getTabCount());
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