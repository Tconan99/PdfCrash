package com.conan.android.pdfappilcation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            WebViewActivity.path = "http://172.16.3.7:8182/wx/";
            Intent intent = new Intent(MainActivity.this,
                    WebViewActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.button2).setOnClickListener(v -> {
            X5WebViewActivity.path = "http://172.16.3.7:8182/wx/";
            Intent intent = new Intent(MainActivity.this,
                    X5WebViewActivity.class);
            startActivity(intent);
        });


//        WebViewActivity.path = "http://172.16.3.7:8182/wx/";
//        Intent intent = new Intent(MainActivity.this,
//                WebViewActivity.class);
//        startActivity(intent);
    }
}
