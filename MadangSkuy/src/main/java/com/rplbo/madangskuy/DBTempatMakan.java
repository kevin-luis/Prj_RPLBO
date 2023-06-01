package com.rplbo.madangskuy;
import java.util.ArrayList;

public class DBTempatMakan {

        public static ArrayList<TempatMakan> DBTempatMakan = new ArrayList<>();
        public static ArrayList<TempatMakan> getDBTempatMakan(){
            return DBTempatMakan;
        }
        public static void addTempatMakan(TempatMakan tm){
            DBTempatMakan.add(tm);
        }

}
