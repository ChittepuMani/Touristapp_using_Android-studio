package com.example.tourist;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewActivity extends AppCompatActivity {
    CircleImageView imageView;
    TextView placeName, Descrp;
    Button button,button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        imageView = findViewById(R.id.profileImage);
        placeName = findViewById(R.id.name2);
        Descrp = findViewById(R.id.descp);
        button1=findViewById(R.id.btnn2);
        button2=findViewById(R.id.btnn1);
        button = (Button) findViewById(R.id.button);
        int position = getIntent().getIntExtra("position", 1);
        imageView.setImageResource(MainActivity.list.get(position).getImageProfile());
        placeName.setText(MainActivity.list.get(position).getName());
        Descrp.setText(MainActivity.list.get(position).getNameDes());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If you are inside activity, otherwise pass context to this funtion

                Intent intent = new Intent(getApplicationContext(), Gmaps.class);
                startActivity(intent);

            }
        });
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent inte=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(inte);
    }
});
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.maincontainer,new BlankFragment()).commit();
        button2.setVisibility(View.GONE);
    }
});



    }

}