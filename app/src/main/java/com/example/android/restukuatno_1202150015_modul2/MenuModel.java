package com.example.android.restukuatno_1202150015_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuModel {
    private String nama;
    private int harga;
    private int gambar;
    private String keterangan;

    public MenuModel(String nama, int harga, int gambar, String keterangan) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
