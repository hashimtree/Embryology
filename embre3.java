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
public class embre3 extends Activity {

EditText editText, editText2,editText3,editText4,editText5;
Button btn, btn2, btn3,btn4,btn5;
TextView textView, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.embre3);
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
 Intent intent=new  Intent(embre3.this, embre4.class);
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
   textView2.setText("1. Mention the names of the three stages of embryology");   
final String pas[]={"Germinal","embryonic","foetal"};
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
   textView2.setText("2. Mention the five important changes of first week of germinal peroid");   
final String pas[]={"Fertilization","Cleavage","Morula","Blastocyst","Implantation"};

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
   textView2.setText("3. Write short note about morula");   
final String pas[]={"Mullberry","inner cell mass","outer cell mass","12 to 16","Zona pellucida","embryo proper","coverings","protective"};

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
   textView2.setText("4. Write short note about definition, time and site of implantation");   
final String pas[]={"Penetration","Blastocyst","endometrium","uterus","6th","11th","six","eleven","fundus"};

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



