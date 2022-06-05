package com.example.tourist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Gmaps extends AppCompatActivity{
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,button22,button23,button24,button25;
ImageView imageView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gmaps);
        imageView=findViewById(R.id.image);
        button1= findViewById(R.id.golconda);
        button2= findViewById(R.id.statue);
        button3= findViewById(R.id.medak);
        button4= findViewById(R.id.marina);
        button5= findViewById(R.id.rock);
        button6= findViewById(R.id.paradise);
        button7= findViewById(R.id.eden);
        button8= findViewById(R.id.ramoji);
        button9= findViewById(R.id.charminar);
        button10= findViewById(R.id.vinayagar);
        button11= findViewById(R.id.tirumala);
        button12= findViewById(R.id.mtemple);
        button13= findViewById(R.id.shore);
        button14= findViewById(R.id.ktemple);
        button15= findViewById(R.id.btemple);
        button16= findViewById(R.id.matrimandir);
        button17= findViewById(R.id.ooty);
        button18= findViewById(R.id.chikmangulur);
        button19= findViewById(R.id.arakku);
        button20= findViewById(R.id.kodaikanal);
        button21= findViewById(R.id.coorg);
        button22= findViewById(R.id.npark);
        button23= findViewById(R.id.darga);
        button24=findViewById(R.id.wonderla);
        button25=findViewById(R.id.bpalace);

        button1.setOnClickListener(new Clik());
        button2.setOnClickListener(new Clik());
        button3.setOnClickListener(new Clik());
        button4.setOnClickListener(new Clik());
        button5.setOnClickListener(new Clik());
        button6.setOnClickListener(new Clik());
        button7.setOnClickListener(new Clik());
        button8.setOnClickListener(new Clik());
        button9.setOnClickListener(new Clik());
        button10.setOnClickListener(new Clik());
        button11.setOnClickListener(new Clik());
        button12.setOnClickListener(new Clik());
        button13.setOnClickListener(new Clik());
        button14.setOnClickListener(new Clik());
        button15.setOnClickListener(new Clik());
        button16.setOnClickListener(new Clik());
        button17.setOnClickListener(new Clik());
        button18.setOnClickListener(new Clik());
        button19.setOnClickListener(new Clik());
        button20.setOnClickListener(new Clik());
        button21.setOnClickListener(new Clik());
        button22.setOnClickListener(new Clik());
        button23.setOnClickListener(new Clik());
        button24.setOnClickListener(new Clik());
        button25.setOnClickListener(new Clik());
    }


public  class Clik implements View.OnClickListener{

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.golconda:
                Intent intent = new Intent(getApplicationContext(),golconda.class);
                startActivity(intent);
                break;
            case R.id.statue:
                Intent intent1 = new Intent(getApplicationContext(), buddha.class);
                startActivity(intent1);
                break;

            case R.id.medak:
                Intent intent2 = new Intent(getApplicationContext(), medak.class);
                startActivity(intent2);
                break;

            case R.id.marina:
                Intent intent3 = new Intent(getApplicationContext(), marina.class);
                startActivity(intent3);
                break;

            case R.id.rock:
                Intent intent4 = new Intent(getApplicationContext(), rockbeach.class);
                startActivity(intent4);
                break;

            case R.id.paradise:
                Intent intent5 = new Intent(getApplicationContext(), paradise.class);
                startActivity(intent5);
                break;

            case R.id.eden:
                Intent intent6 = new Intent(getApplicationContext(),eden.class);
                startActivity(intent6);
                break;

            case R.id.ramoji:
                Intent intent7 = new Intent(getApplicationContext(), ramoji.class);
                startActivity(intent7);
                break;

            case R.id.charminar:
                Intent intent8 = new Intent(getApplicationContext(), charminar.class);
                startActivity(intent8);
                break;

            case R.id.vinayagar:
                Intent intent9 = new Intent(getApplicationContext(), vinayagarTemple.class);
                startActivity(intent9);
                break;

            case R.id.tirumala:
                Intent intent10 = new Intent(getApplicationContext(), tirumala.class);
                startActivity(intent10);
                break;

            case R.id.mtemple:
                Intent intent11 = new Intent(getApplicationContext(), meenakshi.class);
                startActivity(intent11);
                break;

            case R.id.shore:
                Intent intent12 = new Intent(getApplicationContext(), shore.class);
                startActivity(intent12);
                break;

            case R.id.ktemple:
                Intent intent13 = new Intent(getApplicationContext(), kalahastri.class);
                startActivity(intent13);
                break;

            case R.id.btemple:
                Intent intent14 = new Intent(getApplicationContext(), bhadrachalam.class);
                startActivity(intent14);
                break;

            case R.id.matrimandir:
                Intent intent15 = new Intent(getApplicationContext(), matrimandir.class);
                startActivity(intent15);
                break;

            case R.id.ooty:
                Intent intent16 = new Intent(getApplicationContext(), ooty.class);
                startActivity(intent16);
                break;

            case R.id.chikmangulur:
                Intent intent17 = new Intent(getApplicationContext(), chikmanglur.class);
                startActivity(intent17);
                break;

            case R.id.arakku:
                Intent intent18 = new Intent(getApplicationContext(), arakuvalley.class);
                startActivity(intent18);
                break;
            case R.id.kodaikanal:
                Intent intent19 = new Intent(getApplicationContext(), kodaikanal.class);
                startActivity(intent19);
                break;

            case R.id.coorg:
                Intent intent20 = new Intent(getApplicationContext(), coorg.class);
                startActivity(intent20);
                break;

            case R.id.npark:
                Intent intent21 = new Intent(getApplicationContext(), nagarholepark.class);
                startActivity(intent21);
                break;

            case R.id.darga:
                Intent intent22 = new Intent(getApplicationContext(), darga.class);
                startActivity(intent22);
                break;

            case R.id.wonderla:
                Intent intent23 = new Intent(getApplicationContext(), wonderla.class);
                startActivity(intent23);
                break;

            case R.id.bpalace:
                Intent intent24 = new Intent(getApplicationContext(), palace.class);
                startActivity(intent24);
                break;


            default:
        }
    }

    }
}
