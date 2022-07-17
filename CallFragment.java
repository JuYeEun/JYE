package com.cookandroid.jye;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CallFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<ModelClass>();



    public CallFragment() {
// Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);


        arrayList.add(new ModelClass(R.drawable.energe,"720","3분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"7722","4분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"761","5분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"7613","7분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"753","8분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"571","10분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"571","12분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"720","13분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"7722","14분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"761","15분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"7613","17분후 도착"));
        arrayList.add(new ModelClass(R.drawable.energe,"753","21분후 도착"));


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(),arrayList);
        recyclerView.setAdapter(adapter);


        return view;
    }
}