package com.example.benjamin;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RelativeActivity extends Activity implements View.OnClickListener{
	public TextView txt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relative);
		
		txt = (TextView)findViewById(R.id.textView1);
		txt.setText("Mon joli texte");
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(this);
		button1.setText("Bouton 1");
		
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(this);
		button2.setText("Bouton 2");
		
		Button button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(this);
		button3.setText("Bouton 3");

		Button button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(this);
		button4.setText("Bouton 4");
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		txt = (TextView)findViewById(R.id.textView1);
		
		Button caller = (Button)v;
		if(caller.getId() == R.id.button1)
			txt.setText("Non");
		else if(caller.getId() == R.id.button2)
			txt.setText("Oui");
		else if(caller.getId() == R.id.button3)
			txt.setText("Trop");
		else if(caller.getId() == R.id.button4)
			txt.setText("Belle");
	}

}
