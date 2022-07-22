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

    View v;
    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList = new ArrayList<ModelClass>();


    public ContactFragment() {
// Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
  v = inflater.inflate(R.layout.fragment_contact, container, false);


        recyclerView = v.findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(), arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return v;
    }
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


//
        arrayList.add(new ModelClass(R.drawable.energe, "갈현동성당", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "권춘섭집앞", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe,"욕쟁이할머니", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "권상철집앞", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "갈현1동주민센터", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "비계", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "고도리버스정류장", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "오로리", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "냅떼", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "와우", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "흑석동한강현대아파트", "기점-종점"));
        arrayList.add(new ModelClass(R.drawable.energe, "가게앞", "기점-종점"));


        }



}