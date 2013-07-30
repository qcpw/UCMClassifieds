package com.facebook.samples.hellofacebook;

import java.util.Arrays;
//import java.util.List;

import com.facebook.Session;

import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

public class feedActivity extends Activity {
	

	
	
	 public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.stream);
		 
		 
		 WebView myWebView = (WebView) findViewById(R.id.webview);
		 Session session = Session.getActiveSession();
		 
		 Session.NewPermissionsRequest newPermissionsRequest = new Session
                 .NewPermissionsRequest(this, Arrays.asList("user_groups"));

         session.requestNewReadPermissions(newPermissionsRequest);

		 myWebView.loadUrl("https://graph.facebook.com/246947172002847/feed?access_token="+session.getAccessToken());
	 }
}
