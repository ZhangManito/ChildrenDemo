package com.zhang.finishandroid.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/5/20.
 */

public class BaseFragment extends Fragment{
    public static Context mContext;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }
}
