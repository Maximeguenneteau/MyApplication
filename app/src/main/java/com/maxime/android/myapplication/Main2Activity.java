package com.maxime.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView2;
    TextView textView3,textView4;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView2 = findViewById(R.id.imageView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);

        getData();
        setData();
    }

    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra( "data2") && getIntent().hasExtra("data1")){
            data1 = getIntent().getStringExtra("data2");
            data2 = getIntent().getStringExtra("data1");
            myImage = getIntent().getIntExtra("myImage", 1);
        }else{
            Toast.makeText(this,"no Data", Toast.LENGTH_SHORT).show();
        }
    }
    private void setData(){
        textView3.setText(data2);
        textView4.setText(data1);
        imageView2.setImageResource(myImage);
    }
}
