package com.example.slide_n_text;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText output;
	public static int count_abc =0;
	public static int count_123 =0;
	public int flag = 1;
	public int nflag = 1;
	private Button button[];
	private Button nbutton[];
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button= new Button[30];
		nbutton=new Button[40];
		output = (EditText) findViewById(R.id.editText1);
		//--------------------------------TO NEW PAGE------------------------------------------------
		Button btnNextScreen = (Button) findViewById(R.id.button54);
	    btnNextScreen.setOnClickListener(new View.OnClickListener() {

	        public void onClick(View arg0) {
	            //Starting a new Intent
	            Intent nextScreen = new Intent(getApplicationContext(), MainActivity2.class);

	            //Sending data to another Activity
	           
	            nextScreen.putExtra("messageBody", output.getText().toString());

	          /*  Log.e("n", inputName.getText()+"."+ inputEmail.getText());*/

	            startActivity(nextScreen);

	        }
	    });
		//-------------------------------------------------------------------------------------------
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void button_A(View name)
	{	
		
	
		if(flag==1)
		{
		output.append("A");	
		}
		if(flag == 2)
		{
	    output.append("a");
		}
		if(flag == 3)
		{
	    output.append("4");
		}
		
		
	}
	
	
	public void button_B(View name)
	{
		if(flag == 1)
		output.append("B");
		if(flag == 2)
		output.append("b");
		if(flag == 3)
		output.append(">");
				
			
	}
	
	public void button_C(View name)
	{
		if(flag == 1)
		output.append("C");
		if(flag == 2)
		output.append("c");
		if(flag == 3)
		output.append("9");
	}
	
	public void button_D(View name)
	{
		if(flag == 1)
		output.append("D");
		if(flag == 2)
		output.append("d");
		if(flag == 3)
		output.append("6");
			
	}
	
	public void button_E(View name)
	{
		if(flag == 1)
		output.append("E");
		if(flag == 2)
		output.append("e");
		if(flag == 3)
		output.append("3");	
	}
		
	public void button_F(View name)
	{
		
		if(flag == 1)
		output.append("F");
		if(flag == 2)
		output.append("f");
		if(flag == 3)
		output.append(".");
		
}
		
	public void button_G(View name)
	{
		if(flag == 1)
		output.append("G");
		if(flag == 2)
		output.append("g");
		if(flag == 3)
		output.append(",");
			
	}
	
	public void button_H(View name)
	{
		if(flag == 1)
		output.append("H");
		if(flag == 2)
		output.append("h");
		if(flag == 3)
		output.append("@");
	}

	public void button_I(View name)
	{
	    if(flag == 1)
		output.append("I");
		if(flag == 2)
		output.append("i");
		if(flag == 3)
		output.append("?");
	}
	
	public void button_J(View name)
	{
		if(flag == 1)
		output.append("J");
		if(flag == 2)
		output.append("j");
		if(flag == 3)
		output.append("%");
	}
	
	public void button_K(View name)
	{
		if(flag == 1)
		output.append("K");
		if(flag == 2)
		output.append("k");
		if(flag == 3)
		output.append("(");
	}
	
	public void button_L(View name)
	{
		if(flag == 1)
		output.append("L");
		if(flag == 2)
		output.append("l");
		if(flag == 3)
		output.append("\\");
	}
	
	public void button_M(View name)
	{
		if(flag == 1)
		output.append("M");
		if(flag == 2)
		output.append("m");
		if(flag == 3)
		output.append("&");
	}
	
	public void button_N(View name)
	{
		if(flag == 1)
		output.append("N");
		if(flag == 2)
		output.append("n");
		if(flag == 3)
		output.append("#");
	}
	public void button_O(View name)
	{
		if(flag == 1)
		output.append("O");
		if(flag == 2)
		output.append("o");
		if(flag == 3)
		output.append(")");
	}
	public void button_P(View name)
	{
		if(flag == 1)
		output.append("P");
		if(flag == 2)
		output.append("p");
		if(flag == 3)
		output.append("+");
	}
	public void button_Q(View name)
	{
		if(flag == 1)
		output.append("Q");
		if(flag == 2)
		output.append("q");
		if(flag == 3)
		output.append("1");
	}
	
	public void button_R(View name)
	{
		if(flag == 1)
		output.append("R");
		if(flag == 2)
		output.append("r");
		if(flag == 3)
		output.append("!");
	}
	public void button_S(View name)
	{
		if(flag == 1)
		output.append("S");
		if(flag == 2)
		output.append("s");
		if(flag == 3)
		output.append("5");
	}
	public void button_T(View name)
	{
		if(flag == 1)
		output.append("T");
		if(flag == 2)
		output.append("t");
		if(flag == 3)
		output.append("$");
	}
	public void button_U(View name)
	{
		if(flag == 1)
		output.append("U");
		if(flag == 2)
		output.append("u");
		if(flag == 3)
		output.append("-");
	}
	public void button_V(View name)
	{
		if(flag == 1)
		output.append("V");
		if(flag == 2)
		output.append("v");
		if(flag == 3)
		output.append("0");
	}
	public void button_W(View name)
	{
		if(flag == 1)
		output.append("W");
		if(flag == 2)
		output.append("w");
		if(flag == 3)
		output.append("2");
	}
	public void button_X(View name)
	{
		if(flag == 1)
		output.append("X");
		if(flag == 2)
		output.append("x");
		if(flag == 3)
		output.append("8");
	}
	public void button_Y(View name)
	{
		if(flag == 1)
		output.append("Y");
		if(flag == 2)
		output.append("y");
		if(flag == 3)
		output.append("*");
	}
	public void button_Z(View name)
	{
		if(flag == 1)
		output.append("Z");
		if(flag == 2)
		output.append("z");
		if(flag == 3)
		output.append("7");
	}
	static int count=0;
	public void button_SP(View name)
	{
		
		output.append(" ");
	}
	
	public void button_del(View name)
	{	
		count=count+1;
		String  text = output.getText().toString();
		int position=text.length()-1;
		if(text!="" && text.length()!=0)
		{
		text=text.substring(0,position);
				
		output.setText("");
		output.setText(text);
		output.setSelection(output.getText().length());
		}
		else
		{
			
		}
	}
	
	public void button_delAll(View name)
	{
		output.setText("");
	}
	public void button_enter(View name)
	{
		output.append("\n");
	}
	public void button_abc(View name)
	{
		findViewById(R.id.textView1).setVisibility(View.VISIBLE);
		findViewById(R.id.textView2).setVisibility(View.VISIBLE);
		findViewById(R.id.textView3).setVisibility(View.VISIBLE);
		if((count_abc ==0 ) || (count_abc % 2)!= 0)
		 {
			flag=2;
			button[0] = (Button)findViewById(R.id.button1);
			button[0].setText("q");
			button[1] = (Button)findViewById(R.id.button2);
			button[1].setText("w");
			button[2] = (Button)findViewById(R.id.button3);
			button[2].setText("e");
			button[3] = (Button)findViewById(R.id.button4);
			button[3].setText("r");
			button[4] = (Button)findViewById(R.id.button5);
			button[4].setText("t");
			button[5] = (Button)findViewById(R.id.button6);
			button[5].setText("y");
			button[6] = (Button)findViewById(R.id.button7);
			button[6].setText("u");
			button[7] = (Button)findViewById(R.id.button8);
			button[7].setText("i");
			button[8] = (Button)findViewById(R.id.button9);
			button[8].setText("o");
			button[9] = (Button)findViewById(R.id.button10);
			button[9].setText("p");
			button[10] = (Button)findViewById(R.id.button11);
			button[10].setText("a");
			button[11] = (Button)findViewById(R.id.button12);
			button[11].setText("s");
			button[12] = (Button)findViewById(R.id.button13);
			button[12].setText("d");
			button[13] = (Button)findViewById(R.id.button14);
			button[13].setText("f");
			button[14] = (Button)findViewById(R.id.button15);
			button[14].setText("g");
			button[15] = (Button)findViewById(R.id.button16);
			button[15].setText("h");
			button[16] = (Button)findViewById(R.id.button17);
			button[16].setText("j");
			button[17] = (Button)findViewById(R.id.button18);
			button[17].setText("k");
			button[18] = (Button)findViewById(R.id.button19);
			button[18].setText("l");
			button[19] = (Button)findViewById(R.id.button20);
			button[19].setText("z");
			button[20] = (Button)findViewById(R.id.button21);
			button[20].setText("x");
			button[21] = (Button)findViewById(R.id.button22);
			button[21].setText("c");
			button[22] = (Button)findViewById(R.id.button23);
			button[22].setText("v");
			button[23] = (Button)findViewById(R.id.button24);
			button[23].setText("b");
			button[24] = (Button)findViewById(R.id.button25);
			button[24].setText("n");
			button[25] = (Button)findViewById(R.id.button26);
			button[25].setText("m");
			
			count_abc++;
			
		 }
		
		else
		{
			flag=1;
			button[0].setText("Q");
			button[1].setText("W");
			button[2].setText("E");
			button[3].setText("R");
			button[4].setText("T");
			button[5].setText("Y");
			button[6].setText("U");
			button[7].setText("I");
			button[8].setText("O");
			button[9].setText("P");
			button[10].setText("A");
			button[11].setText("S");
			button[12].setText("D");
			button[13].setText("F");
			button[14].setText("G");
			button[15].setText("H");
			button[16].setText("J");
			button[17].setText("K");
			button[18].setText("L");
			button[19].setText("Z");
			button[20].setText("X");
			button[21].setText("C");
			button[22].setText("V");
			button[23].setText("B");
			button[24].setText("N");
			button[25].setText("M");
		
			count_abc++;
		}
		
		 
			
	}
	
	

	
	 
	public void button_123(View mane)
	{
		findViewById(R.id.textView1).setVisibility(View.INVISIBLE);
		findViewById(R.id.textView2).setVisibility(View.INVISIBLE);
		findViewById(R.id.textView3).setVisibility(View.INVISIBLE);
		if((count_123 ==0 ) || (count_123 % 2)!= 0)
		 {
			flag=3;
			nbutton[0] = (Button)findViewById(R.id.button1);
			nbutton[0].setText("1");
			nbutton[1] = (Button)findViewById(R.id.button2);
			nbutton[1].setText("2");
			nbutton[2] = (Button)findViewById(R.id.button3);
			nbutton[2].setText("3");
			nbutton[3] = (Button)findViewById(R.id.button4);
			nbutton[3].setText("!");
			nbutton[4] = (Button)findViewById(R.id.button5);
			nbutton[4].setText("$");
			nbutton[5] = (Button)findViewById(R.id.button6);
			nbutton[5].setText("*");
			nbutton[6] = (Button)findViewById(R.id.button7);
			nbutton[6].setText("-");
			nbutton[7] = (Button)findViewById(R.id.button8);
			nbutton[7].setText("?");
			nbutton[8] = (Button)findViewById(R.id.button9);
			nbutton[8].setText(")");
			nbutton[9] = (Button)findViewById(R.id.button10);
			nbutton[9].setText("+");
			nbutton[10] = (Button)findViewById(R.id.button11);
			nbutton[10].setText("4");
			nbutton[11] = (Button)findViewById(R.id.button12);
			nbutton[11].setText("5");
			nbutton[12] = (Button)findViewById(R.id.button13);
			nbutton[12].setText("6");
			nbutton[13] = (Button)findViewById(R.id.button14);
			nbutton[13].setText(".");
			nbutton[14] = (Button)findViewById(R.id.button15);
			nbutton[14].setText(",");
			nbutton[15] = (Button)findViewById(R.id.button16);
			nbutton[15].setText("@");
			nbutton[16] = (Button)findViewById(R.id.button17);
			nbutton[16].setText("%");
			nbutton[17] = (Button)findViewById(R.id.button18);
			nbutton[17].setText("(");
			nbutton[18] = (Button)findViewById(R.id.button19);
			nbutton[18].setText("\\");
			nbutton[19] = (Button)findViewById(R.id.button20);
			nbutton[19].setText("7");
			nbutton[20] = (Button)findViewById(R.id.button21);
			nbutton[20].setText("8");
			nbutton[21] = (Button)findViewById(R.id.button22);
			nbutton[21].setText("9");
			nbutton[22] = (Button)findViewById(R.id.button23);
			nbutton[22].setText("0");
			nbutton[23] = (Button)findViewById(R.id.button24);
			nbutton[23].setText(">");
			nbutton[24] = (Button)findViewById(R.id.button25);
			nbutton[24].setText("#");
			nbutton[25] = (Button)findViewById(R.id.button26);
			nbutton[25].setText("&");
			
		
			/*
			 * 
			 * ` and ~ will be 26 and 27 buttons
			 * nbutton[28] = (Button)findViewById(R.id.button29);
			nbutton[28].setText("-");
			nbutton[29] = (Button)findViewById(R.id.button30);
			nbutton[29].setText("/");
			 < also the 30th button
			*
			*all this is required  <<<<<<<<<<5 dynamic buttons>>>>>>>>>>>> 
			*/
			
			count_123++;
		 }
		else
		{
			flag=1;
			nbutton[0].setText("Q");
			nbutton[1].setText("W");
			nbutton[2].setText("E");
			nbutton[3].setText("R");
			nbutton[4].setText("T");
			nbutton[5].setText("Y");
			nbutton[6].setText("U");
			nbutton[7].setText("I");
			nbutton[8].setText("O");
			nbutton[9].setText("P");
			nbutton[10].setText("A");
			nbutton[11].setText("S");
			nbutton[12].setText("D");
			nbutton[13].setText("F");
			nbutton[14].setText("G");
			nbutton[15].setText("H");
			nbutton[16].setText("J");
			nbutton[17].setText("K");
			nbutton[18].setText("L");
			nbutton[19].setText("Z");
			nbutton[20].setText("X");
			nbutton[21].setText("C");
			nbutton[22].setText("V");
			nbutton[23].setText("B");
			nbutton[24].setText("N");
			nbutton[25].setText("M");
			
			count_123++;
		}
	}
	
	
}
