package com.example.tp3_listview_navarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();

    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapater = new ListaInmuebleAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.Milista);
        lv.setAdapter(adapater);

    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa_1,"La Punta",120000.0));
        lista.add(new Inmueble(R.drawable.casa2,"Merlo",110000.0));
        lista.add(new Inmueble(R.drawable.casa3,"Capital",150000.0));
    }

}