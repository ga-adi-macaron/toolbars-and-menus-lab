package shuvalov.nikita.toolbarsandmenuslab;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class WhitenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whiten);

        ImageView moveImg = (ImageView) findViewById(R.id.move_image);
        ImageView whitenImg = (ImageView)findViewById(R.id.whiten_image);
        ImageView eraseImg = (ImageView)findViewById(R.id.erase_image);
        ImageView helpImg = (ImageView)findViewById(R.id.help_image);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()){
                    case (R.id.move_image):
                        Toast.makeText(WhitenActivity.this, "Move", Toast.LENGTH_SHORT).show();
                        break;
                    case(R.id.whiten_image):
                        Toast.makeText(WhitenActivity.this, "Whiten", Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.erase_image):
                        Toast.makeText(WhitenActivity.this, "Erase", Toast.LENGTH_SHORT).show();
                        break;
                    case(R.id.help_image):
                        Toast.makeText(WhitenActivity.this, "Help", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

        };

        moveImg.setOnClickListener(onClickListener);
        whitenImg.setOnClickListener(onClickListener);
        eraseImg.setOnClickListener(onClickListener);
        helpImg.setOnClickListener(onClickListener);

    }
}
