package com.example.tumblr.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tumblr.R;
import com.example.tumblr.data.model.Post;

import java.util.ArrayList;

public class Post_list_adapter extends RecyclerView.Adapter<Post_list_adapter.Holder> {
    LayoutInflater inflater;
    Context context;
    ArrayList<Post> postList = new ArrayList<>();

    public Post_list_adapter(Context context, ArrayList<Post> postList) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.post, viewGroup, false);
        return  new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Post_list_adapter.Holder holder, int i) {
        Post post = postList.get(i);
        holder.userImageView.setImageResource(post.getUser().getImage());
        holder.usernameTextView.setText(post.getUser().getName());
        holder.postImageView.setImageResource(post.getImage_post());
        holder.captionTitleTextView.setText(post.getCaption_title());
        holder.captionTextView.setText(post.getCaption());
        holder.noteTextView.setText(post.getNote());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class Holder extends RecyclerView.ViewHolder{

        ImageView postImageView;
        ImageView userImageView;
        TextView usernameTextView;
        TextView captionTitleTextView;
        TextView captionTextView;
        TextView noteTextView;
        public Holder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imageView_post);
            userImageView = itemView.findViewById(R.id.imageView_user);
            usernameTextView = itemView.findViewById(R.id.textView_user_name);
            captionTextView = itemView.findViewById(R.id.textView_caption);
            captionTitleTextView = itemView.findViewById(R.id.textView_caption_title);
            noteTextView = itemView.findViewById(R.id.textView_note);

        }
    }
}
