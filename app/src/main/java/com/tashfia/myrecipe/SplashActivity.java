package com.tashfia.myrecipe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {
//duration as splash
    private static int splashTimeout=4000;//time in mili second

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        actionBar = getSupportActionBar();
        actionBar.hide();

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent = new Intent(SplashActivity.this,HomeActivity.class);
               startActivity(intent);

               finish();



           }
       },splashTimeout);
    }
}
