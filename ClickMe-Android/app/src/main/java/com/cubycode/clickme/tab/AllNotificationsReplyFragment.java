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
import com.cubycode.clickme.adapter.RecyclerViewAdapterReplyNotifications;

import java.util.ArrayList;

public class AllNotificationsReplyFragment extends Fragment implements View.OnClickListener {

    //    private NotificationsViewModel notificationsViewModel;
    private RecyclerView rvReplyNotifications;
    RecyclerViewAdapterReplyNotifications recyclerViewAdapterNotifications;
    ArrayList<String> notificationsList;
    Context applicationContext = getActivity();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.all_fragment_reply_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        init(root);
        setList();
        setNotificationsAdapter(applicationContext, notificationsList);
        return root;
    }

    private void init(View view){
        rvReplyNotifications = view.findViewById(R.id.rv_reply_notifications);
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

    void setNotificationsAdapter(Context context, ArrayList<String> notificationsList){
        recyclerViewAdapterNotifications = new RecyclerViewAdapterReplyNotifications(context,notificationsList);
        rvReplyNotifications.setHasFixedSize(true);
        rvReplyNotifications.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvReplyNotifications.setAdapter(recyclerViewAdapterNotifications);
    }

    @Override
    public void onClick(View v) {

    }


}
