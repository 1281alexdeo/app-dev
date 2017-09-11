package cs415app.bof;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mywebview = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://58e23df9.ngrok.io");
        mywebview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack()){

            mywebview.goBack();
        }
        else
        super.onBackPressed();
    }
}
