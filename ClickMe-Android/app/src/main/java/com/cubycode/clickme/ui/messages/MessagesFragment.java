package com.cubycode.clickme.ui.messages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.HomeActivity;
import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterMessages;
import com.cubycode.clickme.adapter.RecyclerViewAdapterPopularUser;
import com.cubycode.clickme.ui.home.HomeViewModel;

import java.util.ArrayList;

public class MessagesFragment extends Fragment implements View.OnClickListener {

    private RecyclerView rvHashTags;
    RecyclerViewAdapterMessages recyclerViewAdapterHashTags;
    ArrayList<String> hashTagsList;
    Context applicationContext = getActivity();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_messages, container, false);
        init(root);
        setList();
        setHashTagsAdapter(applicationContext,hashTagsList);
        HomeActivity.tvHeaderHome.setText("メッセージ");
        return root;
    }

    private void init(View view){
        rvHashTags = view.findViewById(R.id.rv_messages);

    }

    void setList(){
        hashTagsList = new ArrayList<>();
        hashTagsList.add("one");
        hashTagsList.add("two");
        hashTagsList.add("three");
        hashTagsList.add("four");
        hashTagsList.add("five");
        hashTagsList.add("six");
        hashTagsList.add("seven");
    }

    void setHashTagsAdapter(Context context, ArrayList<String> hashTagsList){
        recyclerViewAdapterHashTags = new RecyclerViewAdapterMessages(context,hashTagsList);
        rvHashTags.setHasFixedSize(true);
        rvHashTags.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvHashTags.setAdapter(recyclerViewAdapterHashTags);
    }

    @Override
    public void onClick(View v) {

    }


}
