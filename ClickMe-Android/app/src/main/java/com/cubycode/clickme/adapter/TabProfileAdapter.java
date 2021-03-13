package com.cubycode.clickme.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cubycode.clickme.tab.FavoritePostsFragment;
import com.cubycode.clickme.tab.HashTagsFragment;
import com.cubycode.clickme.tab.PopularPostFragment;
import com.cubycode.clickme.tab.PopularUserFragment;
import com.cubycode.clickme.tab.ProfileDefaultUserFragment;
import com.cubycode.clickme.tab.ProfileOtherUserFragment;

public class TabProfileAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public TabProfileAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ProfileDefaultUserFragment profileDefaultUserFragment = new ProfileDefaultUserFragment();
                return profileDefaultUserFragment;
            case 1:
                ProfileOtherUserFragment profileOtherUserFragment = new ProfileOtherUserFragment();
                return profileOtherUserFragment;
            case 2:
                FavoritePostsFragment favoritePostsFragment = new FavoritePostsFragment();
                return favoritePostsFragment;
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