package com.example.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InsertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        Button btnInserta = findViewById(R.id.btnInsert);
        btnInserta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Modelo obj = new Modelo();
                Empleado usr =new Empleado();

                usr.setId("1");
                usr.setNombre("Diego");
                usr.setEmail("diego.portilla00@usc.edu.co");
                usr.setPassword("contraseña");
                int resInsert = obj.insertarEmpleado(InsertActivity.this, usr);
                if (resInsert==1){
                    Toast.makeText(InsertActivity.this, "OK", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(InsertActivity.this, "KO", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}