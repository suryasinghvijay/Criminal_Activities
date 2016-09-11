package com.example.vijaysurya.criminal_activities.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vijaysurya.criminal_activities.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrimeListFragment extends Fragment {


    public CrimeListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crime_list, container, false);
    }

}
//https://github.com/vijay-suryasingh/Vijay_surya_Repo.git