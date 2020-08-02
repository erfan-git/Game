package com.example.game.controller.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.game.R;
import com.example.game.controller.fragments.RowFragment;
import com.example.game.controller.fragments.TicTocToeFragment;

import java.io.Serializable;

import static com.example.game.R.*;

public class MainActivity extends AppCompatActivity implements Serializable {
    public static final String KAY_BUNDLE_ACTIVITY = "kay_bundle_activity";
    private Button mButtonTic;
    private Button mButtonRow;
    private FragmentManager mFragmentManager = getSupportFragmentManager();
    private Fragment mFragment = mFragmentManager.findFragmentById(id.frameLayout_container);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findAllViews();
        setClickListeners();
    }

    private void setClickListeners() {
        mButtonTic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mFragment == null){
                    mFragmentManager
                            .beginTransaction()
                            .add(id.frameLayout_container, new TicTocToeFragment())
                            .commit();
                }
            }
        });

        mButtonRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mFragment == null){
                    mFragmentManager
                            .beginTransaction()
                            .add(id.frameLayout_container, new RowFragment())
                            .commit();
                }
            }
        });
    }

    private void findAllViews() {
        mButtonTic = findViewById(R.id.button_ticTacToc);
        mButtonRow = findViewById(R.id.button_4inARow);
    }
}