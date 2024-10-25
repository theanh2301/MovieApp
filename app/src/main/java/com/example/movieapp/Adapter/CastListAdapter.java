package com.example.movieapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.movieapp.Domains.Cast;
import com.example.movieapp.R;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class CastListAdapter extends RecyclerView.Adapter<CastListAdapter.Viewholder> {
    ArrayList<Cast> casts;
    Context context;

    public CastListAdapter(ArrayList<Cast> casts) {
        this.casts = casts;
    }

    @NonNull
    @Override
    public CastListAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_actors, parent, false);
        return new Viewholder(inflate);

    }

    @Override
    public void onBindViewHolder(@NonNull CastListAdapter.Viewholder holder, int position) {
        Glide.with(context)
                .load(casts.get(position).getPicUrl())
                .into(holder.pic);
        holder.nameTxt.setText(casts.get(position).getActor());
    }

    @Override
    public int getItemCount() {
        return casts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        ImageView pic;
        TextView nameTxt;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            pic = itemView.findViewById(R.id.itemImage);
            nameTxt = itemView.findViewById(R.id.nameTxt);
        }
    }
}
