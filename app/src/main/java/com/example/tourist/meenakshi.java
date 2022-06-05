package com.example.tourist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class
meenakshi  extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meenakshi);

        button = (Button) findViewById(R.id.a1);

        button2 = (Button) findViewById(R.id.a2);
        button3 = (Button) findViewById(R.id.a3);
        button4 = (Button) findViewById(R.id.a4);

        button5 = (Button) findViewById(R.id.a5);
        button6 = (Button) findViewById(R.id.a6);
        button7 = (Button) findViewById(R.id.a7);

        button.setOnClickListener(new meenakshi.clik());
        button2.setOnClickListener(new meenakshi.clik());
        button3.setOnClickListener(new meenakshi.clik());
        button4.setOnClickListener(new meenakshi.clik());
        button5.setOnClickListener(new meenakshi.clik());
        button6.setOnClickListener(new meenakshi.clik());
        button7.setOnClickListener(new meenakshi.clik());
    }

    public class clik implements View.OnClickListener {
        @SuppressLint("NonConstantResourceId")
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.a1:
                    Intent intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.919504,78.119342&mode=l"));
                    intent.setPackage("com.google.android.apps.maps");
                    startActivity(intent);
                    break;
                case R.id.a2:
                    Intent inten = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.920776,78.117759&mode=l"));
                    inten.setPackage("com.google.android.apps.maps");
                    startActivity(inten);
                    break;
                case R.id.a3:
                    Intent intnt = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.917513,78.117030&mode=l"));
                    intnt.setPackage("com.google.android.apps.maps");
                    startActivity(intnt);
                    break;
                case R.id.a4:
                    Intent intent4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.919718,78.116236&mode=l"));
                    intent4.setPackage("com.google.android.apps.maps");
                    startActivity(intent4);
                    break;
                case R.id.a5:
                    Intent intent5 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.917941,78.114613&mode=l"));
                    intent5.setPackage("com.google.android.apps.maps");
                    startActivity(intent5);
                    break;
                case R.id.a6:
                    Intent intent6 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.917465,78.114052&mode=l"));
                    intent6.setPackage("com.google.android.apps.maps");
                    startActivity(intent6);
                    break;
                case R.id.a7:
                    Intent intent7 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("google.navigation:q=9.918738,78.114120&mode=l"));
                    intent7.setPackage("com.google.android.apps.maps");
                    startActivity(intent7);
                    break;
                default:
            }
        }
    }
}
    