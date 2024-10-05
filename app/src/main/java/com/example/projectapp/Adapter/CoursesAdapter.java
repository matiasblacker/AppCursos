package com.example.projectapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.projectapp.Model.CoursesModel;
import com.example.projectapp.R;

import java.util.ArrayList;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.Viewholder> {
    ArrayList<CoursesModel> items;
    Context context;

    public CoursesAdapter(ArrayList<CoursesModel> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public CoursesAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflator = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_list, parent, false);
        context = parent.getContext();
        return new Viewholder(inflator);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesAdapter.Viewholder holder, int position) {
        holder.titulo.setText(items.get(position).getTitulo());
        holder.valor.setText("$"+items.get(position).getValor() + " CLP");

        int drawableResourceId=holder.itemView.getResources()
                        .getIdentifier(items.get(position).getPicPath(),"drawable", holder.itemView.getContext().getOpPackageName());

        Glide.with(context)
                .load(drawableResourceId)
                .into(holder.pic);

        switch(position){
            case 0:
                holder.bg.setImageResource(R.drawable.bg_1);
                holder.layout.setBackgroundResource(R.drawable.list_bg1);
                break;
            case 1:
                holder.bg.setImageResource(R.drawable.bg_2);
                holder.layout.setBackgroundResource(R.drawable.list_bg2);
                break;
            case 2:
                holder.bg.setImageResource(R.drawable.bg_3);
                holder.layout.setBackgroundResource(R.drawable.list_bg3);

                break;
            case 3:
                holder.bg.setImageResource(R.drawable.bg_4);
                holder.layout.setBackgroundResource(R.drawable.list_bg4);

                break;
            case 4:
                holder.bg.setImageResource(R.drawable.bg_5);
                holder.layout.setBackgroundResource(R.drawable.list_bg5);

                break;
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView titulo,valor;
        ImageView pic, bg;

        ConstraintLayout layout;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.tituloTxt);
            valor = itemView.findViewById(R.id.valorTxt);
            pic = itemView.findViewById(R.id.picCourse);
            bg = itemView.findViewById(R.id.bg_card);
            layout = itemView.findViewById(R.id.card_layout);
        }
    }
}
