package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {

    Button BtnSyntax5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button btnMove = findViewById(R.id.BtnSyntax5);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax5();
            }
        });

    }

    private void moveToSyntax5(){

        Intent intent = new Intent(Main5Activity.this, Syntax5.class);
        startActivity(intent);
    }

    public void browser4 (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/topics/providers/content-providers.html"));
        startActivity(browserIntent);

    }
}