package com.rplbo.madangskuy;

public class TempatMakan {
    static  int next_id = 1;
    int id_tempat_makan = 0;
    String nama_tempat_makan;
    String alamat;
    String noHP;
    double rating;
    String kategori_tempat_makan;
    String deskripsi;

    public TempatMakan(String nama_tempat_makan,String alamat, String noHP, double rating,String kategori_tempat_makan, String deskripsi){
        this.setNama_tempat_makan(nama_tempat_makan);
        this.setAlamat(alamat);
        this.setNoHP(noHP);
        this.setRating(rating);
        this.setKategori_tempat_makan(kategori_tempat_makan);
        this.setDeskripsi(deskripsi);
        this.id_tempat_makan = next_id++;
    }


    public String getNama_tempat_makan() {
        return nama_tempat_makan;
    }

    public void setNama_tempat_makan(String nama_tempat_makan) {
        this.nama_tempat_makan = nama_tempat_makan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getKategori_tempat_makan() {
        return kategori_tempat_makan;
    }

    public void setKategori_tempat_makan(String kategori_tempat_makan) {
        this.kategori_tempat_makan = kategori_tempat_makan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
