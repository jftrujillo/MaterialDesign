package com.example.jhon.materialdesign.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.jhon.materialdesign.model.Postre;

import java.util.List;

/**
 * Created by jhon on 2/11/16.
 */

public class PostresRecylerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Postre> data;
    Context context;

    public PostresRecylerAdapter(List<Postre> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
