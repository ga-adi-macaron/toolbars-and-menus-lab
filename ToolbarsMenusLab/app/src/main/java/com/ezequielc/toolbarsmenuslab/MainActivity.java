package com.ezequielc.toolbarsmenuslab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        ImageView dislike =(ImageView)findViewById(R.id.arrow_down);
        ImageView like = (ImageView)findViewById(R.id.arrow_up);
        ImageView play = (ImageView)findViewById(R.id.media_play);
        ImageView skip = (ImageView)findViewById(R.id.media_next);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.arrow_down:
                        Toast.makeText(MainActivity.this, "This represents the dislike icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.arrow_up:
                        Toast.makeText(MainActivity.this, "This represents the like icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.media_play:
                        Toast.makeText(MainActivity.this, "This represents the play icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.media_next:
                        Toast.makeText(MainActivity.this, "This represents the skip icon",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        dislike.setOnClickListener(onClickListener);
        like.setOnClickListener(onClickListener);
        play.setOnClickListener(onClickListener);
        skip.setOnClickListener(onClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.comment:
                Toast.makeText(this, "This represents the comment icon",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.profile:
                Toast.makeText(this, "This represents the profile icon",
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.settings:
                Toast.makeText(this, "Settings: New Activity...",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, FacetuneActivity.class);
                startActivity(intent);
                return true;
        } return super.onOptionsItemSelected(item);
    }
}
