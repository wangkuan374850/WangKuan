package com.example.wangkuan.day_2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.a2);
        Button b2 = (Button) findViewById(R.id.a3);
        supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.a1, new Framgment1(), "a").commit();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.a1, new Framgment1(), "b").commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.a1, new Framgment2(), "c").commit();
            }
        });
        Log.i(TAG, "onCreate----------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart----------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume----------------------");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause----------------------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop----------------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy----------------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart----------------------");
    }
}
