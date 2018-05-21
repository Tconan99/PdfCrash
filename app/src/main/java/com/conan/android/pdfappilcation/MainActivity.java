package com.conan.android.pdfappilcation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            X5WebViewActivity.path = "http://192.168.1.177:5050/";
            Intent intent = new Intent(MainActivity.this,
                    X5WebViewActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.button2).setOnClickListener(v -> {
            X5WebViewActivity.path = "http://192.168.1.177:7080/";
            Intent intent = new Intent(MainActivity.this,
                    X5WebViewActivity.class);
            startActivity(intent);
        });
    }
}
