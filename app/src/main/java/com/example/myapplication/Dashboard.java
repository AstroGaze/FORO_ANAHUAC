package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        init();
    }
    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Ingenieria Civil", "Mira las ultimas novedades!", "Activo"));
        elements.add(new ListElement("#607d8b", "Ingenieria Industrial", "Mira las ultimas novedades!", "Activo"));
        elements.add(new ListElement("#775447", "Comunicacion", "Mira las ultimas novedades!", "Activo"));
        elements.add(new ListElement("#03a9f4", "Negocios Internacionales", "Mira las ultimas novedades!", "Activo"));
        elements.add(new ListElement("#f44336", "Turismo", "Mira las ultimas novedades!", "Activo"));
        elements.add(new ListElement("#009688", "Odontologia", "Mira las ultimas novedades!", "Activo"));

        ListAdapter listAdapter= new ListAdapter(elements, this);
        RecyclerView recyclerView= findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}