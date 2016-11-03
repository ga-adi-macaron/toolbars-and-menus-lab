package com.joelimyx.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView playButton = (ImageView) findViewById(R.id.play_button);

        ImageView icon = (ImageView) findViewById(R.id.icon_image);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.play_button:
                        Toast.makeText(MainActivity.this, "Playing the best podcast in the world", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.icon_image:
                        Toast.makeText(MainActivity.this, "Nerdist is Here", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),WhitenActivity.class));
                        break;
                }
            }
        };
        icon.setOnClickListener(listener);
        playButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.play_button:
                break;
            case R.id.icon_image:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
