package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button BtnSyntax2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnMove = findViewById(R.id.BtnSyntax2);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax2();
            }
        });

    }

    private void moveToSyntax2(){

        Intent intent = new Intent(Main2Activity.this, Syntax2.class);
        startActivity(intent);
    }

    public void browser1 (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/activities.html?hl=id"));
        startActivity(browserIntent);

    }
}
