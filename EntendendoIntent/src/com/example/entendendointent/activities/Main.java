package com.example.entendendointent.activities;

import com.example.entendendointent.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {
	
	private EditText edtIntent;
	private Button btnIntent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		edtIntent = (EditText) findViewById(R.id.edtIntent);
		btnIntent = (Button) findViewById(R.id.btnIntent);
		btnIntent.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel:" + edtIntent.getText().toString()));
				startActivity(intent);
			}
		});
	}
	
	

}
