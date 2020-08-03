package com.example.game.controller.fragments;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.game.R;
import com.example.game.model.NameOfTicTocToe;
import com.example.game.model.Row;
import com.example.game.model.TicTocToe;

import static com.example.game.R.color.colorBlue;

public class RowFragment extends Fragment {
    private Button mButtonTurn;
    private Button[][] mButtonRow = new Button[5][5];
    private Row mRow;
//    private TicTocToe mRowPlayer;

    public RowFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (savedInstanceState != null) {
//            mTicTocToeX = (TicTocToe) savedInstanceState.getSerializable(KAY_BUNDLE_TIC_TAC_TOE);
//            update();
//        } else {
//            mTicTocToeX = new TicTocToe(NameOfTicTocToe.X);
//        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_row, container, false);
        findAllViews(view);
        mButtonTurn.setBackgroundColor(R.color.colorRed);

        setClickListeners(view);

        return view;
    }

    private void setClickListeners(View view) {
        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void findAllViews(View view) {
        mButtonTurn = view.findViewById(R.id.button_r_turn);
        mButtonRow[0][0] = view.findViewById(R.id.button_r_0_0);
        mButtonRow[0][1] = view.findViewById(R.id.button_r_0_1);
        mButtonRow[0][2] = view.findViewById(R.id.button_r_0_2);
        mButtonRow[0][3] = view.findViewById(R.id.button_r_0_3);
        mButtonRow[0][4] = view.findViewById(R.id.button_r_0_4);
        mButtonRow[1][0] = view.findViewById(R.id.button_r_1_0);
        mButtonRow[1][1] = view.findViewById(R.id.button_r_1_1);
        mButtonRow[1][2] = view.findViewById(R.id.button_r_1_2);
        mButtonRow[1][3] = view.findViewById(R.id.button_r_1_3);
        mButtonRow[1][4] = view.findViewById(R.id.button_r_1_4);
        mButtonRow[2][0] = view.findViewById(R.id.button_r_2_0);
        mButtonRow[2][1] = view.findViewById(R.id.button_r_2_1);
        mButtonRow[2][2] = view.findViewById(R.id.button_r_2_2);
        mButtonRow[2][3] = view.findViewById(R.id.button_r_2_3);
        mButtonRow[2][4] = view.findViewById(R.id.button_r_2_4);
        mButtonRow[3][0] = view.findViewById(R.id.button_r_3_0);
        mButtonRow[3][1] = view.findViewById(R.id.button_r_3_1);
        mButtonRow[3][2] = view.findViewById(R.id.button_r_3_2);
        mButtonRow[3][3] = view.findViewById(R.id.button_r_3_3);
        mButtonRow[3][4] = view.findViewById(R.id.button_r_3_4);
        mButtonRow[4][0] = view.findViewById(R.id.button_r_4_0);
        mButtonRow[4][1] = view.findViewById(R.id.button_r_4_1);
        mButtonRow[4][2] = view.findViewById(R.id.button_r_4_2);
        mButtonRow[4][3] = view.findViewById(R.id.button_r_4_3);
        mButtonRow[4][4] = view.findViewById(R.id.button_r_4_4);
    }

    public void enable(){
        
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int colorId = mButtonRow[i][j].getSolidColor();
                if (colorId != Color.GRAY ){

                }
            }

        }
    }
}