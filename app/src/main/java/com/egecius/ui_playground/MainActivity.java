package com.egecius.ui_playground;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
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
        Drawable drawableRaw = toDrawable(R.drawable.ic_dog_barking);
        Drawable drawableTinted = getTintedDrawable(android.R.color.holo_green_dark, drawableRaw);
        image2.setImageDrawable(drawableTinted);
    }

    private Drawable toDrawable(@DrawableRes int drawableId) {
        return ContextCompat.getDrawable(getApplicationContext(), drawableId);
    }

    Drawable getTintedDrawable(@ColorRes int colorRes, Drawable mDrawable) {
        int colorInt = ContextCompat.getColor(getApplicationContext(), colorRes);
        mDrawable.mutate();
        Drawable mWrappedDrawable = DrawableCompat.wrap(mDrawable);
        DrawableCompat.setTint(mWrappedDrawable, colorInt);
        DrawableCompat.setTintMode(mWrappedDrawable, PorterDuff.Mode.SRC_IN);
        return mWrappedDrawable;
    }
}
