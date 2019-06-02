package com.example.android.ninegag;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class PostItemViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    ImageView imageView;
    ImageButton upvoteButton;
    private ImageButton downvoteButton;
    private Button shareButton;
    private ImageButton commentButton;
    private PostItem postItem;

    public PostItemViewHolder(@NonNull View itemView, final PostItemListener listener) {
        super(itemView);
        titleView = itemView.findViewById(R.id.title_txtview);
        imageView = itemView.findViewById(R.id.post_imageview);
        upvoteButton = itemView.findViewById(R.id.upvote_button);
        downvoteButton = itemView.findViewById(R.id.downvote_button);
        shareButton = itemView.findViewById(R.id.share_button);
        commentButton = itemView.findViewById(R.id.comment_button);

        upvoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onUpBtnClicked(postItem, upvoteButton, downvoteButton);
            }
        });
        downvoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onDownBtnClicked(postItem, downvoteButton, upvoteButton);
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onShareBtnClicked(postItem);
            }
        });

        commentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onCommentBtnCLicked(postItem);
            }
        });
    }

    public void setPostItem(PostItem postItem) {
        this.postItem = postItem;
    }

    public interface PostItemListener {
        void onUpBtnClicked(PostItem item, ImageButton currentButon, ImageButton otherButton);

        void onDownBtnClicked(PostItem item, ImageButton currentButon, ImageButton otherButton);

        void onShareBtnClicked(PostItem item);

        void onCommentBtnCLicked(PostItem item);
        void onBtnClicked();
    }
}
