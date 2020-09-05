
package com.embrmedia.my;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;


public class em2 extends Activity {

Button btn1, btn2;
TextView textView1;
EditText editText1, editText2; 
TextClock textClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);
textClock=(TextClock)findViewById(R.id.textClock);
textView1=(TextView)findViewById(R.id.textView1);
textView1.setBackgroundColor(Color.RED);
btn1=(Button)findViewById(R.id.btn1);
  textView1.setText(" كلية الجزيرة للعلوم الطبية و التكنولوجيا .. علم الأجنة ");
   
  TextView resultLabel = (TextView) findViewById(R.id.resultLabel);
        TextView totalScoreLabel = (TextView) findViewById(R.id.totalScoreLabel);
 
 
    ////////
final String myPassword=getIntent().getStringExtra("RIGHT_ANSWER_COUN"); 
   ///////     
final String nname=getIntent().getStringExtra("RIGHT_ANSWER_COU");   
   /////// 
final int score=getIntent().getIntExtra("RIGHT_ANSWER_COUNT",0);
//////////
//////////         
  SharedPreferences  settings = getSharedPreferences("Quizapp", Context.MODE_PRIVATE);

         int totalScore = settings.getInt("totalScore",0);
        totalScore+=score;
        resultLabel.setText(score + "/Embryology");
        totalScoreLabel.setText("Total Score :" + totalScore+" -"+myPassword+" ... "+nname);

        //update the totalScore
        SharedPreferences.Editor editor =settings.edit();
        editor.putInt("totalScore",totalScore);
        editor.commit();


 /////
 btn1.setOnClickListener(new View.OnClickListener(){
 @Override 
 public void onClick(View v){
   
  Intent intent = new Intent(em2.this, em1.class); intent.putExtra("RIGHT_ANSWER_COUN",myPassword);
intent.putExtra("RIGHT_ANSWER_COU",nname); intent.putExtra("RIGHT_ANSWER_COUNT",score); 
 startActivity(intent); 
	   }          
	        }); 
 
 
 
 
 
 
  
   
    }

}
