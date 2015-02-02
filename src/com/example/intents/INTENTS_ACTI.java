package com.example.intents;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class INTENTS_ACTI extends Activity {
	private TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intents__acti);
		tv1 = (TextView)findViewById(R.id.tv1);
	
	String username = getIntent().getExtras().getString("username");
	int no1 = getIntent().getExtras().getInt("number");
	Boolean booleanValue = getIntent().getExtras().getBoolean("bool");
	tv1.setText(username+""+ Integer.toString(no1)+ "" + Boolean.toString(booleanValue));
	
	}

	

}
