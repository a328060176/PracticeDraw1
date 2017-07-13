package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        int width = getWidth();
        int height = getHeight();

        int heartWidth = width / 3;

        Path path2 = new Path();
        Path path = new Path();

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);

        canvas.save();

        canvas.translate(width / 2, height / 2);
        RectF f1 = new RectF(-heartWidth / 2, -heartWidth / 4, 0, heartWidth / 4);
        path.arcTo(f1, 0, -220);
        path.lineTo(0, heartWidth * 0.65f);
        canvas.drawPath(path, paint);


        RectF f2 = new RectF(0, -heartWidth / 4, heartWidth / 2, heartWidth / 4);
        path2.arcTo(f2, 180, 220);
        path2.lineTo(0, heartWidth * 0.65f);
        canvas.drawPath(path2, paint);

        canvas.restore();


    }
}
