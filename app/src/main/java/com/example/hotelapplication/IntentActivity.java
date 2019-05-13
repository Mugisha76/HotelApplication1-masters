package com.example.hotelapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {
    Button mybutton;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);


        mybutton=findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((editText.getText().toString().isEmpty())){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.google.com"));
                    startActivity(intent);
                }
// else if(!(editText.getText().toString().contains("www"))){
//                    Toast.makeText(nutrition.this, "Enter correct format starting with www", Toast.LENGTH_SHORT).show();
//
//                }
                else{
                    String url = editText.getText().toString();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www."+url));
                    startActivity(intent);
                }



            }
        });
    }

}
