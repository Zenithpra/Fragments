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
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnSum;
    private EditText etFirst,etSecond;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnSum = view.findViewById(R.id.btnSum);

        btnSum.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());
        int result = first + second;
        Toast.makeText(getActivity(), "Sum is :" + result, Toast.LENGTH_SHORT).show();
    }
}
