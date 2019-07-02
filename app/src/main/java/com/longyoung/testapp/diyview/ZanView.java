package com.longyoung.testapp.diyview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by longyoung on 2019/7/2.
 */

public class ZanView extends View {

    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    private int mZanCount = 1369;
    private int mZanCountTemp = -1;
    private int mZanCountTemp2 = -1;
    private boolean isZan = false;

    private int mYText;

    private boolean isRun;
    private Handler mHandler = new Handler();
    private Runnable mRun = new Runnable() {
        @Override
        public void run() {
            isRun = true;
            mHandler.postDelayed(mRun, 5);

            if (isZan){
                if (mYText != 40){
                    mYText -= 5;
                }
            } else {
                if (mYText != 40){
                    mYText += 5;
                }
            }

            invalidate();//重绘
        }
    };

    public void setmZanCount(int mZanCount) {
        this.mZanCount = mZanCount;
        mZanCountTemp2 = mZanCount;
        invalidate();
    }

    public ZanView(Context context) {
        super(context);
    }

    public ZanView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ZanView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        try {
            mPaint.setTextSize(30);
            mZanCountTemp2 = mZanCount;

            if (mZanCountTemp != -1){
                int len = (mZanCount + "").length();
                int lenTemp = (mZanCountTemp + "").length();
                if (len > lenTemp){
                    mZanCountTemp2 = Integer.valueOf((mZanCountTemp2 + "").substring(0, len - lenTemp));
                } else {

                }
            }

            canvas.drawText(mZanCountTemp2 + "", 20, 40, mPaint);
            canvas.save();

            if (mZanCountTemp != -1){
                canvas.drawText(mZanCountTemp + "", 20 + mPaint.measureText(mZanCountTemp2 + ""), mYText, mPaint);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP){//单击
            Log.e("taggg", "ACTION_UP");
            isZan = !isZan;
            if (isZan){
                mZanCountTemp = addMul(mZanCount, 1);
                mYText = 80;
            } else {
                mZanCountTemp = addMul(mZanCount, -1);
                mYText = 0;
            }

            if (!isRun){
                mHandler.postDelayed(mRun, 5);
            }
        }
        return super.onTouchEvent(event);
    }

    //数字处理
    private int addMul(int in, int zeng){
        int lianXvNineCount = 0;
        boolean isLian = true;

        in += zeng;
        String tempStr = String.valueOf(in);
        int len = tempStr.length();
        for (int i=0; i<len; i++){
            if (zeng > 0){
                if (Integer.valueOf(tempStr.substring(len - 1 - i, len - i)) == 0 && isLian){
                    lianXvNineCount++;
                } else {
                    isLian = false;
                }
            } else {
                if (Integer.valueOf(tempStr.substring(len - 1 - i, len - i)) == 9 && isLian){
                    lianXvNineCount++;
                } else {
                    isLian = false;
                }
            }
        }

        System.out.println("lian=" + lianXvNineCount);

        tempStr = tempStr.substring(len - 1 - lianXvNineCount, len);

        System.out.println("inStr=" + tempStr);

        return Integer.valueOf(tempStr);
    }

}
