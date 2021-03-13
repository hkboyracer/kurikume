package com.cubycode.clickme.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.RecyclerViewAdapterBookmark;

import java.util.ArrayList;

public class BookmarkActivity extends AppCompatActivity implements View.OnClickListener {

    //    private NotificationsViewModel notificationsViewModel;
    private RecyclerView rvBookmark;
    RecyclerViewAdapterBookmark recyclerViewAdapterBookmark;
    ArrayList<String> bookmarksList;
    Context applicationContext = BookmarkActivity.this;

//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        View root = inflater.inflate(R.layout.fragment_bookmark, container, false);
//
//        init(root);
//        setList();
//        setBookmarksAdapter(applicationContext, bookmarksList);
//        return root;
//}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.fragment_bookmark);
        init();
        setList();
        setBookmarksAdapter(applicationContext, bookmarksList);
    }

        private void init(){
        rvBookmark = findViewById(R.id.rv_bookmark);
    }

    void setList(){
        bookmarksList = new ArrayList<>();
        bookmarksList.add("one");
        bookmarksList.add("two");
        bookmarksList.add("three");
        bookmarksList.add("four");
        bookmarksList.add("five");
        bookmarksList.add("six");
        bookmarksList.add("seven");
    }

    void setBookmarksAdapter(Context context, ArrayList<String> bookmarksList){
        recyclerViewAdapterBookmark = new RecyclerViewAdapterBookmark(context,bookmarksList);
        rvBookmark.setHasFixedSize(true);
        rvBookmark.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvBookmark.setAdapter(recyclerViewAdapterBookmark);
    }

    @Override
    public void onClick(View v) {

    }

}