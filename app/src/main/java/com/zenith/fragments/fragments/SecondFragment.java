package com.zenith.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zenith.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btncircle;
    private EditText etradius;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        etradius = view.findViewById(R.id.etradius);
        btncircle = view.findViewById(R.id.btncircle);

        btncircle.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int radius = Integer.parseInt(etradius.getText().toString());
        int result = (2*22/7)* radius;

        Toast.makeText(getActivity(), "radius is :" + result, Toast.LENGTH_SHORT).show();

    }
}