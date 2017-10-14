package com.example.harshit.trackbag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    Button btncheck,btnunclaimed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btncheck=(Button)findViewById(R.id.btncheck);
        btnunclaimed=(Button)findViewById(R.id.btnunclaimed);
        btncheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
        btnunclaimed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public void onClick(View view) {

    }


    @Override
    protected void onPause() {
        super.onPause();


    }


}
