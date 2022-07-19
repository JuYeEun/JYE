package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {

    List<Item> BusList;
    Context context;
     OnClickShowListener mOnClickShowListener;

    public recyclerAdapter(Context context, ArrayList<Item> BusList, OnClickShowListener onClickShowListener){
        this.context = context;
        this.BusList = BusList;
        this.mOnClickShowListener = onClickShowListener;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View View = inflater.inflate(R.layout.itme, parent,false);
        return new MyViewHolder(View, mOnClickShowListener) ;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String number = BusList.get(position).getText();
        holder.tvNumber.setText(number);



    }

    @Override
    public int getItemCount() {
        return BusList.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvNumber;
        OnClickShowListener onClickShowListener;

        public MyViewHolder(final View view, OnClickShowListener onClickShowListener){
            super(view);
            tvNumber = view.findViewById(R.id.textView);
            this.onClickShowListener = onClickShowListener;
            view.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            onClickShowListener.onClickShowListener(getAdapterPosition());
        }
    }
    public interface OnClickShowListener {
        void onClickShowListener(int position);
    }
}
