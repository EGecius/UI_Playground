package com.egecius.ui_playground;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image2;
    private ImageUtils mUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image2 = (ImageView) findViewById(R.id.image_2);

        applyTinting();
    }

    private void applyTinting() {
        Context context = getApplicationContext();
        mUtils = new ImageUtils();
        Drawable drawable = mUtils.toTintedDrawable(context, R.drawable.ic_dog_barking,
                android.R.color.holo_orange_light);
        image2.setImageDrawable(drawable);
    }

}
