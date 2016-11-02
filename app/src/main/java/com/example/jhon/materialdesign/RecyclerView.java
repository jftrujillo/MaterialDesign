package com.example.jhon.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class RecyclerView extends AppCompatActivity {
    Toolbar toolbar;
    android.support.v7.widget.RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recycler_view);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RecyclerView");

    }
}
