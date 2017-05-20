package com.zhang.finishandroid.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zhang.finishandroid.R;

/**
 * Created by Administrator on 2017/5/20.
 */

public class UserDefinedView extends RelativeLayout {

    private ImageView image_header;
    private TextView userText;
    private View view;

    public UserDefinedView(Context context) {
        super(context);
    }

    public UserDefinedView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.user_defined_item, this);
        //获取当前组件控件所有的元素
        image_header = (ImageView) findViewById(R.id.image_header);
        userText = (TextView) findViewById(R.id.user_text);
        view = findViewById(R.id.view_divider);
        // 获取当前组合控件中所有的元素
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.UserDefinedView);

        Drawable image = a.getDrawable(R.styleable.UserDefinedView_image_header);
        String user = a.getString(R.styleable.UserDefinedView_user_text);
        boolean is_divider = a.getBoolean(R.styleable.UserDefinedView_is_divider_visibility, false);

        if (image != null) {
            image_header.setImageDrawable(image);
        }
        userText.setText(user);
        view.setVisibility(is_divider ? VISIBLE : GONE);
    }
}
