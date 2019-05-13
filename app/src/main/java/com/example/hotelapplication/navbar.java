package com.example.hotelapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class navbar extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigate);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new homefragement()).commit();






    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigate= new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;

            switch(menuItem.getItemId()){
                case R.id.hom:
                    fragment = new homefragement();
                    break;
                case R.id.search:
                    fragment= new searchfragment();
                    break;


                case R.id.fq:

                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();



            return true;

        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x=item.getItemId();
        switch (x){

            case R.id.hm:

                break;
            case R.id.hp:

                break;

            case R.id.fq:
                Intent intent=new Intent(navbar.this,IntentActivity.class);
                startActivity(intent);
                
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }





}
