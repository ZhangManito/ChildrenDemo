package com.zhang.finishandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class AdvertisementActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertisement);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                sharedPreferences = getSharedPreferences("Advertisement",MODE_PRIVATE);
                if (!sharedPreferences.getBoolean("isShow",false)) {
                    startActivity(new Intent(AdvertisementActivity.this, WelcomePageActivity.class));
                    editor = sharedPreferences.edit();
                    editor.putBoolean("isShow",true).commit();

                }else {
                    startActivity((new Intent(AdvertisementActivity.this, LoginActivity.class)));
                }
            }
        },2000);
    }
}
