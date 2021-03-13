package com.cubycode.clickme.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.cubycode.clickme.R;

import java.util.ArrayList;

public class GridViewAdapterPopularStar extends BaseAdapter {

    Context context;
    ArrayList<String> popularUserList;

    public GridViewAdapterPopularStar(Context context, ArrayList<String> popularUserList) {
        this.context = context;
        this.popularUserList = popularUserList;
    }

    @Override
    public int getCount() {
        return popularUserList.size();
    }

    @Override
    public Object getItem(int position) {
        return popularUserList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.layout_custom_gridview_adapter_popular_stars, parent, false);

        return rowView;
    }

    public interface AddDefectClickListener {
        void onClickUnSavedDefectToAdd(int position);
    }

    public interface DeleteDefectClickListener {
        void onClickSavedDefectToDelete(int position,String defectName,String defectId,String imageName);
    }

}
