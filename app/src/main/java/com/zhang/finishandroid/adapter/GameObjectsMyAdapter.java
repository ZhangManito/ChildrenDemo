package com.zhang.finishandroid.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhang.finishandroid.R;
import com.zhang.finishandroid.model.GameObjects;

import java.util.List;

/**
 * Created by 张国梁 on 2017/5/20.
 */

public class GameObjectsMyAdapter extends RecyclerView.Adapter<GameObjectsMyAdapter.ViewHolder>{
    private List<GameObjects> mGameObjectsList;
    public GameObjectsMyAdapter(List<GameObjects> list){
        mGameObjectsList =list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.game_objects_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        GameObjects objects=mGameObjectsList.get(position);
        holder.textView.setText(objects.getTitle());
        holder.imageView.setBackgroundResource(objects.getImageId());
    }

    @Override
    public int getItemCount() {
        return mGameObjectsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= (ImageView) itemView.findViewById(R.id.go_image);
            textView= (TextView) itemView.findViewById(R.id.go_text);
        }
    }
}
