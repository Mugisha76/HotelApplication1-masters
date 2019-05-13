package com.example.hotelapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Second extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        list=findViewById(R.id.list);
        final ArrayList<String>arraylist=new ArrayList<String>();
        arraylist.add("Kampala");
        arraylist.add("Fort Portal");
        arraylist.add("Mbarara");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraylist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(Second.this, ""+arraylist.get(position), Toast.LENGTH_SHORT).show();
                if(arraylist.get(position)=="Kampala"){
                    Intent kla = new Intent(Second.this,KampalaHotels.class);
                    startActivity(kla);
                }
                else if (arraylist.get(position)=="Fort Portal"){
                    Intent ftp = new Intent(Second.this,FortportalHotels.class);
                    startActivity(ftp);
                }else{
                    Intent mba = new Intent(Second.this,MbararaHotels.class);
                    startActivity(mba);
                }
            }
        });



    }
}
