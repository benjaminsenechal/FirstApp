package com.example.benjamin;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_linear);
		final TextView txt;
		txt = (TextView)findViewById(R.id.textView1);
		txt.setText("Hello !!!!!!!!!! ");
		txt.setBackgroundColor(Color.RED);
		
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(this);
/*		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txt.setText("Click");
			}
		});
*/		
		Button buttonAlternatif = (Button)findViewById(R.id.button2);
		buttonAlternatif.setText("Alt");
		buttonAlternatif.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		TextView txt = (TextView)findViewById(R.id.textView1);
		txt.setText("Alt");
		
		Button caller = (Button)v;
		if(caller.getId() == R.id.button1)
			txt.setText("Baptiste");
		else
			txt.setText("Benjamin");
	}

}
