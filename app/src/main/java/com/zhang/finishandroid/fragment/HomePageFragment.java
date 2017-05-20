package com.zhang.finishandroid.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

import com.zhang.finishandroid.R;
import com.zhang.finishandroid.adapter.GameObjectsMyAdapter;
import com.zhang.finishandroid.adapter.MyAdapter;
import com.zhang.finishandroid.model.GameObjects;
import com.zhang.finishandroid.model.Games;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomePageFragment extends BaseFragment {


    public HomePageFragment() {
        // Required empty public constructor
    }

    public static List<Games> gamesList = new ArrayList<>();
    public static List<Games> gamesList1 = new ArrayList<>();
    public static List<GameObjects> objectsList = new ArrayList<>();

    static {
        Games games = new Games();
        games.setTitle("翻花绳");
        games.setImages(R.drawable.simple_game1);
        games.setContent("女孩子首先");
        gamesList.add(games);
        games = new Games();
        games.setTitle("挑棍");
        games.setImages(R.drawable.simple_game2);
        games.setContent("儿童益智游戏");
        gamesList.add(games);
        games = new Games();
        games.setTitle("抓石子儿");
        games.setImages(R.drawable.simple_game3);
        games.setContent("提高孩子的动手能力");
        gamesList.add(games);

        games = new Games();
        games.setTitle("翻花绳");
        games.setImages(R.drawable.simple_game1);
        games.setContent("女孩子首先");
        gamesList1.add(games);
        games = new Games();
        games.setTitle("挑棍");
        games.setImages(R.drawable.simple_game2);
        games.setContent("儿童益智游戏");
        gamesList1.add(games);
        games = new Games();
        games.setTitle("抓石子儿");
        games.setImages(R.drawable.simple_game3);
        games.setContent("提高孩子的动手能力");
        gamesList1.add(games);

        GameObjects objects = new GameObjects();
        objects.setTitle("青蛙跳");
        objects.setImageId(R.drawable.simple_game_good1);
        objectsList.add(objects);
        objects = new GameObjects();
        objects.setTitle("青蛙跳");
        objects.setImageId(R.drawable.simple_game_good2);
        objectsList.add(objects);
        objects = new GameObjects();
        objects.setTitle("青蛙跳");
        objects.setImageId(R.drawable.simple_game_good3);
        objectsList.add(objects);
        objects = new GameObjects();
        objects.setTitle("青蛙跳");
        objects.setImageId(R.drawable.simple_game_good4);
        objectsList.add(objects);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_page, container, false);
//        ScrollView scrollView= (ScrollView) view.findViewById(R.id.scroll_view);
//
        loadingRecycler(view, R.id.indoor_games, gamesList);
        loadingRecycler(view, R.id.outdoors_games, gamesList1);
        loadingRecyclerObjects(view, R.id.game_objects1, objectsList);
        loadingRecyclerObjects(view, R.id.game_objects2, objectsList);
        return view;
    }

    /**
     * 加载游戏物品RecyclerView数据
     *
     * @param view
     * @param RecyclerId
     * @param gameObjects
     */
    private void loadingRecyclerObjects(View view, int RecyclerId, List<GameObjects> gameObjects) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(RecyclerId);
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        GridLayoutManager manager = new GridLayoutManager(mContext, 4);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new GameObjectsMyAdapter(gameObjects));
    }

    /**
     * 加载游戏RecyclerView数据
     *
     * @param view
     * @param RecyclerId
     * @param games
     */
    private void loadingRecycler(View view, int RecyclerId, List<Games> games) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(RecyclerId);
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        GridLayoutManager manager = new GridLayoutManager(mContext, 3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter(games));
    }

}
