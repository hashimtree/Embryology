package com.embrmedia.my;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.service.autofill.RegexValidator;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class embre6 extends Activity {

EditText editText, editText2,editText3,editText4,editText5;
Button btn, btn2, btn3,btn4,btn5;
TextView textView, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.embre6);
  editText=(EditText)findViewById(R.id.editText); editText2=(EditText)findViewById(R.id.editText2);  editText3=(EditText)findViewById(R.id.editText3);
editText4=(EditText)findViewById(R.id.editText4);  editText5=(EditText)findViewById(R.id.editText5);
   textView=(TextView)findViewById(R.id.textView); textView2=(TextView)findViewById(R.id.textView2);  
   
 btn=(Button)findViewById(R.id.btn);  
 btn2=(Button)findViewById(R.id.btn2); 
 btn3=(Button)findViewById(R.id.btn3);  
 btn4=(Button)findViewById(R.id.btn4);
 btn5=(Button)findViewById(R.id.btn5); 
   ////////
 btn5.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){   
 Intent intent=new  Intent(embre6.this, MainActivity.class);
 startActivity(intent); 
  }}); 
 
textView2.setTextColor(Color.RED);  
 final  int total = 30;
 
  // the total number
//...
//when you want to start the counting start the thread bellow.//
 btn.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("1. Mention 5 derivatives of mesoderm");   
final String pas[]={"Muscles","Muscular","excretory","notochord","skeletal","circulatory","lymph","reproductive","dermis","cavities","cavity","adrenal cortex"};
////////
////////\\\////
 
  

///////
  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
 
}  
 textView.setText("لقد احرزت: "+"First Page..."+counter); 
textView.setTextColor(Color.BLUE); 


  }
}});
//////
/////


btn2.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("2. Mention five of the derivatives of endoderm");   
final String pas[]={"digestive","respiratory","urethera","bladder","reproductive","liver","pancreas","thymus","thyroid","Parathyroid"};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"First Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
//////
/////
//////
//////
//////
btn3.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("3. ");   
final String pas[]={""};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"First Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
//////
/////
btn4.setOnClickListener(new View.OnClickListener(){  
 @Override
 public void onClick(View v){ 
  int counter;        
     counter =0;    
   textView2.setText("4. ");   
final String pas[]={""};

  ///////
  
 for (int i = 0; i < pas.length; i++) {
 final Pattern P = Pattern.compile(
            Pattern.quote(pas[i]), Pattern.CASE_INSENSITIVE);
  String mydata1=editText.getText().toString().trim();  
 Matcher matcher = P.matcher(mydata1);
if (matcher.find())
{
  counter++;
  editText2.setTextColor(Color.BLUE); 
}  
 textView.setText("لقد احرزت: "+"First Page..."+counter); 
textView.setTextColor(Color.BLUE); 
   }
}});
///end///
/////
}
}
//////



