package com.example.test_time;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class MyImageView extends ImageView{

	private static final Xfermode sXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

	
	public MyImageView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public MyImageView(Context context,AttributeSet attrs) {
		super(context,attrs,0);
		// TODO Auto-generated constructor stub
	}
	
	
	 public MyImageView(Context context, AttributeSet attrs, int defStyle) {
	        super(context, attrs, defStyle);
	            setLayerType(View.LAYER_TYPE_SOFTWARE, null);
	    }
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		
		 Drawable drawable = getDrawable();  
	        if (drawable == null) {  
	            return;  
	        }  
	  
	        if (getWidth() == 0 || getHeight() == 0) {  
	            return;   
	        }  
	        Bitmap b =  ((BitmapDrawable)drawable).getBitmap() ;  
	        Bitmap bitmap = b.copy(Bitmap.Config.ARGB_8888, true);        
	  
	        Bitmap roundBitmap =  getCroppedBitmap(bitmap, getWidth());  
	        canvas.drawBitmap(roundBitmap, 0, 0, null);  
        

           
		
		
		
	}
	/* 
     * 对Bitmap裁剪，使其变成圆形，这步最关键 
     */  
    public static Bitmap getCroppedBitmap(Bitmap bmp, int radius) {  
        Bitmap sbmp;  
        if(bmp.getWidth() != radius || bmp.getHeight() != radius)  
            sbmp = Bitmap.createScaledBitmap(bmp, radius, radius, false);  
        else  
            sbmp = bmp;  
  
        Bitmap output = Bitmap.createBitmap(sbmp.getWidth(), sbmp.getHeight(), Bitmap.Config.ARGB_8888);  
        //矩形
        final Rect rect = new Rect(0, 0, sbmp.getWidth(), sbmp.getHeight());  
  
        Paint paint = new Paint();  
        paint.setAntiAlias(true);  //删除锯齿
        paint.setFilterBitmap(true);  
        paint.setDither(true);        
        paint.setColor(Color.parseColor("#BAB399"));  
  
        Canvas c = new Canvas(output);          
        c.drawARGB(0, 0, 0, 0);  
        c.drawCircle(sbmp.getWidth() / 2+0.7f, sbmp.getHeight() / 2+0.7f, sbmp.getWidth() / 2+0.1f, paint);  
      
        paint.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));  
        c.drawBitmap(sbmp, rect, rect, paint);  
  
        return output;  
    }  
    
    
    
    
    
    
    
}
