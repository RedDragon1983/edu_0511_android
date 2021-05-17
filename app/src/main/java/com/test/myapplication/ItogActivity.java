package com.test.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItogActivity extends AppCompatActivity {

    private TextView answerTextView;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itog);

        answerTextView = findViewById(R.id.answerTextView);
        answerTextView.setText(getIntent().getStringExtra("answer2"));
        start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ItogActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
