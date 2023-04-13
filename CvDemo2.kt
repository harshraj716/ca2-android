package com.example.ca2test

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import android.widget.Toast


class CvDemo2(context: Context?):View(context) {
    private var p=Paint()
    private var l=0
    private var r=100
    private var l1=900
    private var r1=1000
    override fun onDraw(canvas: Canvas?) {
        p.color= Color.BLUE

        canvas?.drawRect(l.toFloat(),200f,r.toFloat(),300f,p)

        canvas?.drawRect(l1.toFloat(),400f,r1.toFloat(),500f,p)

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action)
        {
            MotionEvent.ACTION_DOWN->startFan()
            MotionEvent.ACTION_UP->stopFan()
        }
        return true
    }

    private fun stopFan() {

        Toast.makeText(context, width.toString(), Toast.LENGTH_SHORT).show()
        if(l>=width)
        {
            l=0
            r=100
            l1=1300
            r1=1400
        }
        invalidate()
    }

    private fun startFan() {
        if(l>=width)
        {
            l=0
            r=100
            l1=1300
            r1=1400
        }
        l += 100
        l1-=100
        r1-=100
        r += 100
        invalidate()
    }
}