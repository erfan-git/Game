package com.example.game.controller.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.game.R;
import com.example.game.model.TicTocToe;

public class RowFragment extends Fragment {
    private Button mButtonTurn;
    private Button[][] mButtonRow = new Button[5][5];
    private TicTocToe mRowPlayer;

    public RowFragment() {
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
        View view = inflater.inflate(R.layout.fragment_row, container, false);
        return view;
    }
}