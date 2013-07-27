package com.xperttech.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        MyNumberListener btnListener = new MyNumberListener();
        Button btn = (Button) findViewById(R.id.goToSecondActivity);
        btn.setOnClickListener(btnListener);
        
        Button secondBtn = (Button) findViewById(R.id.showToast);
        secondBtn.setOnClickListener(btnListener);
        
        MyOperationListener opListener = new MyOperationListener();
        Button operatorBtn = (Button) findViewById(R.id.operator);
        secondBtn.setOnClickListener(opListener);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class MyNumberListener implements OnClickListener
    {
		@Override
		public void onClick(View arg0) {	
			Button whichButton = (Button) arg0;
			int number = Integer.parseInt(whichButton.getText().toString());
			switch(number)
			{
			
			}
		}
		
    }
    class MyOperationListener implements OnClickListener
    {
		@Override
		public void onClick(View arg0) {	
			Button whichButton = (Button) arg0;
			whichButton.getText();
			Toast.makeText(MainActivity.this,
					"Am clicked " + whichButton.getText(), 
					Toast.LENGTH_LONG).show();
		}
    	
    }
    
}
