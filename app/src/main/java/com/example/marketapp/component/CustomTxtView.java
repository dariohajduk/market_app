package com.example.marketapp.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

public class CustomTxtView extends androidx.appcompat.widget.AppCompatTextView {

    public CustomTxtView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(),
                "Melodical Regular.ttf");
        setTypeface(typeface);


    }

}