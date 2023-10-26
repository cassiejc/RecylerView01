package com.example.recylerview01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private ArrayList<Book> mylist;

    public CustomAdapter(ArrayList<Book> mylist) {
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlayout,parent,false);
        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book current = mylist.get(position);
        int image = current.image;
        String title = current.title;
        String description = current.description;

        holder.ivCover.setImageResource(image);
        holder.tvTitle.setText(title);
        holder.tvDescription.setText(description);
        setAnimation(holder.itemView);
    }

    @Override
    public int getItemCount() {
        return mylist.size();
    }

    private void setAnimation (View v) {
        ScaleAnimation animation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(800);
        v.startAnimation(animation);
    }

}
