package com.example.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
private Button btn1;
private Button btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		OnClickListener listener=new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				/************Implicit Intent *************/
				Intent intObj = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
				startActivity(intObj);
			}
		};
		
			OnClickListener listener1=new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					
					/************Explicit Intent *************/
					Intent intent = new Intent(getApplicationContext(),INTENTS_ACTI.class);
		intent.putExtra("username","SICSR");
		//OR
		Bundle bundle = new Bundle();
		bundle.putInt("number", 1234);
		bundle.putInt("number", 12856);
		bundle.putBoolean("bool", true);
		intent.putExtras(bundle);
					startActivity(intent);
				}
			
			
			
			
		};
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(listener1);
	
	
	}
}
		



