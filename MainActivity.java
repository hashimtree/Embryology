package com.embrmedia.my;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.VideoView;
import android.widget.ViewFlipper;
import android.widget.ViewSwitcher; 	 
	public class MainActivity extends Activity { 
	
	VideoView videoView;
	
	ImageSwitcher imageSwitcher; 
	
	
	EditText editText;	 
	    TextSwitcher textSwitcher; 
	    Button buttonPrivious ,buttonNext; 
	    
    int[] images = { 
	 R.drawable.a, 
	 R.drawable.b, 
	 R.drawable.c,
	 R.drawable.breast, 
	 R.drawable.oocyte, 
	 R.drawable.cleavage,            
	 R.drawable.pstreak,          
	 R.drawable.fertilization,
	 R.drawable.zygote,
	 R.drawable.folding,  
	 R.drawable.placenta,
	 R.drawable.process, 
	 R.drawable.stages,
	 R.drawable.timeline,
	            
	    }; 
	    
	 	    
	    

	    String[] lists ={ 
	            "1. a.What is this structure?        ....b.Name its three layers","2. a.What is this ..... b.How is it produced?", 
	            "3. a.Name this stage. b.Which day it occurs?", "4. a.What is this structure?....b.What is its function?","5. a.What is this?  b.Where is it produced?","6. a.Name this b. Where is it produced?","7. What is name and result of this process", "8. a.Name this stage ...b.Where  and when does fertilization occurs?","9. Name this stage","10. What is the difference between fetus and embryo?","11. Name this structure and what are its functions","12. What is morohogenesis?","13. What are the three layers of gastrula?"
	           }; 	 
	    int position = -1; 
	 
	    @Override 
	    protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        setContentView(R.layout.activity_main); 
	
imageSwitcher = findViewById(R.id.image_switcher); 
	    	
	    		        
editText=(EditText) findViewById(R.id.editText); 
	      	        
	        
	        textSwitcher = findViewById(R.id.text_switcher); 
	        buttonNext = findViewById(R.id.button_next); 
	        buttonPrivious = findViewById(R.id.button_previous); 
	        
	        
	        ////
	        
	        /////
	        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { 
	            @Override 
	            public View makeView() { 
	                TextView textView=new TextView(getApplicationContext()); 
	                textView.setTextSize(16); 	                textView.setTextColor(Color.RED); 
	                textView.setGravity(Gravity.CENTER); 
	                return textView; 
	            } 
	        }); 
		        
	        
	////////
	//////        
	imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() { 
	            @Override 
	            public View makeView() { 
	                ImageView imageView=new ImageView(getApplicationContext());	                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, 	                        ActionBar.LayoutParams.WRAP_CONTENT)); 
	 
	                return imageView; 
	            } 
	        }); 
	        buttonNext.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	                if(position<images.length-1){ 	                    position=position+1; 
	                    imageSwitcher.setBackgroundResource(images[position]); 
textSwitcher.setText(lists[position]); 	               
///////	               
            
	               
	               
////////	               
	                } 
	            } 
	        }); 
	 
	        buttonPrivious.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 
	                if(position>0){ 
	                    position=position-1; 
	                    imageSwitcher.setBackgroundResource(images[position]); 
	              
textSwitcher.setText(lists[position]); 	              
	                } 
	                
  
	                
	                
	            } 
	        });   
	        
	        
	 //////       
	    } 
	} 
	 
