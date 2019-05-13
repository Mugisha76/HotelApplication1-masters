package com.example.hotelapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class KampalaHotels extends AppCompatActivity {
    TextView txt;
    String [] items;
    int [] images;
    ListViewAdapter_Kampala adpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kampala_hotels);




        final ListView reg = findViewById(R.id.kam);
        final ArrayList<String> list = new ArrayList<String>();

        items = new String[]{"Serena Hotel","Victoria Hotel","Africana Hotel","Pearl Hotel","Imperial Hotel"};

        images = new int[]{R.drawable.k1,R.drawable.k2,R.drawable.k3,R.drawable.k4,R.drawable.k5};


        adpter = new ListViewAdapter_Kampala(KampalaHotels.this,images,items);
        reg.setAdapter(adpter);

        reg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

//                Toast.makeText(getApplicationContext(), ""+list.get(position), Toast.LENGTH_SHORT).show();

//                Intent loadApps = new Intent(three.this,AppsInstalled.class);
//                startActivity(loadApps);




            }
        });

    }
}

