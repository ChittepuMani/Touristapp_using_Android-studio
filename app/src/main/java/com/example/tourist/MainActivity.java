package com.example.tourist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
   public static List<Places> list = new ArrayList<>();
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
           recyclerView.setLayoutManager(new LinearLayoutManager(this));
int button=1;
        String[] Name =getResources().getStringArray(R.array.name);
        int[] profileimage ={R.drawable.arakuvalley,R.drawable.tirumala,R.drawable.barashahiddarga,R.drawable.srikalhastri,
                R.drawable.dhyanabuddha,R.drawable.charminar,R.drawable.ramojifilmcity,R.drawable.bhadrachalam,R.drawable.golcondafort,
                R.drawable.medakfort,R.drawable.ooty,R.drawable.kodaikanal,R.drawable.marinabeach,R.drawable.meenashitemple,R.drawable.shoretemple,
                R.drawable.coorg,R.drawable.wonderla,R.drawable.chikmangalur,R.drawable.nagarhole,R.drawable.bangalorepalace,
                R.drawable.matrimandir,R.drawable.paradisebeach,R.drawable.rockbeach,R.drawable.edenbeach,R.drawable.arulmigumanakulavinayagar
        };
        String[] descForAll = getResources().getStringArray(R.array.desption);
for (int i=0;i<descForAll.length;i++){
    Places places =new Places(profileimage[i],Name[i],descForAll[i],button);
    list.add(places);
    }
adapter=new RecyclerViewAdapter(this,list);
recyclerView.setAdapter(adapter);
}}