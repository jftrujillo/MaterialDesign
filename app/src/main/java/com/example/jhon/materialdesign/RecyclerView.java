package com.example.jhon.materialdesign;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.jhon.materialdesign.Adapters.PostresRecylerAdapter;
import com.example.jhon.materialdesign.model.Postre;

public class RecyclerView extends AppCompatActivity {
    Toolbar toolbar;
    android.support.v7.widget.RecyclerView recyclerView;
    android.support.v7.widget.RecyclerView.Adapter adapter;
    android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    CollapsingToolbarLayout colapse;
    AppBarLayout appBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        colapse = (CollapsingToolbarLayout) findViewById(R.id.colapse);
        colapse.setExpandedTitleColor(getResources().getColor(android.R.color.black));
        colapse.setCollapsedTitleTextColor(getResources().getColor(android.R.color.white));
        appBar = (AppBarLayout) findViewById(R.id.app_bar_layout);
        recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.recycler_view);
        setSupportActionBar(toolbar);

        colapse.setTitle("RecyclerView");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = new PostresRecylerAdapter(Postre.initPostres(),this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return true;
    }
}
