package com.korbkenny.kennylab;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Teeth extends AppCompatActivity {

    LinearLayout mMove, mBrush, mErase, mHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teeth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        mMove = (LinearLayout) findViewById(R.id.move);
        mBrush = (LinearLayout) findViewById(R.id.brush);
        mErase = (LinearLayout) findViewById(R.id.erase);
        mHelp = (LinearLayout) findViewById(R.id.help);

        mMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Teeth.this, "Moving", Toast.LENGTH_SHORT).show();
            }
        });

        mBrush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Teeth.this, "Clean those teeth!", Toast.LENGTH_SHORT).show();
            }
        });

        mErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Teeth.this, "Nvm", Toast.LENGTH_SHORT).show();
            }
        });

        mHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Teeth.this, "Whatcha need?", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
