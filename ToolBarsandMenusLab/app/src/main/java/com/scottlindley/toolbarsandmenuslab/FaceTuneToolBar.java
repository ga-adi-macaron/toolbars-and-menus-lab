package com.scottlindley.toolbarsandmenuslab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class FaceTuneToolBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_tune_tool_bar);

        Toolbar toolbar = (Toolbar)findViewById(R.id.facetune_toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.move_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaceTuneToolBar.this, "Moving Stuff!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.brush_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaceTuneToolBar.this, "Brush Brush Brush!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.undo_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaceTuneToolBar.this, "Undo!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.help_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FaceTuneToolBar.this, "No one can help you!", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.next_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FaceTuneToolBar.this, PandoraToolbarActivity.class));
            }
        });
    }

}
