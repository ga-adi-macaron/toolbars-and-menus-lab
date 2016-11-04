package com.justinwells.myapplication;

import android.content.DialogInterface;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView move = (ImageView)findViewById(R.id.move_button);
        ImageView whiten = (ImageView)findViewById(R.id.whiten_button);
        ImageView erase = (ImageView)findViewById(R.id.erase_button);
        ImageView help = (ImageView)findViewById(R.id.help_button);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case (R.id.move_button):
                        Toast.makeText(MainActivity.this, "Moved It!", Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.whiten_button):
                        Toast.makeText(MainActivity.this, "So white!!", Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.erase_button):
                        Toast.makeText(MainActivity.this, "Where'd it go?", Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.help_button):
                        Toast.makeText(MainActivity.this, "We all need help sometimes", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        };

        move.setOnClickListener(listener);
        whiten.setOnClickListener(listener);
        erase.setOnClickListener(listener);
        help.setOnClickListener(listener);
    }
}
