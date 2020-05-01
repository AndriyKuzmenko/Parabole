package com.example.parabole;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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

        String equation="y="+s1+"x^2+"+s2+"x+"+s3;

    }
}
