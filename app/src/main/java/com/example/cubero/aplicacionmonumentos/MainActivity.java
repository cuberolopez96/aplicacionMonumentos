package com.example.cubero.aplicacionmonumentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private  ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.lista);
        Monumento[] monumentoses = {new Monumento("Mezquita","La catedral de Cordoba"),new Monumento("Puente Romano","es un puente")};
        ArrayAdapter<Monumento> adapter = new ArrayAdapter<Monumento>(this,R.layout.elementos,monumentoses);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle b = new Bundle();
                b.putSerializable("monumento", (Serializable) parent.getItemAtPosition(position));
                Intent i = new Intent(MainActivity.this,Destino.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }


    public void clickearLista(){

    }
}
