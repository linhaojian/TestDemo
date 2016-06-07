package com.example.test_time;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.View;

public class paodaoView extends View {

	Paint paint=new Paint();;
	
	
	public paodaoView(Context context) {
		super(context);
	
		// TODO Auto-generated constructor stub
	
//		paint.setFlags(Paint.ANTI_ALIAS_FLAG);
	}
	
	
	public paodaoView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public paodaoView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
		super.onDraw(canvas);
		
		//设置画布颜色  也就是背景颜色
//		canvas.drawColor(Color.parseColor("#523434"));
//		paint.setColor(Color.WHITE);
//		canvas.drawText("绘制无规则几何图形喔!!!", 150, 30, paint);
//		
//		//绘制一条线
//		canvas.drawLine(0,0,100, 100, paint);
//		//绘制一个圆形
//		paint.setColor(Color.BLUE);
//		canvas.drawCircle(80, 300, 50, paint);
//		//绘制一个椭圆
//		paint.setColor(Color.WHITE);
//		canvas.drawOval(new RectF(300,370,120,100), paint);
		//绘制多边形
		paint.setColor(Color.WHITE);
		
//		Path path = new Path();
//
//		   path.moveTo(10, 330);     
//           //path.lineTo(70,330);     
//         //  path.lineTo(40,270);     
//          // path.close();     
//		canvas.drawPath(path, paint);
		
	    //画圆角矩形  
		//paint.setStyle(Paint.Style.FILL);//充满  
		paint.setColor(Color.LTGRAY);  
		paint.setAntiAlias(true);// 设置画笔的锯齿效果  
//        canvas.drawText("画圆角矩形:", 10, 260, paint);  
        RectF oval3 = new RectF(0, 0, 300, 200);// 设置个新的长方形  
       
        canvas.drawRoundRect(oval3, 80, 80, paint);//第二个参数是x半径，第三个参数是y半径 
		
	}


	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		setMeasuredDimension(300, 200);
	}
	
	

}
