package com.example.recyclerviewtest;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecyclerView  extends RecyclerView.Adapter<ModelRecyclerView.ViewHolder> {

    ArrayList<ModelClass> arrayList;
    Context context;

    public ModelRecyclerView(Context context, ArrayList<ModelClass> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getNumber());
        holder.textView2.setText(arrayList.get(position).getInfo());

        holder.cardView.setOnClickListener(view -> {
           Toast.makeText(context, position +"번째 버스 " , Toast.LENGTH_LONG).show();

            Intent intent = new Intent(context, MainActivity2.class);
            intent.putExtra("flag",arrayList.get(position).getImage());
            intent.putExtra("number",arrayList.get(position).getNumber());
            intent.putExtra("info",arrayList.get(position).getInfo());
            context.startActivity(intent);

        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView1, textView2;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }
}
