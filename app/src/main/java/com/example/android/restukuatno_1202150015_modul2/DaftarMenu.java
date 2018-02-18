package com.example.android.restukuatno_1202150015_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);
//        recyclerView.addOnItemTouchListener(new RecycleView.Item);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();
        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Nasi Liwet", 20000, R.drawable.pringsweu_nasiliwet, "Nasi Liwet"));
        data.add(new MenuModel("Ayam Bakar", 25000, R.drawable.pringsewu_ayambakar, "Ayam Bakar + Nasi Pilih Sendiri"));
        data.add(new MenuModel("Gurame Bakar", 26000, R.drawable.pringsewu_gurame, "Gurame Bakar"));
        data.add(new MenuModel("Es Campur Siwalan", 15000, R.drawable.pringsewu_escampursiwalan, "Es Campur + Toping "));

        return data;
    }
}

