package com.example.edu_app;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TrendingAdapter extends RecyclerView.Adapter<TrendingAdapter.ViewHolder> {

    private Context context;
    private List<TrendingItem> trendingList;

    public TrendingAdapter(Context context, List<TrendingItem> trendingList) {
        this.context = context;
        this.trendingList = trendingList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_trending, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TrendingItem item = trendingList.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvLikes.setText(item.getLikes() + " disukai");
        holder.imgTrending.setImageResource(item.getImageResId());
    }

    @Override
    public int getItemCount() {
        return trendingList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvLikes;
        ImageView imgTrending;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTrendingTitle);
            tvLikes = itemView.findViewById(R.id.tvTrendingLikes);
            imgTrending = itemView.findViewById(R.id.imgTrending);
        }
    }
}