package com.egecius.ui_playground

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.annotation.ColorRes
import android.support.annotation.DrawableRes
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat

class ImageUtils {

    fun toTintedDrawable(context: Context, @DrawableRes drawableToTint: Int,
                         @ColorRes tintColor: Int): Drawable {
        val drawable = toDrawable(context, drawableToTint)
        return toTintedDrawable(context, tintColor, drawable)
    }

    private fun toDrawable(context: Context, @DrawableRes drawableId: Int): Drawable {
        return ContextCompat.getDrawable(context, drawableId)
    }

    private fun toTintedDrawable(context: Context, @ColorRes colorRes: Int, mDrawable: Drawable): Drawable {
        val colorInt = ContextCompat.getColor(context, colorRes)
        mDrawable.mutate()
        val mWrappedDrawable = DrawableCompat.wrap(mDrawable)
        DrawableCompat.setTint(mWrappedDrawable, colorInt)
        return mWrappedDrawable
    }
}
