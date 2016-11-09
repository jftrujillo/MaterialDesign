package com.example.jhon.materialdesign.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jhon.materialdesign.R;
import com.example.jhon.materialdesign.interfaces.RecyclerInterface;
import com.example.jhon.materialdesign.model.Postre;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by jhon on 2/11/16.
 */

public class PostresRecylerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Postre> data;
    Context context;
    RecyclerInterface recyclerInterface;
    public PostresRecylerAdapter(List<Postre> data, Context context,RecyclerInterface recyclerInterface) {
        this.data = data;
        this.context = context;
        this.recyclerInterface = recyclerInterface;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_postres_adapter,parent,false);
        Viewholder viewholder = new Viewholder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Viewholder viewholder = (Viewholder) holder;
        viewholder.nombre.setText(data.get(position).getNomnbre());
        viewholder.ingredientes.setText(data.get(position).getIngredientes());
        viewholder.precio.setText(data.get(position).getPrecion());
        Picasso.with(context).load(data.get(position).getImgUrl()).into(viewholder.imagen);
        viewholder.setInterface(recyclerInterface,position,data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class Viewholder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView nombre, ingredientes,precio;

        public Viewholder(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            precio = (TextView) itemView.findViewById(R.id.precio);
            ingredientes = (TextView) itemView.findViewById(R.id.ingredientes);
        }

        public void setInterface(final RecyclerInterface recyclerInterface,final int pos, final Postre postre){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerInterface.OnItemRecyclerClickListener(pos,postre);
                }
            });
            imagen.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerInterface.OnImageRecyclerClickListener(pos,postre.getImgUrl());
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    recyclerInterface.OnLongRecyclerClickListener(pos);
                    return true;
                }
            });
        }
    }

}
