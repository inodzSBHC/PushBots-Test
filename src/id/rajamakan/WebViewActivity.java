package id.rajamakan;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity{
	WebView web;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		web = (WebView) findViewById(R.id.webview01);
		web.setWebViewClient(new WebViewClient());
		String url = getIntent().getStringExtra("url");
		web.loadUrl(url);
	}

}