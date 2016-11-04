package com.joelimyx.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WhitenActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whiten);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView move = (ImageView) findViewById(R.id.move_image);
        ImageView whiten = (ImageView) findViewById(R.id.whiten_image);
        ImageView erase= (ImageView) findViewById(R.id.erase_image);
        ImageView help = (ImageView) findViewById(R.id.help_image);

        move.setOnClickListener(this);
        whiten.setOnClickListener(this);
        erase.setOnClickListener(this);
        help.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.move_image:
                Toast.makeText(this, "MOVE IT AROUND!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.whiten_image:
                Toast.makeText(this, "Brighten up that smile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.erase_image:
                Toast.makeText(this, "Thanks for remove the stain", Toast.LENGTH_SHORT).show();
                break;
            case R.id.help_image:
                Toast.makeText(this, "I am here to help", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
