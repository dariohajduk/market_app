package com.example.marketapp.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomEditTxt extends androidx.appcompat.widget.AppCompatEditText {


    public CustomEditTxt(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),
                "Bubble Peanut Regular.ttf");
        setTypeface(typeface);


    }

}