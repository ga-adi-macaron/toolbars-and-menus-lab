package com.jonathanlieblich.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button tu = (Button)findViewById(R.id.thumbs_up);
        Button td = (Button)findViewById(R.id.thumbs_down);
        Button ps = (Button)findViewById(R.id.pause);
        Button pf = (Button)findViewById(R.id.profile);
        Button ms = (Button)findViewById(R.id.message);
        Button nb = (Button)findViewById(R.id.next_button);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.thumbs_up:
                        Toast.makeText(Main2Activity.this, "Thumbs Up", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.thumbs_down:
                        Toast.makeText(Main2Activity.this, "Thumbs down", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.pause:
                        Toast.makeText(Main2Activity.this, "Pause", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile:
                        Toast.makeText(Main2Activity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.message:
                        Toast.makeText(Main2Activity.this, "Message", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.next_button:
                        Toast.makeText(Main2Activity.this, "Next", Toast.LENGTH_SHORT).show();
                        break;
                    default:

                }
            }
        };

        tu.setOnClickListener(onClick);
        td.setOnClickListener(onClick);
        ps.setOnClickListener(onClick);
        pf.setOnClickListener(onClick);
        ms.setOnClickListener(onClick);
        nb.setOnClickListener(onClick);
    }
}
