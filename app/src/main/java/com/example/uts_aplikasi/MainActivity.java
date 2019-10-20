package com.example.uts_aplikasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = (Button) findViewById(R.id.btnKom1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(),Komponen1.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnKom2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Komponen2.class);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnKom3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Komponen3.class);
                startActivity(i);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btnKom4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Komponen4.class);
                startActivity(i);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btnKom5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(getApplicationContext(), Komponen5.class);
                startActivity(i);
            }
        });
    }
}
