package com.example.restuapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// create fragment and change name as in model

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ResFragmentSingle#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ResFragmentSingle extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "resName";
    private static final String ARG_PARAM2 = "resPrice";
    private static final String ARG_PARAM3 = "resIngredients";

    // TODO: Rename and change types of parameters
    private String mresName;
    private String mresPrice;
    private String mresIngredients;

    public ResFragmentSingle() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mresName Parameter 1.
     * @param mresPrice Parameter 2.
     * @param mresIngredients Parameter 3.
     * @return A new instance of fragment ResFragmentSingle.
     */
    // TODO: Rename and change types and number of parameters
    public static ResFragmentSingle newInstance(String mresName, String mresPrice,String mresIngredients) {
        ResFragmentSingle fragment = new ResFragmentSingle();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, mresName);
        args.putString(ARG_PARAM2, mresPrice);
        args.putString(ARG_PARAM3, mresIngredients);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mresName = getArguments().getString(ARG_PARAM1);
            mresPrice = getArguments().getString(ARG_PARAM2);
            mresIngredients = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_res_single, container, false);
    }
}