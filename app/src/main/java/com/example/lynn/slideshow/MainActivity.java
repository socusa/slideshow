package com.example.lynn.slideshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(myView = new MyView(this));
    }
}
