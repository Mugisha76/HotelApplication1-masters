package com.example.hotelapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FortportalHotels extends AppCompatActivity {
    TextView txt;
    String [] items;
    int [] images;
    ListViewAdapter_Kampala adpter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortportal_hotels);




        final ListView reg = findViewById(R.id.ftp);
        final ArrayList<String> list = new ArrayList<String>();

        items = new String[]{"Travellers Inn Hotel","Pentagon Hotel","FortPortal Hill Hotel","Gilmans Inn Hotel","Royal Cottages Hotel"};

        images = new int[]{R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5};


        adpter = new ListViewAdapter_Kampala(FortportalHotels.this,images,items);
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
