package com.cubycode.clickme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.model.ProfileSettingsModel;

import java.util.ArrayList;

public class RecyclerViewAdapterProfileSettings extends RecyclerView.Adapter<RecyclerViewAdapterProfileSettings.HashTagsViewHolder> {

    Context context;
    ArrayList<ProfileSettingsModel> profileSettingsList;
    ProfileSettingsPositionListener profileSettingsPositionListener;

    public RecyclerViewAdapterProfileSettings(Context context, ArrayList<ProfileSettingsModel> profileSettingsList, ProfileSettingsPositionListener profileSettingsPositionListener) {
        this.context = context;
        this.profileSettingsList = profileSettingsList;
        this.profileSettingsPositionListener = profileSettingsPositionListener;
    }


    @NonNull
    @Override
    public HashTagsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_custom_adapter_profile_settings, parent, false);
        HashTagsViewHolder trendsViewHolder = new HashTagsViewHolder(listItem);
        return trendsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final HashTagsViewHolder holder, final int position) {

        holder.rlProfileSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                profileSettingsPositionListener.onSettingItemClick(position);

            }
        });

        holder.tvSettingsName.setText(""+profileSettingsList.get(position).getSettingsName());
        holder.tvSettingsDesc.setText(""+profileSettingsList.get(position).getSettingsDescription());

    }

    @Override
    public int getItemCount() {
        return profileSettingsList.size();
    }

    static class HashTagsViewHolder extends RecyclerView.ViewHolder {
        private TextView tvSettingsName;
        private TextView tvSettingsDesc;
        private RelativeLayout rlProfileSettings;


        public HashTagsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSettingsName = itemView.findViewById(R.id.tv_setting_name);
            tvSettingsDesc = itemView.findViewById(R.id.tv_setting_desc);
            rlProfileSettings = itemView.findViewById(R.id.rl_profile_settings);
        }
    }

    public interface ProfileSettingsPositionListener{
        void onSettingItemClick(int position);
    }

}
