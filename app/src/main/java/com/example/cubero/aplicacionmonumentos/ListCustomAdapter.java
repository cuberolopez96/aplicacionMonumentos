package com.example.cubero.aplicacionmonumentos;

import android.app.ListActivity;
import android.content.Context;
import android.sax.TextElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import static com.example.cubero.aplicacionmonumentos.R.layout.elementos;

/**
 * Created by Juan A on 25/05/2016.
 */
public class ListCustomAdapter extends ArrayAdapter<Monumento> {
    private Monumento[] monumentos;
    private Context context;
     public ListCustomAdapter(Monumento[] monumentos, Context context){
           super(context, R.layout.elementos,monumentos);
         this.monumentos = monumentos;
         this.context = context;
     }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(elementos,parent,false);
        TextView textView = (TextView) rowView.findViewById(R.id.nombre);
        TextView textView1 = (TextView) rowView.findViewById(R.id.descripcion);
        textView.setText(""+monumentos[position].getNombre());
        textView1.setText(""+monumentos[position].getDescripcion());
        return rowView;
    }
}

