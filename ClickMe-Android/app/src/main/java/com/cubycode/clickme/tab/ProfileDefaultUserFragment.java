package com.cubycode.clickme.tab;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterPopularPost;

import java.util.ArrayList;

public class ProfileDefaultUserFragment extends Fragment implements View.OnClickListener {

    //    private NotificationsViewModel notificationsViewModel;
    private RecyclerView rvFeeds;
    RecyclerViewAdapterPopularPost recyclerViewAdapterPopularPost;
    ArrayList<String> notificationsList;
    Context applicationContext = getActivity();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile_default_user, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        init(root);
        setList();
        setFeedsAdapter(applicationContext, notificationsList);
        return root;
    }

    private void init(View view){
        rvFeeds = view.findViewById(R.id.rv_profile_default_user);
    }

    void setList(){
        notificationsList = new ArrayList<>();
        notificationsList.add("one");
        notificationsList.add("two");
        notificationsList.add("three");
        notificationsList.add("four");
        notificationsList.add("five");
        notificationsList.add("six");
        notificationsList.add("seven");

    }

    void setFeedsAdapter(Context context, ArrayList<String> feedsList){
        recyclerViewAdapterPopularPost = new RecyclerViewAdapterPopularPost(context,feedsList);
        rvFeeds.setHasFixedSize(true);
        rvFeeds.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvFeeds.setAdapter(recyclerViewAdapterPopularPost);
    }


    @Override
    public void onClick(View v) {

    }


}
