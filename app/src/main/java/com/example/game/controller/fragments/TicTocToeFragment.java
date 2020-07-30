package com.example.game.controller.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.game.R;
import com.example.game.model.NameOfTicTocToe;
import com.example.game.model.TicTocToe;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class TicTocToeFragment extends Fragment {
    private Button mButtonTurn;
    private Button[][] mButtonTicTocToe = new Button[3][3];
    private TicTocToe mTicTocToeX = new TicTocToe(NameOfTicTocToe.X);
    private TicTocToe mTicTocToeO = new TicTocToe(NameOfTicTocToe.O);


    public TicTocToeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tictoctoe, container, false);
        findAllViews(view);
        mButtonTurn.setText("X");

        setClickListeners(view);
        return view;
    }

    private void setClickListeners(View view) {
        mButtonTicTocToe[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[0][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[0][0].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[0][0].setEnabled(false);


            }
        });

        mButtonTicTocToe[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[0][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[0][1].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[0][1].setEnabled(false);
            }
        });

        mButtonTicTocToe[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[0][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[0][2].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[0][2].setEnabled(false);
            }
        });

        mButtonTicTocToe[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[1][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[1][0].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[1][0].setEnabled(false);
            }
        });

        mButtonTicTocToe[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[1][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[1][1].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[1][1].setEnabled(false);
            }
        });

        mButtonTicTocToe[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[1][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[1][2].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[1][2].setEnabled(false);
            }
        });

        mButtonTicTocToe[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[2][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[2][0].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[2][0].setEnabled(false);
            }
        });

        mButtonTicTocToe[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[2][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[2][1].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[2][1].setEnabled(false);
            }
        });

        mButtonTicTocToe[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mButtonTurn.getText().toString().equals("X")) {
                    mButtonTicTocToe[2][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mButtonTicTocToe[2][2].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[2][2].setEnabled(false);
            }
        });
    }


    private void findAllViews(View view) {
        mButtonTurn = view.findViewById(R.id.button_turn);
        mButtonTicTocToe[0][0] = view.findViewById(R.id.button_0_0);
        mButtonTicTocToe[0][1] = view.findViewById(R.id.button_0_1);
        mButtonTicTocToe[0][2] = view.findViewById(R.id.button_0_2);
        mButtonTicTocToe[1][0] = view.findViewById(R.id.button_1_0);
        mButtonTicTocToe[1][1] = view.findViewById(R.id.button_1_1);
        mButtonTicTocToe[1][2] = view.findViewById(R.id.button_1_2);
        mButtonTicTocToe[2][0] = view.findViewById(R.id.button_2_0);
        mButtonTicTocToe[2][1] = view.findViewById(R.id.button_2_1);
        mButtonTicTocToe[2][2] = view.findViewById(R.id.button_2_2);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }


    public void checkWinner(String turn) {
        String line = mButtonTicTocToe[0][0].getText().toString() + mButtonTicTocToe[0][1].getText().toString() + mButtonTicTocToe[0][2].getText().toString();
        String line1 = mButtonTicTocToe[1][0].getText().toString() + mButtonTicTocToe[1][1].getText().toString() + mButtonTicTocToe[1][2].getText().toString();
        String line2 = mButtonTicTocToe[2][0].getText().toString() + mButtonTicTocToe[2][1].getText().toString() + mButtonTicTocToe[2][2].getText().toString();
        if (line.equals("XXX") || line.equals("OOO") || line1.equals("XXX") || line1.equals("OOO") || line2.equals("XXX") || line2.equals("OOO")) {
            Snackbar.make(getView(), "winner :" + turn, Snackbar.LENGTH_LONG).show();
            disable();
        } else {
            line = mButtonTicTocToe[0][0].getText().toString() + mButtonTicTocToe[1][0].getText().toString() + mButtonTicTocToe[2][0].getText().toString();
            line1 = mButtonTicTocToe[0][1].getText().toString() + mButtonTicTocToe[1][1].getText().toString() + mButtonTicTocToe[2][1].getText().toString();
            line2 = mButtonTicTocToe[0][2].getText().toString() + mButtonTicTocToe[1][2].getText().toString() + mButtonTicTocToe[2][2].getText().toString();
            if (line.equals("XXX") || line.equals("OOO") || line1.equals("XXX") || line1.equals("OOO") || line2.equals("XXX") || line2.equals("OOO")) {
                Snackbar.make(getView(), "winner :" + turn, Snackbar.LENGTH_LONG).show();
                disable();
            } else {
                line = mButtonTicTocToe[0][0].getText().toString() + mButtonTicTocToe[1][1].getText().toString() + mButtonTicTocToe[2][2].getText().toString();
                line1 = mButtonTicTocToe[2][0].getText().toString() + mButtonTicTocToe[1][1].getText().toString() + mButtonTicTocToe[0][2].getText().toString();
                if (line.equals("XXX") || line.equals("OOO") || line1.equals("XXX") || line1.equals("OOO")) {
                    Snackbar.make(getView(), "winner :" + turn, Snackbar.LENGTH_LONG).show();
                    disable();
                }
            }
        }
    }

    public void disable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mButtonTicTocToe[i][j].setEnabled(false);
            }
        }
    }
}