package com.longyoung.testapp.diyview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
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

//        canvas.drawColor(Color.parseColor("#88880000"));
//
//        mPaint.setColor(Color.parseColor("#8888bb00"));
//        mPaint.setStyle(Paint.Style.STROKE);
////        mPaint.setStrokeWidth(20);
//        canvas.drawCircle(220, 400, 100, mPaint);
//
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(100, 100, 200, 200, mPaint);
//
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(220, 100, 320, 200, mPaint);
//
//        mPaint.setStyle(Paint.Style.FILL);
//        mPaint.setColor(Color.parseColor("#8888bbcc"));
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        canvas.drawPoint(20, 20, mPaint);
//
//        mPaint.setStrokeCap(Paint.Cap.SQUARE);
//        canvas.drawPoint(20, 50, mPaint);
//
//        mPaint.setColor(Color.parseColor("#8888bb22"));
//        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
//        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
//        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */,
//                8 /* 一共绘制 8 个数（4 个点）*/, mPaint);
//
//
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawOval(50, 50, 350, 200, mPaint);
//
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawOval(400, 50, 700, 200, mPaint);
//
//        canvas.drawLine(2, 2, 10, 10, mPaint);
//
//        canvas.drawRoundRect(50, 150, 100, 200, 10, 10, mPaint);
//
//
//        mPaint.setStyle(Paint.Style.FILL); // 填充模式
//        canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint); // 绘制扇形
//        canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint); // 绘制弧形
//        mPaint.setStyle(Paint.Style.STROKE); // 画线模式
//        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint); // 绘制不封口的弧形


        Path path = new Path(); // 初始化 Path 对象

//        // 使用 path 对图形进行描述（这段描述代码不必看懂）
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//        canvas.drawPath(path, mPaint); // 绘制出 path 描述的图形（心形），大功告成

//        path.addCircle(150, 150, 50, Path.Direction.CW);
//        path.addRect(150, 150, 250, 250, Path.Direction.CW);
//        Path path2 = new Path();
//        path2.addOval(500, 500, 550, 550, Path.Direction.CW);
//        path.addPath(path2);

//        mPaint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
//        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线


//        mPaint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100); // 画斜线
//        path.moveTo(200, 100); // 我移~~
//        path.lineTo(200, 0); // 画竖线

//        mPaint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(100, 100, 300, 300, -90, 90, true); // 强制移动到弧形起点（无痕迹）

//        mPaint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(100, 100, 300, 300, -90, 90, false); // 强制移动到弧形起点（无痕迹）

//        mPaint.setStyle(Paint.Style.STROKE);
//        path.moveTo(100, 100);
//        path.lineTo(200, 100);
//        path.lineTo(150, 150);
//        path.close(); // 使用 close() 封闭子图形。等价于 path.lineTo(100, 100)

        mPaint.setStyle(Paint.Style.FILL);
        path.moveTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(150, 150);

        canvas.drawPath(path, mPaint);


    }

}
