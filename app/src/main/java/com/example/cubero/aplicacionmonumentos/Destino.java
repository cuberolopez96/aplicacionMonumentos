package com.example.cubero.aplicacionmonumentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Destino extends AppCompatActivity {
    private TextView nombre;
    private TextView descripcion;
    private Monumento monumento;
    private ImageView imageView;
    private TextView ttextolargo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);
        Intent i = this.getIntent();
        Bundle b = i.getExtras();
        monumento = (Monumento) b.getSerializable("monumento");
        nombre = (TextView) findViewById(R.id.nombre);
        descripcion = (TextView) findViewById(R.id.descripcion);
        imageView = (ImageView) findViewById(R.id.imagen);
        nombre.setText("Nombre: "+monumento.getNombre());
        descripcion.setText("Descripcion: "+monumento.getDescripcion());
        imageView.setImageResource(monumento.getId());
        ttextolargo = (TextView) findViewById(R.id.textolargo);
        ttextolargo.setText(""+monumento.getTextolargo());
    }
}
