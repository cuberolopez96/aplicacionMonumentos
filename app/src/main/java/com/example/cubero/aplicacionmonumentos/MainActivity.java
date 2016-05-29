package com.example.cubero.aplicacionmonumentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private ListView lista;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.lista);
        Monumento[] monumentoses = {
                new Monumento("Mezquita", "La catedral de Cordoba",R.drawable.mezquita1,"La Mezquita-Catedral de Córdoba,1 2 antes «Santa María Madre de Dios» o «Gran Mezquita de Córdoba», actualmente conocida como la Catedral de la Asunción de Nuestra Señora de forma eclesiástica o simplemente Mezquita de Córdoba o Catedral de Córdoba de forma general, es un edificio de la ciudad de Córdoba, España."),
                new Monumento("Puente Romano", "es un puente",R.drawable.puente,"El puente romano de Córdoba está situado sobre el río Guadalquivir a su paso por Córdoba, y une el barrio del Campo de la Verdad con el Barrio de la Catedral. También conocido como \"el Puente Viejo\" fue el único puente con que contó la ciudad durante 20 siglos, hasta la construcción del puente de San Rafael, a mediados del siglo XX. El 9 de enero de 2008 se inauguró la mayor y discutida remodelación que el puente Romano ha tenido en su historia."),
                new Monumento("Sinagoga","Es la Sinagoga de Cordoba", R.drawable.mezquita1,"La Sinagoga de Córdoba es un templo hebreo localizado en la calle Judíos de la judería de la ciudad de Córdoba (España). Es la única sinagoga existente en Andalucía y una de las únicas tres que se conservan en España de esa época, junto a la Sinagoga del Tránsito y la de Santa María la Blanca.1 El 24 de enero de 1885 fue declarada Bien de Interés Cultural en la categoría de monumento.2 Forma parte del centro histórico de Córdoba que fue declarado Patrimonio de la Humanidad por la Unesco en 1994.3")
        };
        ListCustomAdapter listCustomAdapter = new ListCustomAdapter(monumentoses, this);
        lista.setAdapter(listCustomAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle b = new Bundle();
                b.putSerializable("monumento", (Serializable) parent.getItemAtPosition(position));
                Intent i = new Intent(MainActivity.this, Destino.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void clickearLista() {

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.cubero.aplicacionmonumentos/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.cubero.aplicacionmonumentos/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
