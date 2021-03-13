package com.cubycode.clickme.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cubycode.clickme.tab.AllNotificationsFragment;
import com.cubycode.clickme.tab.AllNotificationsReplyFragment;

public class TabNotificationsAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public TabNotificationsAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AllNotificationsFragment allNotificationsFragment = new AllNotificationsFragment();
                return allNotificationsFragment;
            case 1:
                AllNotificationsReplyFragment allNotificationsReplyFragment = new AllNotificationsReplyFragment();
                return allNotificationsReplyFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}