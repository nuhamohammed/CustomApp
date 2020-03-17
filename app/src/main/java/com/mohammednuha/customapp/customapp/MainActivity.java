package com.mohammednuha.customapp.customapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements ViewStub.OnClickListener{

    public ImageButton btn1, btn2, btn3, btn4;
    Button startButton;
    EditText username;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.startbtn);
        startButton.setOnClickListener(this);
        username= findViewById(R.id.username);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.startbtn:
                if(TextUtils.isEmpty(username.getText()))
                    username.setError( "Name is required!" );
                else {
                    intent = new Intent(this, Main2Activity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                   // intent.putExtra("username", username.getText());
                    startActivity(intent);
                }

        }
    }
}
