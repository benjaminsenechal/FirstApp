package com.example.benjamin;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<People> {
	
	Activity activity;
	
	public MyAdapter(Activity context, int resource, List<People> objects) {
		super(context, resource, objects);
		this.activity = context;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		View v = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.template_people, null); // remplacer listView
		//getLayoutInflater : parser une vue en XML pour retourner un objet View.
		
		People currentPeople = getItem(position);
		
		TextView name = (TextView)v.findViewById(R.id.textViewName);
		name.setText(currentPeople.getName().toString());
		
		TextView tel = (TextView)v.findViewById(R.id.textViewTel);
		tel.setText(currentPeople.getTel().toString());		
		
		return v;
	}
}
