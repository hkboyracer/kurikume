package com.cubycode.clickme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cubycode.clickme.R;

import java.util.ArrayList;

public class CustomAdapterGender extends BaseAdapter {

    Context context;
    ArrayList<String> genderList;
//    StandardsClickListener standardsClickListener;

    public CustomAdapterGender(Context context, ArrayList<String> genderList) {
        this.context = context;
        this.genderList = genderList;
    }

    @Override
    public int getCount() {
        return genderList.size();
    }

    @Override
    public Object getItem(int position) {
        return genderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_custom_adapter_spinner_items, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.tv_item_list);
        textView.setText(genderList.get(position)+"");
//        if (standardsClickListener != null){
//            standardsClickListener.onClickStandards(genderList.get(position).getPk_standard_id());
//        }

        return rowView;

    }

    public interface StandardsClickListener{
        void onClickStandards(int position);
    }
}
