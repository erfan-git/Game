package com.example.game.controller.fragments;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.game.R;
import com.example.game.model.Row;
import com.google.android.material.snackbar.Snackbar;

import static com.example.game.R.color.colorBlue;
import static com.example.game.R.color.colorRed;

public class RowFragment extends Fragment {
    private Button mButtonTurn;
    private Button[][] mButtonRow = new Button[5][5];
    //    private boolean[][] mEnable = new boolean[5][5];
    private int[][] mWinner = new int[5][5];
    /* Number 1 = RED  **  Number 2 = BLUE  ** Number 0 = not choose
     */
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
        View view = inflater.inflate(R.layout.fragment_row, container, false);
        findAllViews(view);
//        disableAll();
        setClickListeners(view);
        return view;
    }

    private void setClickListeners(View view) {
        mButtonRow[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(0, 0);
                selectWinner();
            }
        });

        mButtonRow[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(0, 1);
                selectWinner();
            }
        });

        mButtonRow[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(0, 2);
                selectWinner();
            }
        });

        mButtonRow[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(0, 3);
                selectWinner();
            }
        });

        mButtonRow[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(0, 4);
                selectWinner();
            }
        });

        mButtonRow[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(1, 0);
                selectWinner();
            }
        });

        mButtonRow[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(1, 1);
                selectWinner();
            }
        });

        mButtonRow[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(1, 2);
                selectWinner();
            }
        });

        mButtonRow[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(1, 3);
                selectWinner();
            }
        });

        mButtonRow[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(1, 4);
                selectWinner();
            }
        });

        mButtonRow[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(2, 0);
                selectWinner();
            }
        });

        mButtonRow[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(2, 1);
                selectWinner();
            }
        });

        mButtonRow[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(2, 2);
                selectWinner();
            }
        });

        mButtonRow[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(2, 3);
                selectWinner();
            }
        });

        mButtonRow[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(2, 4);
                selectWinner();
            }
        });

        mButtonRow[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(3, 0);
                selectWinner();
            }
        });

        mButtonRow[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(3, 1);
                selectWinner();
            }
        });

        mButtonRow[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(3, 2);
                selectWinner();
            }
        });

        mButtonRow[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(3, 3);
                selectWinner();
            }
        });

        mButtonRow[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(3, 4);
                selectWinner();
            }
        });

        mButtonRow[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(4, 0);
                selectWinner();
            }
        });

        mButtonRow[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(4, 1);
                selectWinner();
            }
        });

        mButtonRow[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(4, 2);
                selectWinner();
            }
        });

        mButtonRow[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(4, 3);
                selectWinner();
            }
        });

        mButtonRow[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setChoosingColor(4, 4);
                selectWinner();
            }
        });

    }

    private void setChoosingColor(int i, int j) {
        ColorDrawable colorDrawable = (ColorDrawable) mButtonTurn.getBackground();
        if (colorDrawable.getColor() == getResources().getColor(colorRed)) {
            for (int k = 0; k < 5; k++) {
                if (mWinner[k][j] == 0) {
                    mButtonRow[k][j].setBackgroundColor(getResources().getColor(colorRed));
                    mWinner[k][j] = 1;
                    mButtonTurn.setBackgroundColor(getResources().getColor(colorBlue));
                    break;
                }
            }

        } else {
            if (colorDrawable.getColor() == getResources().getColor(colorBlue)) {
                for (int k = 0; k < 5; k++) {
                    if (mWinner[k][j] == 0) {
                        mButtonRow[k][j].setBackgroundColor(getResources().getColor(colorBlue));
                        mWinner[k][j] = 2;
                        mButtonTurn.setBackgroundColor(getResources().getColor(colorRed));
                        break;
                    }
                }

            }
        }
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

    public void disableAll() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mButtonRow[i][j].setEnabled(false);
            }
        }
    }

    public void selectWinner() {
        String redType1 = "01111";
        String redType2 = "11110";
        String redType3 = "21111";
        String redType4 = "11112";

        String redType5 = "1111";

        String blueType1 = "02222";
        String blueType2 = "22220";
        String blueType3 = "12222";
        String blueType4 = "22221";

        String blueType5 = "2222";

        String r0 = addToTextRow(0);
        String r1 = addToTextRow(1);
        String r2 = addToTextRow(2);
        String r3 = addToTextRow(3);
        String r4 = addToTextRow(4);

        String c0 = addToTextColumn(0);
        String c1 = addToTextColumn(1);
        String c2 = addToTextColumn(2);
        String c3 = addToTextColumn(3);
        String c4 = addToTextColumn(4);

        String d0 = addToTextDiagnol(0);
        String d1 = addToTextDiagnol(1);

        String d2 = "";
        d2 += mWinner[0][1];
        d2 += mWinner[1][2];
        d2 += mWinner[2][3];
        d2 += mWinner[3][4];
        String d3 = "";
        d3 += mWinner[1][0];
        d3 += mWinner[2][1];
        d3 += mWinner[3][2];
        d3 += mWinner[4][3];
        String d4 = "";
        d4 += mWinner[0][3];
        d4 += mWinner[1][2];
        d4 += mWinner[2][1];
        d4 += mWinner[3][0];
        String d5 = "";
        d5 += mWinner[1][4];
        d5 += mWinner[2][3];
        d5 += mWinner[3][2];
        d5 += mWinner[4][1];

        if (r0.equals(redType1) || r0.equals(redType2) || r0.equals(redType3) || r0.equals(redType4)) {
            Winner(R.string.winner_red);
        } else if (r0.equals(blueType1) || r0.equals(blueType2) || r0.equals(blueType3) || r0.equals(blueType4)) {
            Winner(R.string.winner_blue);
        } else if (r1.equals(redType1) || r1.equals(redType2) || r1.equals(redType3) || r1.equals(redType4)) {
            Winner(R.string.winner_red);
        } else if (r1.equals(blueType1) || r1.equals(blueType2) || r1.equals(blueType3) || r1.equals(blueType4)) {
            Winner(R.string.winner_blue);
        } else if (r2.equals(redType1) || r2.equals(redType2) || r2.equals(redType3) || r2.equals(redType4)) {
            Winner(R.string.winner_red);
        } else if (r2.equals(blueType1) || r2.equals(blueType2) || r2.equals(blueType3) || r2.equals(blueType4)) {
            Winner(R.string.winner_blue);
        } else if (r3.equals(redType1) || r3.equals(redType2) || r3.equals(redType3) || r3.equals(redType4)) {
            Winner(R.string.winner_red);
        } else if (r3.equals(blueType1) || r3.equals(blueType2) || r3.equals(blueType3) || r3.equals(blueType4)) {
            Winner(R.string.winner_blue);
        } else {
            if (c0.equals(redType2) || c0.equals(redType4)) {
                Winner(R.string.winner_red);
            } else if (c0.equals(blueType2) || c0.equals(blueType4)) {
                Winner(R.string.winner_blue);
            } else if (c1.equals(redType2) || c1.equals(redType4)) {
                Winner(R.string.winner_red);
            } else if (c1.equals(blueType2) || c1.equals(blueType4)) {
                Winner(R.string.winner_blue);
            } else if (c2.equals(redType2) || c2.equals(redType4)) {
                Winner(R.string.winner_red);
            } else if (c2.equals(blueType2) || c2.equals(blueType4)) {
                Winner(R.string.winner_blue);
            } else if (c3.equals(redType2) || c3.equals(redType4)) {
                Winner(R.string.winner_red);
            } else if (c3.equals(blueType2) || c3.equals(blueType4)) {
                Winner(R.string.winner_blue);
            } else if (c4.equals(redType2) || c4.equals(redType4)) {
                Winner(R.string.winner_red);
            } else {
                if (d2.equals(redType5) || d4.equals(redType5)) {
                    Winner(R.string.winner_red);
                } else if (d2.equals(blueType5) || d4.equals(blueType5)) {
                    Winner(R.string.winner_blue);
                } else if (d0.equals(redType2) || d1.equals(redType4)) {
                    Winner(R.string.winner_red);
                } else if (d0.equals(blueType2) || d1.equals(blueType4)) {
                    Winner(R.string.winner_blue);
                } else if (d3.equals(redType5) || d5.equals(redType5)) {
                    Winner(R.string.winner_red);
                } else if (d3.equals(blueType5) || d5.equals(blueType5)) {
                    Winner(R.string.winner_blue);
                } else if (d0.equals(redType1) || d1.equals(redType3)) {
                    Winner(R.string.winner_red);
                } else if (d0.equals(blueType1) || d1.equals(blueType3)) {
                    Winner(R.string.winner_red);
                } else {
                    if (r4.equals(redType1) || r4.equals(redType2) || r4.equals(redType3) || r4.equals(redType4)) {
                        Winner(R.string.winner_red);
                    } else if (r4.equals(blueType1) || r4.equals(blueType2) || r4.equals(blueType3) || r4.equals(blueType4)) {
                        Winner(R.string.winner_blue);
                    } else {
                        if (c0.equals(redType3) || c0.equals(redType1)) {
                            Winner(R.string.winner_red);
                        } else if (c0.equals(blueType1) || c0.equals(blueType3)) {
                            Winner(R.string.winner_blue);
                        } else if (c1.equals(redType1) || c1.equals(redType3)) {
                            Winner(R.string.winner_red);
                        } else if (c1.equals(blueType1) || c1.equals(blueType3)) {
                            Winner(R.string.winner_blue);
                        } else if (c2.equals(redType1) || c2.equals(redType3)) {
                            Winner(R.string.winner_red);
                        } else if (c2.equals(blueType1) || c2.equals(blueType3)) {
                            Winner(R.string.winner_blue);
                        } else if (c3.equals(redType1) || c3.equals(redType3)) {
                            Winner(R.string.winner_red);
                        } else if (c3.equals(blueType1) || c3.equals(blueType3)) {
                            Winner(R.string.winner_blue);
                        } else if (c4.equals(redType1) || c4.equals(redType3)) {
                            Winner(R.string.winner_red);
                        }
                    }
                }
            }
        }

    }

    private void Winner(int p) {
        Snackbar.make(getView(), p, Snackbar.LENGTH_LONG).show();
        disableAll();
    }

    public String addToTextRow(int i) {
        String text = "";
        for (int j = 0; j < 5; j++) {
            text += mWinner[i][j];
        }
        return text;
    }

    public String addToTextColumn(int i) {
        String text = "";
        for (int j = 0; j < 5; j++) {
            text += mWinner[j][i];
        }
        return text;
    }

    public String addToTextDiagnol(int i) {
        String text = "";
        if (i == 0) {
            for (int j = 0; j < 5; j++) {

                text += mWinner[j][j];
            }
        } else {
            int k = 0;
            for (int j = 4; j >= 0; j--) {
                text += mWinner[j][k];
                k++;
            }
        }

        return text;
    }


}