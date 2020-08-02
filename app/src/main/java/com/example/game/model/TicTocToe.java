package com.example.game.model;

import android.widget.Button;

import java.io.Serializable;
import java.util.List;

public class TicTocToe implements Serializable {
    public Button[][] mButtonList;
    private String turn;
    private NameOfTicTocToe name;

    public void setButtonList(Button[][] buttonList) {
        mButtonList = buttonList;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public void setName(NameOfTicTocToe name) {
        this.name = name;
    }

    public Button[][] getButtonList() {
        return mButtonList;
    }

    public String getTurn() {
        return turn;
    }

    public NameOfTicTocToe getName() {
        return name;
    }


    public TicTocToe(NameOfTicTocToe name) {
        this.name = name;
    }

}
