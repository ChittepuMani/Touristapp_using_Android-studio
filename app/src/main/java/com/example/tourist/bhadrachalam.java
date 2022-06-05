package com.example.tourist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class bhadrachalam extends AppCompatActivity {
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
        setContentView(R.layout.bhadrachalam);

            button = (Button) findViewById(R.id.a1);

            button2 = (Button) findViewById(R.id.a2);
            button3 = (Button) findViewById(R.id.a3);
            button4 = (Button) findViewById(R.id.a4);

            button5 = (Button) findViewById(R.id.a5);
            button6 = (Button) findViewById(R.id.a6);
            button7 = (Button) findViewById(R.id.a7);

            button.setOnClickListener(new bhadrachalam.clik());
            button2.setOnClickListener(new bhadrachalam.clik());
            button3.setOnClickListener(new bhadrachalam.clik());
            button4.setOnClickListener(new bhadrachalam.clik());
            button5.setOnClickListener(new bhadrachalam.clik());
            button6.setOnClickListener(new bhadrachalam.clik());
            button7.setOnClickListener(new bhadrachalam.clik());
        }

            public class clik implements View.OnClickListener {
                @SuppressLint("NonConstantResourceId")
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.a1:
                            Intent intent = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.666870,80.882631&mode=l"));
                            intent.setPackage("com.google.android.apps.maps");
                            startActivity(intent);
                            break;
                        case R.id.a2:
                            Intent inten = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.669622,80.885088&mode=l"));
                            inten.setPackage("com.google.android.apps.maps");
                            startActivity(inten);
                            break;
                        case R.id.a3:
                            Intent intnt = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.668529,80.885358&mode=l"));
                            intnt.setPackage("com.google.android.apps.maps");
                            startActivity(intnt);
                            break;
                        case R.id.a4:
                            Intent intent4 = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.666337,80.881208&mode=l"));
                            intent4.setPackage("com.google.android.apps.maps");
                            startActivity(intent4);
                            break;
                        case R.id.a5:
                            Intent intent5 = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.666381,80.882870&mode=l"));
                            intent5.setPackage("com.google.android.apps.maps");
                            startActivity(intent5);
                            break;
                        case R.id.a6:
                            Intent intent6 = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.666625,80.883916&mode=l"));
                            intent6.setPackage("com.google.android.apps.maps");
                            startActivity(intent6);
                            break;
                        case R.id.a7:
                            Intent intent7 = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("google.navigation:q=17.666746,80.883707&mode=l"));
                            intent7.setPackage("com.google.android.apps.maps");
                            startActivity(intent7);
                            break;
                        default:
                    }
                }
            }
        }
