package com.embrmedia.my;
import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class sw2 extends Activity {

    private VideoView videoView ;
    private Button playBt;
    //Provide video source
    String VideoURL ="";
private  WebView webView; WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sw2);
videoView = (VideoView)findViewById(R.id.videoView);



        playBt = (Button)findViewById(R.id.playBtn);
        try {
 // Start the MediaController
            MediaController mediacontroller = new MediaController(this);
            mediacontroller.setAnchorView(videoView);
            // Get the URL from String VideoURL
            Uri video = Uri.parse(VideoURL);
            videoView.setMediaController(mediacontroller);
            videoView.setVideoURI(video);
            videoView.requestFocus();

        } catch (Exception e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();
   videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
  // Close the progress bar and play 
            public void onPrepared(MediaPlayer mp) {
             }
        });
webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/egg-meiosis.mp4");
   webView2.loadUrl("file:///android_asset/egg-meiosis.mp4"); webView.loadUrl("file:///android_asset/mp4.mp4");      
        
        
        
     playBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoView.start();
            }
        });


    }


}
