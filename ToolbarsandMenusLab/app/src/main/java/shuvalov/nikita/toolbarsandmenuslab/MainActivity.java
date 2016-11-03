package shuvalov.nikita.toolbarsandmenuslab;

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
    public boolean isPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar)findViewById(R.id.pandora_toolbar);
        setSupportActionBar(toolbar);

        ImageView thumbsDown = (ImageView) findViewById(R.id.thumb_down_img);
        ImageView thumbsUp = (ImageView) findViewById(R.id.thumbs_up_img);
        ImageView play = (ImageView) findViewById(R.id.toggle_play);
        ImageView skip = (ImageView) findViewById(R.id.skip_img);

        isPlay=true;


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case (R.id.thumb_down_img):
                        Toast.makeText(view.getContext(), "Clicked thumb-down",Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.thumbs_up_img):
                        Toast.makeText(MainActivity.this, "Clicked thumbs-up", Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.toggle_play):
                        Toast.makeText(MainActivity.this, String.format("Clicked %s",(isPlay ? "pause": "play")),Toast.LENGTH_SHORT).show();
                        isPlay=!isPlay;
                        break;
                    case(R.id.skip_img):
                        Toast.makeText(MainActivity.this, "Skipped song", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        }     ;

        thumbsDown.setOnClickListener(onClickListener);
        thumbsUp.setOnClickListener(onClickListener);
        play.setOnClickListener(onClickListener);
        skip.setOnClickListener(onClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.pandora_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case (R.id.settings):
                Toast.makeText(this, "Settings button clicked", Toast.LENGTH_SHORT).show();
                return true;
            case (R.id.profile_view):
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show();
                return true;
            case (R.id.chat):
                Toast.makeText(this, "I think this is the details, clicked", Toast.LENGTH_SHORT).show();
                return true;
            case (R.id.next_app):
                //Switch to next app
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
