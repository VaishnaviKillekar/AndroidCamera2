package com.example.googlecamera2;

/**
 * Created by Vaishnavi Killekar on 06-Mar-19.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class Rectangle extends View {
    Paint paint = new Paint();
    int width;
    int height;
    boolean camera_status;

    public Rectangle(Context context, boolean camera_status, int width, int height) {
        super(context);
        this.camera_status = camera_status;
        this.width = width;
        this.height = height;
    }


    @Override
    public void onDraw(Canvas canvas) {
        if(!camera_status)
            return;

        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6);

        Log.e("RECT", width +" "+ height);
        Rect rect = new Rect(width/8, height/8, 7*width/8, 7*height/8);
        canvas.drawRect(rect, paint);
    }
}
