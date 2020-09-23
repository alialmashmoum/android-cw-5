package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name = findViewById(R.id.textView3);
        TextView age = findViewById(R.id.textView4);
Bundle nextp = getIntent().getExtras();
String nexta = nextp.getString("info");

        String nextr = nextp.getString("age");
        name.setText(""+nexta);
       age.setText(""+nextr);
        Button C = findViewById(R.id.button);
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent O = new  Intent(MainActivity2.this,MainActivity.class);
                startActivity(O);
            }
        });
    }
}