package gameshop.serkanbal.com.toolbars_menus_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Facetune extends AppCompatActivity {
    ImageView mImage1, mImage2, mImage3, mImage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facetune);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImage1 = (ImageView) findViewById(R.id.image1);
        mImage2 = (ImageView) findViewById(R.id.image2);
        mImage3 = (ImageView) findViewById(R.id.image3);
        mImage4 = (ImageView) findViewById(R.id.image4);

        mImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Facetune.this, "Image1 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Facetune.this, "Image2 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Facetune.this, "Image3 clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Facetune.this, "Image4 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
