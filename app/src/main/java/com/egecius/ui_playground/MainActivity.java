package com.egecius.ui_playground;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image2;
    private ImageView image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image2 = (ImageView) findViewById(R.id.image_2);
        image3 = (ImageView) findViewById(R.id.image_3);

        applyTinting();
    }

    private void applyTinting() {
        Context context = getApplicationContext();
        Drawable drawable = new ImageUtils().toTintedDrawable(context, R.drawable.ic_dog_barking,
                android.R.color.holo_orange_light);
        image2.setImageDrawable(drawable);
    }

}
