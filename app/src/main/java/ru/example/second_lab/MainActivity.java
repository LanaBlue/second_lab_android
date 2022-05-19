package ru.example.second_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.btn);
        textView = findViewById(R.id.view);
        context = this;

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String text = "Кнопка была нажата";
                textView.setText(text);
                Toast.makeText(context, "Нажатие на кнопку", Toast.LENGTH_SHORT).show();
                button.setEnabled(false);
            }

        }

        );
    }
}