package com.example.parabole;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText etA;
    EditText etB;
    EditText etC;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.editText);
        etB=(EditText)findViewById(R.id.editText2);
        etC=(EditText)findViewById(R.id.editText3);
        wv=(WebView)findViewById(R.id.myWebView);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new myWV());
    }

    public void buttonPressed(View view)
    {
        String s1=etA.getText().toString();
        String s2=etB.getText().toString();
        String s3=etC.getText().toString();

        if (s1==null || s2==null || s3==null || s1.equals("") || s2.equals("") || s3.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter all the numbers!!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (Double.valueOf(s1).doubleValue()==0)
        {
            Toast.makeText(getApplicationContext(), "A can't be equal to 0!!!!!!!!!!!!!!!", Toast.LENGTH_LONG).show();
            return;
        }

        String equation="https://www.google.com/search?q="+s1+"x%5E2%2B5x%2B5&oq=2x%5E2%2B"+s2+"%2B"+s3+"&aqs=chrome.0.69i59j0l7.3454j0j9&sourceid=chrome&ie=UTF-8";
        wv.loadUrl(equation);
    }

    private class myWV extends WebViewClient
    {
        public boolean shouldOverideUrlLoading(WebView view, String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}