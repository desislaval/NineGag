package com.example.android.ninegag;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PostItemViewHolder extends RecyclerView.ViewHolder {

    TextView titleView;
    ImageView imageView;

    public PostItemViewHolder(@NonNull View itemView) {
        super(itemView);
        titleView = itemView.findViewById(R.id.title_txtview);
        imageView = itemView.findViewById(R.id.post_imageview);
    }
}
