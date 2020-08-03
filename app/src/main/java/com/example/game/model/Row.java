package com.example.game.model;

import android.widget.Button;

public class Row {
    private Button[][] mButtonRow;
    private String turn = "blue";

    public Row(Button[][] buttonRow) {
        mButtonRow = buttonRow;
    }

    public void setButtonRow(Button[][] buttonRow) {
        mButtonRow = buttonRow;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public Button[][] getButtonRow() {
        return mButtonRow;
    }

    public String getTurn() {
        return turn;
    }
}
