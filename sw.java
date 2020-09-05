
package com.embrmedia.my;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Arrays;

public class sw extends Activity {



private Button btnplay,btnsource; 
       VideoView videoView; 
 
 int []  videos={
   
    R.drawable.mmm,
    R.drawable.mp4,
    R.drawable.mm,
    
  };
  
  
  int position= -1;  

      @Override 
      protected void onCreate(Bundle savedInstanceState) { 
          super.onCreate(savedInstanceState); 
           setContentView(R.layout.sw); 
           btnplay = (Button) findViewById(R.id.btnplayvideo); 
          btnsource = (Button) findViewById(R.id.btnsource); 
          videoView = (VideoView) findViewById(R.id.videoView); 
           final MediaController mediaController = new MediaController(sw.this); 
   
         btnplay.setOnClickListener(new View.OnClickListener() { 
              @Override 
              public void onClick(View view) { 
                  //creating mediacontroller 
                  mediaController.setAnchorView(videoView); 
  
     //sprecify location of file    
                   Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.drawable.mp4); 
                 videoView.setMediaController(mediaController); 
                  videoView.setVideoURI(uri); 
                  videoView.requestFocus(); 
                   videoView.start();
                   
                   
                    
               } 
          }); 
          
btnplay.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	                if(position<videos.length-1){ 	                    position=position+1; 	         mediaController.setAnchorView(videoView); 
  
   ////////sprecify location of file 
                   Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+videos[position]); 
                 videoView.setMediaController(mediaController);                   videoView.setVideoURI(uri);                  videoView.requestFocus(); 
                   videoView.start();        
	               	               
  ////////	               

}  } 
      });  
      
 ////////
 ////////
 
 
 btnsource.setOnClickListener(new View.OnClickListener() { 
	            @Override 
	            public void onClick(View v) { 	                if(position>0){ 	                    position=position-1; 	         mediaController.setAnchorView(videoView); 
  
   ////////sprecify location of file 
                   Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+videos[position]); 
                 videoView.setMediaController(mediaController);                   videoView.setVideoURI(uri);                  videoView.requestFocus(); 
                   videoView.start();        
	               	               
  ////////	               

}  } 
      });  
      
           
      
      
      
      
                     
}
}


