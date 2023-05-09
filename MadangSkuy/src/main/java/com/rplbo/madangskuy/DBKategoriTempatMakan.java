package com.rplbo.madangskuy;
import java.util.ArrayList;

public class DBKategoriTempatMakan {
    public static ArrayList<KategoriTempatMakan> DBKategoriTempatMakan = new ArrayList<KategoriTempatMakan>();
    public static ArrayList<KategoriTempatMakan> getDBKategoriTempatMakan(){
        return DBKategoriTempatMakan;
    }
    public static void addKategoriTempatMakan(KategoriTempatMakan ktm){
        DBKategoriTempatMakan.add(ktm);
    }
}
