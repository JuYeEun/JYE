package com.cookandroid.jye;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Dialog dialog;
    Context context;
    ArrayList<ModelClass> arrayList ;



    public RecyclerViewAdapter(Context context, ArrayList<ModelClass> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ////7022
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        final ViewHolder vHolder = new ViewHolder(v);


        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_contact);
       dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));




        //////////////////////////
        vHolder.layout_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "DDDD" + String.valueOf(vHolder.getAdapterPosition()),Toast.LENGTH_LONG).show();

                TextView dialog_Number_tv = dialog.findViewById(R.id.dialog_Number_tv);

                dialog_Number_tv.setText(arrayList.get(vHolder.getAdapterPosition()).getName());

                dialog.show();

            }
        });
        return vHolder;

        /////
        /*
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder; */
        ////
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d("onBindView", "position =" + position + "number = " + arrayList.get(position).getNumber());
        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder {

        private  ImageView imageView;
        private  TextView textView1, textView2;
        private LinearLayout layout_l;
        private Button btnBook;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //뷰홀더에서 선언된 객체와 card_view.xml 위젯들의 Id
            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            layout_l = itemView.findViewById(R.id.layout_l);
            btnBook = itemView.findViewById(R.id.btnBook);





        }
    }
}