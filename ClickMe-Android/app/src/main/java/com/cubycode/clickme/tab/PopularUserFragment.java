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
import com.cubycode.clickme.adapter.RecyclerViewAdapterPopularUser;

import java.util.ArrayList;

public class PopularUserFragment extends Fragment implements View.OnClickListener {

    private RecyclerView rvHashTags;
    RecyclerViewAdapterPopularUser recyclerViewAdapterHashTags;
    ArrayList<String> hashTagsList;
    Context applicationContext = getActivity();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_popular_user, container, false);
//        final TextView textView = root.findViewById(R.id.text_notifications);
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        init(root);
        setList();
        setHashTagsAdapter(applicationContext,hashTagsList);
        return root;
    }

    private void init(View view){
        rvHashTags = view.findViewById(R.id.rv_popular_user);

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
        recyclerViewAdapterHashTags = new RecyclerViewAdapterPopularUser(context,hashTagsList);
        rvHashTags.setHasFixedSize(true);
        rvHashTags.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvHashTags.setAdapter(recyclerViewAdapterHashTags);
    }

    @Override
    public void onClick(View v) {

    }


}
