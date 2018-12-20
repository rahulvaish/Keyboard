package com.example.slide_n_text;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity2 extends Activity
{
	//private Button buttonSend;
	private EditText textPhoneNo;
	private EditText textSMS;
	//private String msgToGo; 
		@Override
	    public void onCreate(Bundle savedInstanceState)
	 {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main_2);
	        // buttonSend = (Button) findViewById(R.id.buttonSend);
			textPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
			textSMS = (EditText) findViewById(R.id.editTextMessage);
	       
	        EditText txtName = (EditText) findViewById(R.id.editTextMessage);
	        
	        Button btnClose = (Button) findViewById(R.id.btnClose);
	        Intent i = getIntent();
	        // Receiving the Data
	        String message = i.getStringExtra("messageBody");
	        //Log.e("Second Screen",  message);
	        // Displaying Received data
	        txtName.setText(message);
	        //msgToGo=message;
	        // Binding Click event to Button
	        btnClose.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View arg0) {
	        //Closing SecondScreen Activity
	        finish();
	            }
	        });
	        
	        
	 
	/*		buttonSend.setOnClickListener(new OnClickListener() {
	 
				@Override
				public void onClick(View v) {
	 
				  String phoneNo = textPhoneNo.getText().toString();
				  String sms =textSMS.getText().toString();
				  System.out.println("+++++++++++++++++++++++++++"+sms);
				  System.out.println("+++++++++++++++++++++++++++"+phoneNo);
				  try {
					  System.out.println("+++++++++++++++++++++++++++"+sms);
					  System.out.println("+++++++++++++++++++++++++++"+phoneNo);
					SmsManager smsManager = SmsManager.getDefault();
					smsManager.sendTextMessage(phoneNo, null, sms, null, null);
					Toast.makeText(getApplicationContext(), "SMS Sent!",
								Toast.LENGTH_LONG).show();
				  } catch (Exception e) {
					Toast.makeText(getApplicationContext(),
						"SMS faild, please try again later!",
						Toast.LENGTH_LONG).show();
					e.printStackTrace();
				  }
	 
				}
			});*/
	    }
	 
		public void button_sendsms(View name)
		{
			  String phoneNo = textPhoneNo.getText().toString();
			  String sms =textSMS.getText().toString();
			  try
			  {
				SmsManager smsManager = SmsManager.getDefault();
				smsManager.sendTextMessage(phoneNo, null, sms, null, null);
				Toast.makeText(getApplicationContext(), "SMS Sent!",
							Toast.LENGTH_LONG).show();
			  } 
			  catch (Exception e)
			  {
				Toast.makeText(getApplicationContext(),
					"SMS faild, please try again later!",
					Toast.LENGTH_LONG).show();
				e.printStackTrace();
			  }
		}
		
		
	 
	 public void button_ONE(View name)
		{	
			
			textPhoneNo.append("1");
		}
		
		
		public void button_TWO(View name)
		{
			
			textPhoneNo.append("2");
		}
		
		public void button_THREE(View name)
		{
		
			textPhoneNo.append("3");
		}
		
		public void button_FOUR(View name)
		{
			
			textPhoneNo.append("4");
		}
		
		public void button_FIVE(View name)
		{
			
			textPhoneNo.append("5");
		}
			
		public void button_SIX(View name)
		{
			
			textPhoneNo.append("6");
		}
			
		public void button_SEVEN(View name)
		{
			
			textPhoneNo.append("7");
		}
		
		public void button_EIGHT(View name)
		{
			
			textPhoneNo.append("8");
		}

		public void button_NINE(View name)
		{
			
			textPhoneNo.append("9");
		}
		
		public void button_ZERO(View name)
		{
			
			textPhoneNo.append("0");
		}
		
		
}
