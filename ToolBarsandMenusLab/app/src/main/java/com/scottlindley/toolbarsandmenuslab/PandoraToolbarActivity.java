package com.scottlindley.toolbarsandmenuslab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class PandoraToolbarActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.like_button:
                Toast.makeText(this, "Liked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.dislike_button:
                Toast.makeText(this, "Disliked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pause_button:
                Toast.makeText(this, "You can't stop the beat!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.skip_button:
                Toast.makeText(this, "Skipped!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.comments:
                Toast.makeText(this, "Cool story, bro!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.profile:
                Toast.makeText(this, "That's you!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.settings:
                Toast.makeText(this, "Settings randomized!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandora_toolbar);

        Toolbar toolbar = (Toolbar)findViewById(R.id.pandora_toolbar);

        findViewById(R.id.like_button).setOnClickListener(this);
        findViewById(R.id.dislike_button).setOnClickListener(this);
        findViewById(R.id.pause_button).setOnClickListener(this);
        findViewById(R.id.skip_button).setOnClickListener(this);
        findViewById(R.id.comments).setOnClickListener(this);
        findViewById(R.id.profile).setOnClickListener(this);
        findViewById(R.id.settings).setOnClickListener(this);

    }
}
