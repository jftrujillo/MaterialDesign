package com.example.jhon.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import com.example.jhon.materialdesign.Adapters.PostresRecylerAdapter;
import com.example.jhon.materialdesign.model.Postre;

public class RecyclerView extends AppCompatActivity {
    Toolbar toolbar;
    android.support.v7.widget.RecyclerView recyclerView;
    android.support.v7.widget.RecyclerView.Adapter adapter;
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recycler_view);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RecyclerView");
        adapter = new PostresRecylerAdapter(Postre.initPostres(),this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
