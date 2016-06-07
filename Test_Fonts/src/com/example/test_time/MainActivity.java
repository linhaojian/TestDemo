package com.example.test_time;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


	private TextView tv;
	private paodaoView paodao;
	private EditText et;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clock);
		
		tv=(TextView) findViewById(R.id.textView1);
		Typeface face = Typeface.createFromAsset (getAssets() , "fonts/Helvetica.Ttf");
		tv.setTypeface (face);
		
		paodao=(paodaoView) findViewById(R.id.paodao);
		
		et=(EditText) findViewById(R.id.editText1);
		
		et.setError("fuck");
		
	}
	
	


}
