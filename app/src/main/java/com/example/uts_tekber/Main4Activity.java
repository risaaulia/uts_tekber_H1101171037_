package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    Button BtnSyntax4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button btnMove = findViewById(R.id.BtnSyntax4);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax4();
            }
        });

    }

    private void moveToSyntax4(){

        Intent intent = new Intent(Main4Activity.this, Syntax4.class);
        startActivity(intent);
    }

    public void browser3 (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/reference/android/content/BroadcastReceiver.html?hl=id"));
        startActivity(browserIntent);

    }
}