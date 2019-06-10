package com.longyoung.testapp.diyview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by longyoung on 2019/6/10.
 */

public class MyView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.parseColor("#88880000"));

        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
//        mPaint.setStrokeWidth(20);
        canvas.drawCircle(220, 400, 100, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100, 100, 200, 200, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(220, 100, 320, 200, mPaint);


    }

}
