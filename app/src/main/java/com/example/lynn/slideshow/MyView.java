package com.example.lynn.slideshow;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import static com.example.lynn.slideshow.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        int[] drawables = {R.drawable.bear,
                           R.drawable.bird,
                           R.drawable.cat,
                           R.drawable.cow,
                           R.drawable.eagle,
                           R.drawable.elephant,
                           R.drawable.lioness,
                           R.drawable.llama,
                           R.drawable.panda,
                           R.drawable.pig,
                           R.drawable.rabbit,
                           R.drawable.rhino,
                           R.drawable.rooster,
                           R.drawable.sheep,
                           R.drawable.snake,
                           R.drawable.tiger,
                           R.drawable.turtle,
                           R.drawable.zebra};

        view = new ImageView(context);

        LayoutParams params = new LayoutParams(500,500);

        params.leftMargin = 500;
        params.topMargin = 500;

        view.setLayoutParams(params);

        view.setImageDrawable(getResources().getDrawable(drawables[0]));

        view.setOnTouchListener(listener);

        addView(view);

    }

}
