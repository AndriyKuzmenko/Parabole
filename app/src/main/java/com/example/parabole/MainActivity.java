package com.example.parabole;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

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
    }

    public void buttonPressed(View view)
    {

    }
}
