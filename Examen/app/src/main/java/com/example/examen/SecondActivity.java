package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = findViewById(R.id.textView2);

        Bundle datos = getIntent().getExtras();

        tv.setText(datos.getString("text"));

    }

    public void borrar(View view) {
        tv.setVisibility(View.GONE);
        findViewById(R.id.toggleButton).setVisibility(View.GONE);
    }
}
