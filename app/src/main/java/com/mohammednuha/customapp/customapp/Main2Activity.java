package com.mohammednuha.customapp.customapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    public Button btn1, btn2, btn3, btn4;
    public int[] birds = new int [10];
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4= findViewById(R.id.btn4);

    }

    public void changeOptions(){
        //btn1.setText();
    }
    public void changePic(){

    }
    @Override
    public void onClick(View view) {
        //change image and options
     //   if(birds[])
        //if wrong restart

    }
}
