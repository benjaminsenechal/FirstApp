package com.example.benjamin;

import java.util.ArrayList;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity extends Activity{
	
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		
		listView = (ListView)findViewById(R.id.listView);
		
		ArrayList<String> dataList = new ArrayList<String>();
		for(int i=0;i<50;i++)
			dataList.add("Data"+i);
		
		ArrayAdapter<String> Adaptader = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataList);
		listView.setAdapter(Adaptader);
	}
}
