package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button a = findViewById(R.id.nextPage);
        final EditText s = findViewById(R.id.name2);
        final EditText d = findViewById(R.id.age1);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = s.getText().toString();
                String age = d.getText().toString();
                Intent x = new Intent(MainActivity.this , MainActivity2.class);
                x.putExtra("info", name);
                x.putExtra("age", age);
                startActivity(x);
            }
        });
    }
}