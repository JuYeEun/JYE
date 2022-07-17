package com.cookandroid.jye;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ContactFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<ModelClass>();



    public ContactFragment() {
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


        arrayList.add(new ModelClass(R.drawable.otver,"갈현동성당","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"권춘섭집앞","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"욕쟁이할머니","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"권상철집앞","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"갈현1동주민센터","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"비계","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"고도리버스정류장","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"오로리","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"냅떼","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"와우","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"흑석동한강현대아파트","기점-종점"));
        arrayList.add(new ModelClass(R.drawable.otver,"가게앞","기점-종점"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(),arrayList);
        recyclerView.setAdapter(adapter);


        return view;
    }
}