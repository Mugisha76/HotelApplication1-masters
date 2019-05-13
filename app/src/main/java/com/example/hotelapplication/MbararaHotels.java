package com.example.hotelapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MbararaHotels extends AppCompatActivity {
    TextView txt;
    String [] items;
    int [] images;
    ListViewAdapter_Kampala adpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbarara_hotels);




        final ListView reg = findViewById(R.id.mba);
        final ArrayList<String> list = new ArrayList<String>();

        items = new String[]{"Kash Hotel","Pelican Hotel","Oxford Hotel","Kosiya Hotel","Accacia Hotel"};

        images = new int[]{R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,R.drawable.m5};


        adpter = new ListViewAdapter_Kampala(MbararaHotels.this,images,items);
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
