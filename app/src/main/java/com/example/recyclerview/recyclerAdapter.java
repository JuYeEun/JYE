package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//adapter 라는 class에 리사이클러뷰를 상속, 확장
public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {
    private ArrayList<Item> buslist;
//arrarylist <item.java>,item이 들어가있는 클래스, 이름

    public recyclerAdapter(ArrayList<Item> buslist){
        this.buslist = buslist;
//재활용
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView busnumber;
//
        public MyViewHolder(final View view){
            super(view);
            busnumber = view.findViewById(R.id.textView);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itme, parent,false);
        return new MyViewHolder(itemView) ;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String number = buslist.get(position).getText();
        holder.busnumber.setText(number);
    }

    @Override
    public int getItemCount() {
        return buslist.size();
    }


}
