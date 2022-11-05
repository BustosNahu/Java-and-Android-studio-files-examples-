package com.example.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("life cycle event: ", "in onCreate()");

    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("life cycle event: ", "in onStart()");

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("life cycle event: ", "in onStop()");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("life cycle event: ", "in onPause()");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("life cycle event: ", "in onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life cycle event: ", "in onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life cycle event: ", "in onRestart()");

    }
}