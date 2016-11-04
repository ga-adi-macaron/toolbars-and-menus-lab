package com.ezequielc.toolbarsmenuslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class FacetuneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facetune);

        Toolbar toolbar = (Toolbar)findViewById(R.id.facetune_toolbar);
        setSupportActionBar(toolbar);

        ImageView move =(ImageView)findViewById(R.id.move);
        ImageView whiten = (ImageView)findViewById(R.id.whiten);
        ImageView erase = (ImageView)findViewById(R.id.erase);
        ImageView help = (ImageView)findViewById(R.id.help);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.move:
                        Toast.makeText(FacetuneActivity.this, "This represents the move icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.whiten:
                        Toast.makeText(FacetuneActivity.this, "This represents the whiten icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.erase:
                        Toast.makeText(FacetuneActivity.this, "This represents the erase icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.help:
                        Toast.makeText(FacetuneActivity.this, "This represents the help icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        move.setOnClickListener(onClickListener);
        whiten.setOnClickListener(onClickListener);
        erase.setOnClickListener(onClickListener);
        help.setOnClickListener(onClickListener);
    }
}
