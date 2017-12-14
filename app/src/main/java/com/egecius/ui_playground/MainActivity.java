package com.egecius.ui_playground;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView image2;
    private final ImageUtils mUtils = new ImageUtils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createListener();
        image2 = (ImageView) findViewById(R.id.image_2);

        applyTinting();
    }

    private void createListener() {
        findViewById(R.id.to_detail_activity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDetailActivity();
            }
        });
    }

    private void showDetailActivity() {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    private void applyTinting() {
        Context context = getApplicationContext();
        Drawable drawable = mUtils.toTintedDrawable(context, R.drawable.ic_dog_barking,
                R.color.active_hub_hive_greyscale_25);
        image2.setImageDrawable(drawable);
    }

}
