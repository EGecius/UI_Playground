package com.egecius.ui_playground;


import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 *
 * todo WIP
 * I am creating Picasso-style library, which makes tinting of images easy and safe
 *
 * Example of usage:
 *
 Picasso.with(context).load("http://i.imgur.com/DvpvklR.png").into(imageView);

 Tinter.with(context).loadDrawable(R.drawable.ic_dog_barking).tintedWith(android.R.color
 .holo_green_light).into(image3);
 *
 * */
public class Tinter {

    private static Tinter singleton;
    private final Context mContext;

    public Tinter(Context context) {
        mContext = context;
    }

    public static Tinter with(Context context) {
        if (singleton == null) {
            synchronized (Picasso.class) {
                if (singleton == null) {
                    singleton = new Tinter.Builder(context).build();
                }
            }
        }
        return singleton;
    }

    public RequestCreator loadDrawable(int drawable) {
        return null;
    }

    public RequestCreator tintedWith(int tintColor) {
        return null;
    }

    public void into(ImageView imageView) {

    }


    private static class Builder {
        private final Context mContext;

        public Builder(Context context) {
            mContext = context;
        }

        public Tinter build() {
            return new Tinter(mContext);
        }
    }

    private static class RequestCreator {

    }
}
