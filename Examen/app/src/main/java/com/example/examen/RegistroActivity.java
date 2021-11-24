package com.example.examen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.examen.pojos.Empleado;
import com.example.examen.pojos.Empleado.Genero;
import com.example.examen.pojos.Programador;
import com.example.examen.pojos.Comercial;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class RegistroActivity extends AppCompatActivity {

    public enum Cargo {Programador, Comercial};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void registrar(View view) {

        String nombre = ((EditText) findViewById(R.id.etNombre)).getText().toString();
        String apell1 = ((EditText) findViewById(R.id.etApellido1)).getText().toString();
        String apell2 = ((EditText) findViewById(R.id.etApellido2)).getText().toString();

        Genero genero;
        if (((RadioButton) findViewById(R.id.rbHombre)).isChecked())
            genero=Genero.Varón;
        else if (((RadioButton) findViewById(R.id.rbMujer)).isChecked())
            genero=Genero.Mujer;
        else genero=Genero.Otro;

        String fecha = ((EditText) findViewById(R.id.etIncorporacion)).getText().toString();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate incorporacion=null;
        try {
            incorporacion = LocalDate.parse(fecha, dtf);
        } catch (DateTimeParseException ex) {
            Toast.makeText(getApplicationContext(),
                    "Formato de fecha incorrecto: yyyy-MM-dd", Toast.LENGTH_SHORT).show();
        }

        Cargo cargo = ((RadioButton) findViewById(R.id.rbProgramador)).isChecked()
                ? Cargo.Programador : Cargo.Comercial;

        Empleado emp = null;
        if (cargo==Cargo.Programador)
            emp = new Programador(nombre,apell1,apell2,genero,incorporacion,null);
        else if (cargo==Cargo.Comercial)
            emp = new Comercial(nombre,apell1,apell2,genero,incorporacion,null);



        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("Registrando");
        ad.setMessage(emp.toString());
        ad.setCancelable(true);
        ad.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                limpiarRegistro();
            }
        });

        ad.show();
        

    }

    private void limpiarRegistro() {
/*        ((EditText) findViewById(R.id.etNombre)).setText("");
        ((EditText) findViewById(R.id.etApellido1)).setText("");
        ((EditText) findViewById(R.id.etApellido2)).setText("");
        ((EditText) findViewById(R.id.etIncorporacion)).setText("");
        ((RadioButton) findViewById(R.id.rbComercial)).setChecked(false);
        ((RadioButton) findViewById(R.id.rbHombre)).setChecked(false);
        ((RadioButton) findViewById(R.id.rbMujer)).setChecked(false);
        ((RadioButton) findViewById(R.id.rbProgramador)).setChecked(false);*/

/*        setContentView(R.layout.activity_registro);*/

        ((EditText) findViewById(R.id.etNombre)).getText().clear();
        ((EditText) findViewById(R.id.etApellido1)).getText().clear();
        ((EditText) findViewById(R.id.etApellido2)).getText().clear();
        ((EditText) findViewById(R.id.etIncorporacion)).getText().clear();
        ((RadioGroup) findViewById(R.id.rgCargo)).clearCheck();
        ((RadioGroup) findViewById(R.id.rgSexo)).clearCheck();


    }
}
