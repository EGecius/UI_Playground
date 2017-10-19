package com.egecius.ui_playground;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;

public class ImageUtils {

    public Drawable toTintedDrawable(Context context, @DrawableRes int drawableToTint,
            @ColorRes int tintColor) {
        Drawable drawable = toDrawable(context, drawableToTint);
        return toTintedDrawable(context, tintColor, drawable);
    }

    private Drawable toDrawable(Context context, @DrawableRes int drawableId) {
        return ContextCompat.getDrawable(context, drawableId);
    }

    private Drawable toTintedDrawable(Context context, @ColorRes int colorRes, Drawable mDrawable) {
        int colorInt = ContextCompat.getColor(context, colorRes);
        mDrawable.mutate();
        Drawable mWrappedDrawable = DrawableCompat.wrap(mDrawable);
        DrawableCompat.setTint(mWrappedDrawable, colorInt);
        return mWrappedDrawable;
    }
}
