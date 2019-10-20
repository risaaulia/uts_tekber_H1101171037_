package com.example.uts_tekber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button BtnSyntax3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnMove = findViewById(R.id.BtnSyntax3);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                moveToSyntax3();
            }
        });

    }

    private void moveToSyntax3(){

        Intent intent = new Intent(Main3Activity.this, Syntax3.class);
        startActivity(intent);
    }

    public void browser2 (View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/guide/components/services.html?hl=id#java"));
        startActivity(browserIntent);

    }
}
