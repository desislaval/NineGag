package com.example.android.ninegag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private PostItemViewHolder.PostItemListener listener;

    private static final int AD_POS = 10;

    public PostAdapter(PostItemViewHolder.PostItemListener listener) {
        this.listener = listener;
    }


    private PostItem[] posts = new PostItem[]{
            new PostItem(R.string.title_1, R.drawable.post1, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_2, R.drawable.post_2, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_3, R.drawable.post_3, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_4, R.drawable.post_4, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_5, R.drawable.post_5, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_6, R.drawable.post_6, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_7, R.drawable.post_7, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_8, R.drawable.post_8, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_9, R.drawable.post_9, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_10, R.drawable.post_10, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_1, R.drawable.post1, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_2, R.drawable.post_2, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_3, R.drawable.post_3, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_4, R.drawable.post_4, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_5, R.drawable.post_5, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_6, R.drawable.post_6, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_7, R.drawable.post_7, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_8, R.drawable.post_8, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_9, R.drawable.post_9, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
            new PostItem(R.string.title_10, R.drawable.post_10, R.drawable.ic_up_arrow, R.drawable.ic_down_arrow),
    };

    private AdItem[] adItems = {
            new AdItem(R.drawable.amazon_ad),
            new AdItem(R.drawable.sporify_ad),
            new AdItem(R.drawable.amazon_ad),
    };

    @Override
    public int getItemViewType(int position) {
        if (position % AD_POS == 0) {
            return 0;
        }
        return 1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        switch (viewType) {
            case 0:
                View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_ad, viewGroup, false);
                return new AdItemViewHolder(v, listener
                );
            case 1:
            default:
                View c = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
                return new PostItemViewHolder(c, listener);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case 0:
                AdItemViewHolder adItemViewHolder = (AdItemViewHolder) viewHolder;
                int newPos = position / 10;
                AdItem adItem = adItems[newPos];
                adItemViewHolder.img.setImageResource(adItem.imageAd);
                break;
            case 1:
                PostItemViewHolder postItemViewHolder = (PostItemViewHolder) viewHolder;
                PostItem postItem = posts[position - 1];
                postItemViewHolder.titleView.setText(postItem.imageTitle);
                postItemViewHolder.imageView.setImageResource(postItem.imageRes);
                postItemViewHolder.upvoteButton.setImageResource(postItem.upButton);
                postItemViewHolder.setPostItem(postItem);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return posts.length;
    }

}
