package com.rplbo.madangskuy;

public class KategoriTempatMakan {
    static int next_id = 1;
    int id_kategori = 0;
    String nama_kategori;
    String deskripsi;

    public KategoriTempatMakan(String nama_kategori, String desc){
        this.setNama_kategori(nama_kategori);
        this.setDeskripsi(desc);
        this.id_kategori = next_id++;
    }


    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
