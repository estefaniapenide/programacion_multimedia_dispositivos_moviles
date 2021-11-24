package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final static String CONTADOR_STRING = "Contador ";

    int contador=0;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = ((EditText) findViewById(R.id.editText));
    }

    public void contar(View view) {
        contador++;
        et.setText(CONTADOR_STRING+contador);
    }

    public void enviar(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("text",et.getText().toString());
        startActivity(intent);
    }

    public void toRegistroActivity(View view) {
        startActivity(new Intent(this, RegistroActivity.class));
    }
}
