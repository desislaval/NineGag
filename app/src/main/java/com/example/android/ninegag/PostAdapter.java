package com.example.android.ninegag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PostAdapter extends RecyclerView.Adapter<PostItemViewHolder> {


    private PostItem[] posts = new PostItem[]{
            new PostItem(R.string.title_1, R.drawable.post1),
            new PostItem(R.string.title_2, R.drawable.post_2),
            new PostItem(R.string.title_3, R.drawable.post_3),
            new PostItem(R.string.title_4, R.drawable.post_4),
            new PostItem(R.string.title_5, R.drawable.post_5),
            new PostItem(R.string.title_6, R.drawable.post_6),
            new PostItem(R.string.title_7, R.drawable.post_7),
            new PostItem(R.string.title_8, R.drawable.post_8),
            new PostItem(R.string.title_9, R.drawable.post_9),
            new PostItem(R.string.title_10, R.drawable.post_10),
    };

    @NonNull
    @Override
    public PostItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        PostItemViewHolder itemViewHolder = new PostItemViewHolder(v);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostItemViewHolder postItemViewHolder, int postition) {
        PostItem postItem = posts[postition];
        postItemViewHolder.titleView.setText(postItem.imageTitle);
        postItemViewHolder.imageView.setImageResource(postItem.imageRes);
    }

    @Override
    public int getItemCount() {
        return posts.length;
    }
}
