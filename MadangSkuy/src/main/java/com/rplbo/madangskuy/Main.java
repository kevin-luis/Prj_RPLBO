package com.rplbo.madangskuy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        TempatMakan TM1 = new TempatMakan("Sate Padang Uda Aryo","Jl. Klitren","081345491346",4.5,"Sate","Sate Padang Khas Padanh yang dibuat dengan sepenuh hati");
        TempatMakan TM2 = new TempatMakan("Sate Madura Cak Kevin","Jl. Sudirman","082264584925",4.7,"Sate","Rasa yang diturunkan dari hati, jatuh ke dalam setiap penikmatnya");
        TempatMakan TM3 = new TempatMakan("Bakso Mas Bob","Jl. Monjali","083145689755",4.6,"Bakso","Bakso tiga turunan yang rasanya tiada tiganya.");
        TempatMakan TM4 = new TempatMakan("Bakso Pikul Mas Viko","Jl. Bendilan","087834348577",4.7,"Bakso","Bakso bercita rasa rumahan.");
        TempatMakan TM5 = new TempatMakan("Bakso Krikil Pak Gembul","Jl. Solo","081277613427",4.5,"Bakso","Bakso krikil namun dagingnya terasa.");
        TempatMakan TM6 = new TempatMakan("Bebek Madura Luis","Jl. Kliteren","081367739544",4.2,"Bebek","Bakso khas Madura dengan bumbu hitam yang lezat.");
        TempatMakan TM7 = new TempatMakan("Taichan Mas Wibi","Jl. Kliteren","089560783364",4.4,"Sate","Sate Taichan dengan rasa berbeda di setiap gigitan dagingnya.");
        TempatMakan TM8 = new TempatMakan("Soto Pak Ehud","Jl. Kliteren","081276758079",4.3,"Soto","Soto rumahan dengan bumbu yang akan kaya rempah.");
        TempatMakan TM9 = new TempatMakan("Seblak Om Kevin","Jl. Kliteren","089699613432",4.3,"Seblak","Seblak dengan kuah merah pedas membara, dijamin nagih.");
        TempatMakan TM10 = new TempatMakan("Es Dawet Mbak Yu","Jl. Sagan","081277758122",4.6,"Es Dawet","Es Dawet manis dan nyegerin.");
        TempatMakan TM11 = new TempatMakan("Sop Ayam Kampung Asli","Jl. Kota Baru","081275766464",4.4,"Sop","Sop Ayam Kampung dengan kaldu tanpa penyedap.");
        TempatMakan TM12 = new TempatMakan("Pecel Lele Lamongan Pak Deo","Jl. Sudirman","081376776363",4.7,"Pecel Lele","Pecel lele dengan sambelnya yang dijamin nagih.");
        TempatMakan TM13 = new TempatMakan("Sop Kaki Kambing Sudirman","Jl. Sudirman","081278797712",4.5,"Sop","Sop Kaki Kambing dengan kuahnya yang segar dan diolah dengan baik.");
        TempatMakan TM14 = new TempatMakan("Soto Kudus Kota Baru","Jl. Kota Baru","0895601258122",4.5,"Soto","Soto Khas Kudus dijamin maknyuss.");
        TempatMakan TM15 = new TempatMakan("Ayam Bakar Madu Pak Dio","Jl. Solo","089886498177",4.7,"Ayam","Ayam yang dibakar dengan bumbu madu rahasia 3 turunan.");
        TempatMakan TM16 = new TempatMakan("Bebek Bakar Ijo","Jl. Malioboro","087853666799",4.8,"Bebek","Bebek yang dimasak 7 jam dan dibakar dengan sambal ijonya yang nendang.");
        TempatMakan TM17 = new TempatMakan("Ngedawet Yuk","Jl. dr. Wahidin Sudirohusodo","087752448382",4.4,"Es Dawet","Es Dawet dengan topping kekinian.");
        TempatMakan TM18 = new TempatMakan("Bakso Raja","Jl. Perumnas","0896602263342",4.9,"Bakso","Bakso dengan daging pilihan.");
        TempatMakan TM19 = new TempatMakan("Es Kopi Pinggir Jalan","Jl. Klitren","08127765124",4.6,"Kopi","Tempatnya ngopi santai dipinggir jalan.");
        TempatMakan TM20 = new TempatMakan("Seblak Simpang Tiga ","Jl. Klitren","081375761212",4.4,"Seblak","Seblak dengan kuah pedas dan nikmat.");
        TempatMakan TM21 = new TempatMakan("Soto Lamongan Bu Cici","Jl. Sagan","087888953321",4.4,"Soto","Soto khas Lamongan dengan bumbu rahasia Ibu Cici.");
        TempatMakan TM22 = new TempatMakan("Lotek Mbah","Jl. Klitren","081264657781",4.9,"Lotek","Lotek dengan sayur fresh dan kuah kacangnya yang nikmat.");
        TempatMakan TM23 = new TempatMakan("Ayam Kremes Qiqi","Jl. Seturan","081375628821",4.7,"Ayam","Ayam goreng dengan kremesannya yang gurih dan sambel pedes nikmat.");
        TempatMakan TM24 = new TempatMakan("Nasi Goreng Brebes","Jl. Banguntapan","081277456898",4.6,"Nasi Goreng","Nasi Goreng Brebes nikmat dan nagihin.");
        TempatMakan TM25 = new TempatMakan("Lotek Bu Nur","Jl. Solo","089883263342",4.6,"Lotek","Lotek dengan kuah kacang gurih nikmat dan sayuran fresh.");
        TempatMakan TM26 = new TempatMakan("Pecel Lele Pak Heru","Jl. Babarsari","0897996337231",4.7,"Pecel Lele","Pecal lele dengan kremesan nikmat dan gurih.");
        TempatMakan TM27 = new TempatMakan("Ngopi Aja","Jl. Sudirman","087886434535",4.6,"Kopi","Ngopi dengan banyak biji kopi pilihan.");
        TempatMakan TM28 = new TempatMakan("Nasi Goreng Pak Oyong","Jl. Gejayan","081276744447",4.8,"Nasi Goreng","Nasi Goreng dengan porsi tidak pelit dan topping lengkap.");
        TempatMakan TM29 = new TempatMakan("Nasi Goreng Mas Bro","Jl. Selokan Mataram","081354668744",4.7,"Nasi Goreng","Nasi Goreng murah tapi rasanya dijamin tidak murahan.");
        TempatMakan TM30 = new TempatMakan("Bebek Penyet Setan","Jl. Babarsari","087886956643",4.6,"Bebek","Bebek goreng yang dipenyet dengan sambel setan yang pedasnya nendang.");

        DBTempatMakan.getDBTempatMakan().add(TM1);
        DBTempatMakan.getDBTempatMakan().add(TM2);
        DBTempatMakan.getDBTempatMakan().add(TM3);
        DBTempatMakan.getDBTempatMakan().add(TM4);
        DBTempatMakan.getDBTempatMakan().add(TM5);
        DBTempatMakan.getDBTempatMakan().add(TM6);
        DBTempatMakan.getDBTempatMakan().add(TM7);
        DBTempatMakan.getDBTempatMakan().add(TM8);
        DBTempatMakan.getDBTempatMakan().add(TM9);
        DBTempatMakan.getDBTempatMakan().add(TM10);
        DBTempatMakan.getDBTempatMakan().add(TM11);
        DBTempatMakan.getDBTempatMakan().add(TM12);
        DBTempatMakan.getDBTempatMakan().add(TM13);
        DBTempatMakan.getDBTempatMakan().add(TM14);
        DBTempatMakan.getDBTempatMakan().add(TM15);
        DBTempatMakan.getDBTempatMakan().add(TM16);
        DBTempatMakan.getDBTempatMakan().add(TM17);
        DBTempatMakan.getDBTempatMakan().add(TM18);
        DBTempatMakan.getDBTempatMakan().add(TM19);
        DBTempatMakan.getDBTempatMakan().add(TM20);
        DBTempatMakan.getDBTempatMakan().add(TM21);
        DBTempatMakan.getDBTempatMakan().add(TM22);
        DBTempatMakan.getDBTempatMakan().add(TM23);
        DBTempatMakan.getDBTempatMakan().add(TM24);
        DBTempatMakan.getDBTempatMakan().add(TM25);
        DBTempatMakan.getDBTempatMakan().add(TM26);
        DBTempatMakan.getDBTempatMakan().add(TM27);
        DBTempatMakan.getDBTempatMakan().add(TM28);
        DBTempatMakan.getDBTempatMakan().add(TM29);
        DBTempatMakan.getDBTempatMakan().add(TM30);

        KategoriTempatMakan KTM1 = new KategoriTempatMakan("Sate", "Sate enak sekali");
        KategoriTempatMakan KTM2 = new KategoriTempatMakan("Bakso", "Bakso Mantap Sekali");

        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM1);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM2);



        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 295, 300);
        primaryStage.setTitle("Admin MS");
        primaryStage.setScene(scene);
        primaryStage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("user-home.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
//        primaryStage.setTitle("User MS");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    }
}
