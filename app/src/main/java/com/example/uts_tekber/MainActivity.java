package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.BtnMain2Activity);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToMain2Activity();
            }
        });

        btnMove = findViewById(R.id.BtnMain3Activity);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToMain3Activity();
            }
        });

        btnMove = findViewById(R.id.BtnMain4Activity);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToMain4Activity();
            }
        });

        btnMove = findViewById(R.id.BtnMain5Activity);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToMain5Activity();
            }
        });

        btnMove = findViewById(R.id.BtnMain6Activity);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToMain6Activity();
            }
        });

    }

    private void moveToMain2Activity(){

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    private void moveToMain3Activity(){

        Intent intent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(intent);
    }
    private void moveToMain4Activity(){

        Intent intent = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(intent);
    }
    private void moveToMain5Activity(){

        Intent intent = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(intent);
    }
    private void moveToMain6Activity(){

        Intent intent = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(intent);
    }
}
