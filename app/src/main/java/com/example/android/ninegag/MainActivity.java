package com.example.android.ninegag;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import com.example.android.ninegag.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setContentView(R.layout.activity_main);

        initRecViews();
    }

    private void initRecViews() {
        RecyclerView recyclerView = findViewById(R.id.rec_view);
        PostAdapter adapter = new PostAdapter(new PostItemViewHolder.PostItemListener() {
            @Override
            public void onUpBtnClicked(PostItem item, ImageButton currentButon, ImageButton otherButton) {
                if (item.downButton == R.drawable.ic_down_clicked) {
                    otherButton.setImageResource(R.drawable.ic_down_arrow);
                    item.downButton = R.drawable.ic_down_arrow;
                    item.setDownButton(item.downButton);
                }
                currentButon.setImageResource(R.drawable.ic_up_clicked);
                item.upButton = R.drawable.ic_up_clicked;
                item.setUpButton(item.upButton);
            }

            @Override
            public void onDownBtnClicked(PostItem item, ImageButton currentButon, ImageButton otherButton) {
                if (item.upButton == R.drawable.ic_up_clicked) {
                    otherButton.setImageResource(R.drawable.ic_up_arrow);
                    item.upButton = R.drawable.ic_up_arrow;
                    item.setUpButton(item.upButton);
                }
                currentButon.setImageResource(R.drawable.ic_down_clicked);
                item.downButton = R.drawable.ic_down_clicked;
                item.setDownButton(item.downButton);
            }

            @Override
            public void onShareBtnClicked(PostItem item) {


            }

            @Override
            public void onCommentBtnCLicked(PostItem item) {
                String text = getResources().getString(item.getImageTitle());
                Intent commentIntent = new Intent(MainActivity.this, CommentActivity.class);
                commentIntent.putExtra("title", text);
                startActivity(commentIntent);
            }

            @Override
            public void onBtnClicked() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(browserIntent);
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
