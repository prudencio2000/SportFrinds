package com.example.sportfrinds;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class AdapterEstiloView extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<EstiloView> items;



    public AdapterEstiloView (Activity activity, ArrayList<EstiloView> items) {

        this.activity = activity;
        this.items = items;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(ArrayList<EstiloView> category) {
        for (int i = 0; i < category.size(); i++) {
            items.add(category.get(i));
        }
    }



    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_estilo, null);
        }

        EstiloView dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.titulo);
        title.setText(dir.getTitulo());

        TextView description = (TextView) v.findViewById(R.id.descripcion);
        description.setText(dir.getDescription());
        TextView horarioInicial = (TextView) v.findViewById(R.id.Fecha_inicial);

        TextView horarioFinal = (TextView) v.findViewById(R.id.Fecha_inicial);

        return v;
    }
    }

