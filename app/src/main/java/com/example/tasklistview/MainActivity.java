package com.example.tasklistview;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tasklistview.Fragment.HewanFagment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();

        fm.beginTransaction()
                .add(R.id.homelayout, new HewanFagment())
                .addToBackStack("yoyo")
                .commit();
    }
}
