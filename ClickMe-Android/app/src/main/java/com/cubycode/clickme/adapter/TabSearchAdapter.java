package com.cubycode.clickme.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cubycode.clickme.tab.AllNotificationsFragment;
import com.cubycode.clickme.tab.AllNotificationsReplyFragment;
import com.cubycode.clickme.tab.HashTagsFragment;
import com.cubycode.clickme.tab.PopularPostFragment;
import com.cubycode.clickme.tab.PopularUserFragment;

public class TabSearchAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public TabSearchAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HashTagsFragment hashTagsFragment = new HashTagsFragment();
                return hashTagsFragment;
            case 1:
                PopularUserFragment popularUserFragment = new PopularUserFragment();
                return popularUserFragment;
            case 2:
                PopularPostFragment popularPostFragment = new PopularPostFragment();
                return popularPostFragment;
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