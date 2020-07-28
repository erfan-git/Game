package com.example.game.controller.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.game.R;
import com.example.game.controller.fragments.RowFragment;
import com.example.game.controller.fragments.TicTocToeFragment;

import static com.example.game.R.*;

public class MainActivity extends AppCompatActivity {
    private Button mButtonTic;
    private Button mButtonRow;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();

        findAllViews();

        setClickListeners();

//        Fragment fragment = fragmentManager.findFragmentById(id.frameLayout_container);
//        if (fragment == null) {
//            fragmentManager
//                    .beginTransaction()
//                    .add(id.frameLayout_container, createFragment())
//                    .commit();
//        }
    }

    private void setClickListeners() {
        mButtonTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager
                        .beginTransaction()
                        .add(id.frameLayout_container, new TicTocToeFragment())
                        .commit();

            }
        });

        mButtonRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager
                        .beginTransaction()
                        .add(id.frameLayout_container, new RowFragment())
                        .commit();

            }
        });
    }

    private void findAllViews() {
        mButtonTic = findViewById(R.id.button_ticTacToc);
        mButtonTic = findViewById(id.button_4inARow);
    }
}