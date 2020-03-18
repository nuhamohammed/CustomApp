package com.mohammednuha.customapp.customapp;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class ResultFragment extends Fragment {

    View view;
    Button restartButton;
Intent intent;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        Bundle bundle = this.getArguments();

        view = inflater.inflate(R.layout.result_fragment, container, false);
        ConstraintLayout cl= view.findViewById(R.id.mylayout);
        Button btn = new Button(getContext());
        btn.setBackgroundColor(Color.RED);
        btn.setText(bundle.getString("name"));
        cl.addView(btn);
        restartButton = (Button) view.findViewById(R.id.restart);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getContext(), Main2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                // intent.putExtra("username", username.getText());
                startActivity(intent);
            }
        });
        return view;
    }
}