package com.test.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItogActivity extends AppCompatActivity {

    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itog);

        answerTextView = findViewById(R.id.answerTextView);
        answerTextView.setText(getIntent().getStringExtra("answer2"));
    }
}
