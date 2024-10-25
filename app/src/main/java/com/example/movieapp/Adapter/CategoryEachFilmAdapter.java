package com.example.movieapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.R;

import java.util.List;

public class CategoryEachFilmAdapter extends RecyclerView.Adapter<CategoryEachFilmAdapter.Viewholder> {
    List<String> item;
    Context context;

    public CategoryEachFilmAdapter(List<String> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public CategoryEachFilmAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_category, parent, false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryEachFilmAdapter.Viewholder holder, int position) {
    holder.titleTxt.setText(item.get(position));
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView titleTxt;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.titleTxt);
        }
    }
}
