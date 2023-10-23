package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private EditText digit1;
    private EditText digit2;
    private Button sum,minus,umn,del;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textView2);
        digit1 = findViewById(R.id.digit1);
        digit2 = findViewById(R.id.digit2);
        sum = findViewById(R.id.sum);
        minus = findViewById(R.id.minus);
        umn = findViewById(R.id.umn);
        del = findViewById(R.id.del);


        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float slog_1 = Float.parseFloat(digit1.getText().toString());
                float slog_2 = Float.parseFloat(digit2.getText().toString());
                myTextView.setText(String.valueOf(slog_1+slog_2));

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float slog_1 = Float.parseFloat(digit1.getText().toString());
                float slog_2 = Float.parseFloat(digit2.getText().toString());
                myTextView.setText(String.valueOf(slog_1-slog_2));
            }
        });
        umn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float slog_1 = Float.parseFloat(digit1.getText().toString());
                float slog_2 = Float.parseFloat(digit2.getText().toString());
                myTextView.setText(String.valueOf(slog_1*slog_2));
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float slog_1 = Float.parseFloat(digit1.getText().toString());
                float slog_2 = Float.parseFloat(digit2.getText().toString());
                myTextView.setText(String.valueOf(slog_1/slog_2));
            }
        });
    }
}