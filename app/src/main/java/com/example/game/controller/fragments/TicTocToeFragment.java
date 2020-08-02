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

import java.io.Serializable;

public class TicTocToeFragment extends Fragment implements Serializable {
    public static final String KAY_BUNDLE_TIC_TAC_TOE = "kay bundle TicTacToe";
    private Button mButtonTurn;
    private Button[][] mButtonTicTocToe = new Button[3][3];
    private TicTocToe mTicTocToeX;


    public TicTocToeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null) {
            mTicTocToeX = (TicTocToe) savedInstanceState.getSerializable(KAY_BUNDLE_TIC_TAC_TOE);
            update();
        } else {
            mTicTocToeX = new TicTocToe(NameOfTicTocToe.X);
        }
        mTicTocToeX.setButtonList(mButtonTicTocToe);

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
                    mTicTocToeX.mButtonList[0][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[0][0].setText("O");
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
                    mTicTocToeX.mButtonList[0][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[0][1].setText("O");
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
                    mTicTocToeX.mButtonList[0][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[0][2].setText("O");
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
                    mTicTocToeX.mButtonList[1][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[1][0].setText("O");
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
                    mTicTocToeX.mButtonList[1][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[1][1].setText("O");
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
                    mTicTocToeX.mButtonList[1][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[1][2].setText("O");
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
                    mTicTocToeX.mButtonList[2][0].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[2][0].setText("O");
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
                    mTicTocToeX.mButtonList[2][1].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[2][1].setText("O");
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
                    mTicTocToeX.mButtonList[2][2].setText("X");
                    mButtonTurn.setText("O");
                    checkWinner("X");
                } else {
                    mTicTocToeX.mButtonList[2][2].setText("O");
                    mButtonTurn.setText("X");
                    checkWinner("O");
                }
                mButtonTicTocToe[2][2].setEnabled(false);
            }
        });
    }


    private void findAllViews(View view) {
        mButtonTurn = view.findViewById(R.id.button_turn);
        mTicTocToeX.mButtonList[0][0] = view.findViewById(R.id.button_0_0);
        mTicTocToeX.mButtonList[0][1] = view.findViewById(R.id.button_0_1);
        mTicTocToeX.mButtonList[0][2] = view.findViewById(R.id.button_0_2);
        mTicTocToeX.mButtonList[1][0] = view.findViewById(R.id.button_1_0);
        mTicTocToeX.mButtonList[1][1] = view.findViewById(R.id.button_1_1);
        mTicTocToeX.mButtonList[1][2] = view.findViewById(R.id.button_1_2);
        mTicTocToeX.mButtonList[2][0] = view.findViewById(R.id.button_2_0);
        mTicTocToeX.mButtonList[2][1] = view.findViewById(R.id.button_2_1);
        mTicTocToeX.mButtonList[2][2] = view.findViewById(R.id.button_2_2);
    }

    public void checkWinner(String turn) {
        String line = mTicTocToeX.getButtonList()[0][0].getText().toString() + mTicTocToeX.getButtonList()[0][1].getText().toString() + mTicTocToeX.getButtonList()[0][2].getText().toString();
        String line1 = mTicTocToeX.getButtonList()[1][0].getText().toString() + mTicTocToeX.getButtonList()[1][1].getText().toString() + mTicTocToeX.getButtonList()[1][2].getText().toString();
        String line2 = mTicTocToeX.getButtonList()[2][0].getText().toString() + mTicTocToeX.getButtonList()[2][1].getText().toString() + mTicTocToeX.getButtonList()[2][2].getText().toString();
        if (line.equals("XXX") || line.equals("OOO") || line1.equals("XXX") || line1.equals("OOO") || line2.equals("XXX") || line2.equals("OOO")) {
            Snackbar.make(getView(), "winner :" + turn, Snackbar.LENGTH_LONG).show();
            disable();
        } else {
            line = mTicTocToeX.getButtonList()[0][0].getText().toString() + mTicTocToeX.getButtonList()[1][0].getText().toString() + mTicTocToeX.getButtonList()[2][0].getText().toString();
            line1 = mTicTocToeX.getButtonList()[0][1].getText().toString() + mTicTocToeX.getButtonList()[1][1].getText().toString() + mTicTocToeX.getButtonList()[2][1].getText().toString();
            line2 = mTicTocToeX.getButtonList()[0][2].getText().toString() + mTicTocToeX.getButtonList()[1][2].getText().toString() + mTicTocToeX.getButtonList()[2][2].getText().toString();
            if (line.equals("XXX") || line.equals("OOO") || line1.equals("XXX") || line1.equals("OOO") || line2.equals("XXX") || line2.equals("OOO")) {
                Snackbar.make(getView(), "winner :" + turn, Snackbar.LENGTH_LONG).show();
                disable();
            } else {
                line = mTicTocToeX.getButtonList()[0][0].getText().toString() + mTicTocToeX.getButtonList()[1][1].getText().toString() + mTicTocToeX.getButtonList()[2][2].getText().toString();
                line1 = mTicTocToeX.getButtonList()[2][0].getText().toString() + mTicTocToeX.getButtonList()[1][1].getText().toString() + mTicTocToeX.getButtonList()[0][2].getText().toString();
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

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(KAY_BUNDLE_TIC_TAC_TOE, mTicTocToeX);

    }

    public void update() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mTicTocToeX.mButtonList[i][j] != null) {
//                    mButtonTicTocToe[i][j].setText(mTicTocToeX.mButtonList[i][j].getText().toString());
                    mTicTocToeX.mButtonList[i][j].setEnabled(false);
//                    mButtonTicTocToe[i][j].setEnabled(false);
                }
            }
        }
    }
}