package com.example.radish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class splashActivity extends Activity {
	
	private Handler mHandler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//去标题栏
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		//全屏
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  
//			    WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splash);
		
		mHandler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent mIntent = new Intent(splashActivity.this, MainActivity.class);
				startActivity(mIntent);
				finish();
			}
		}, 1000);
		
	}

}
