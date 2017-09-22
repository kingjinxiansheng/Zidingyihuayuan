package com.example.lenovo.zidingyihuayuan;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by KING on 2017/8/17 11:45
 * 邮箱:992767879@qq.com
 */

public class ZidingyiView extends View {
    public ZidingyiView(Context context) {
        super(context);
    }

    public ZidingyiView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ZidingyiView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle((Paint.Style.STROKE));
        paint.setStrokeWidth(100);
        canvas.drawCircle(200,200,100,paint);
    }
}
