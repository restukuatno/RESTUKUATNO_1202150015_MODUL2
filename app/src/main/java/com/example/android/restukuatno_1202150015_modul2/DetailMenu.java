package com.example.android.restukuatno_1202150015_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenu extends AppCompatActivity {

    private ArrayList<MenuModel> menus;
    private String idMenu;
    private TextView nama, harga, keterangan;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama = (TextView)findViewById(R.id.NamaMenu);
        harga = (TextView)findViewById(R.id.HargaMenu);
        keterangan = (TextView)findViewById(R.id.Keterangan);
        gambar = (ImageView) findViewById(R.id.GambarMenu);
//
        menus = DaftarMenu.menuList;
        Intent q = getIntent();
        idMenu = q.getStringExtra("MenuID");
        Log.d("DETAILED MENU","ID:"+idMenu);
        MenuModel menu = menus.get(Integer.parseInt(idMenu));
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +",- / Porsi");
        keterangan.setText(menu.getKeterangan());
        gambar.setImageResource(menu.getGambar());
    }
}
