package com.zhang.finishandroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhang.finishandroid.R;
import com.zhang.finishandroid.model.Games;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Games> gamesList;

    public MyAdapter(List<Games> list) {
        gamesList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.games_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Games games = gamesList.get(position);
        holder.games_title.setText(games.getTitle());
        holder.games_content.setText(games.getContent());
        holder.games_image.setBackgroundResource(games.getImages());
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView games_image;
        TextView games_title, games_content;

        public ViewHolder(View itemView) {
            super(itemView);
            games_image = (ImageView) itemView.findViewById(R.id.games_image);
            games_title = (TextView) itemView.findViewById(R.id.games_title);
            games_content = (TextView) itemView.findViewById(R.id.games_content);

        }
    }
}
