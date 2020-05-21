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
    EditText etA, etB, etC;
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etA=(EditText)findViewById(R.id.etA);
        etB=(EditText)findViewById(R.id.etB);
        etC=(EditText)findViewById(R.id.etC);
        wv=(WebView)findViewById(R.id.wv);

        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new myWV());
    }

    public void buttonPressed(View view)
    {
        String aString=etA.getText().toString();
        String bString=etB.getText().toString();
        String cString=etC.getText().toString();

        if (aString==null || bString==null || cString==null || aString.equals("") || bString.equals("") || cString.equals(""))
        {
            Toast.makeText(getApplicationContext(), "Enter all the numbers!!!!", Toast.LENGTH_LONG).show();
            return;
        }

        if (Double.valueOf(aString).doubleValue()==0)
        {
            Toast.makeText(getApplicationContext(), "A can't be equal to 0!!!!!!!!!!!!!!!", Toast.LENGTH_LONG).show();
            return;
        }

        double a=Double.valueOf(aString).doubleValue();
        double b=Double.valueOf(bString).doubleValue();
        double c=Double.valueOf(cString).doubleValue();

        String equation="https://www.google.com/search?q=";
        if (a!=0 && a!=1 && b!=0 && b!=1 && c!=0 && c!=1)
        {
            equation+=aString + "x%5E2%2B" + bString + "x%2B" + cString + "&aqs=chrome.0.69i59j0l7.3454j0j9&sourceid=chrome&ie=UTF-8";
            wv.loadUrl(equation);
        }

        if (a!=1)
        {
            equation+=aString;
        }
        equation+="x%5E2%2B";

        if (b==1)
        {
            equation+="x%2B";
        }
        else if (b!=0)
        {
            equation+=bString+"x%2B";
        }

        equation+=cString;
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