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
public class embre2 extends Activity {

EditText editText, editText2,editText3,editText4,editText5;
Button btn, btn2, btn3,btn4,btn5;
TextView textView, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.embre2);
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
 Intent intent=new  Intent(embre2.this, embre3.class);
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
   textView2.setText("1. Write  short notes about gametogenesis");   
final String pas[]={"gamete formation","ovary","ovaries","testis","testes","testicles","gonads","Spermatogenesis","oogenesis","Proliferation","Meiosis","Maturation","Extragonadal","gametes"};
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
 textView.setText(" احرزت  : "+"First Page..."+counter); 
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
     
   textView2.setText("2. What are the female internal genital organs?");   
final String pas[]={"Ovary","Ovaries","Uterus","Vagina","Tubes"};

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
   textView2.setText("3. Define Spermatogenesis");   
final String pas[]={" sperm development","develop","maturation","mature","fertilizing ovum"};

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
   textView2.setText("4. Factors affecting Spermatogenesis");   
final String pas[]={"Endocrine","Temprature","Alcohol","infection","Environment","Dietary","Smoking","infectious diseases","Radiation"};

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
}
}
//////



