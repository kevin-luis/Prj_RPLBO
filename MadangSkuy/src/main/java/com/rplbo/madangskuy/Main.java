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
        TempatMakan TM1 = new TempatMakan("Sate Kambing Pak Slamet", "Jl. Sudirman", "081234567890", 4.0, "Sate", "Sate kambing lezat dengan bumbu khas Pak Slamet.");
        TempatMakan TM2 = new TempatMakan("Sate Ayam Bu Yati", "Jl. Diponegoro", "081234567891", 3.5, "Sate", "Sate ayam yang diolah dengan resep tradisional ala Bu Yati.");
        TempatMakan TM3 = new TempatMakan("Sate Madura Mas Paijo", "Jl. Pemuda", "081234567892", 4.3, "Sate", "Sate Madura dengan cita rasa autentik dari Mas Paijo.");
        TempatMakan TM4 = new TempatMakan("Sate Maranggi Ibu Eni", "Jl. Merdeka", "081234567893", 4.2, "Sate", "Sate maranggi dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM5 = new TempatMakan("Sate Buntel Pak Tarno", "Jl. Gajah Mada", "081234567894", 4.5, "Sate", "Sate buntel yang kenyal dan enak dari Pak Tarno.");
        TempatMakan TM6 = new TempatMakan("Sate Sapi Mr. Hendra", "Jl. Panglima Sudirman", "081234567895", 4.1, "Sate", "Sate sapi dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM7 = new TempatMakan("Sate Lilit Bali Ibu Nyoman", "Jl. Imam Bonjol", "081234567896", 3.8, "Sate", "Sate lilit Bali yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM8 = new TempatMakan("Sate Ponorogo Mas Slamet", "Jl. Ahmad Yani", "081234567897", 4.4, "Sate", "Sate Ponorogo dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM9 = new TempatMakan("Sate Taichan Mbak Siti", "Jl. Raya Magelang", "081234567898", 3.7, "Sate", "Sate taichan pedas dan gurih dari Mbak Siti.");
        TempatMakan TM10 = new TempatMakan("Sate Cumi Bu Endang", "Jl. Cikini", "081234567899", 4.3, "Sate", "Sate cumi yang lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM11 = new TempatMakan("Bakso Malang Mas Slamet", "Jl. godean", "081234567800", 4.0, "Bakso", "Bakso Malang dengan cita rasa autentik dari Mas Slamet.");
        TempatMakan TM12 = new TempatMakan("Bakso Solo Bu Yati", "Jl. bantul", "081234567801", 3.5, "Bakso", "Bakso Solo yang diolah dengan resep tradisional ala Bu Yati.");
        TempatMakan TM13 = new TempatMakan("Bakso Jumbo Mas Paijo", "Jl. tua", "081234567802", 4.3, "Bakso", "Bakso jumbo dengan cita rasa lezat dari Mas Paijo.");
        TempatMakan TM14 = new TempatMakan("Bakso Sapi Ibu Eni", "Jl. Merdeka 2", "081234567803", 4.2, "Bakso", "Bakso sapi dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM15 = new TempatMakan("Bakso Mantap Pak Tarno", "Jl. Gajah Mada 2", "081234567804", 4.5, "Bakso", "Bakso yang mantap dan kenyal dari Pak Tarno.");
        TempatMakan TM16 = new TempatMakan("Bakso Enak Mr. Hendra", "Jl. Panglima", "081234567805", 4.1, "Bakso", "Bakso dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM17 = new TempatMakan("Bakso Bali Ibu Nyoman", "Jl. Imam ", "081234567806", 3.8, "Bakso", "Bakso Bali yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM18 = new TempatMakan("Bakso Ponorogo Mas Slamet", "Jl. Ahmad", "081234567807", 4.4, "Bakso", "Bakso Ponorogo dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM19 = new TempatMakan("Bakso Spesial Mbak Siti", "Jl.Magelang", "081234567808", 3.7, "Bakso", "Bakso spesial dengan cita rasa pedas dan gurih dari Mbak Siti.");
        TempatMakan TM20 = new TempatMakan("Bakso Lezat Bu Endang", "Jl.kini", "081234567809", 4.3, "Bakso", "Bakso yang lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM21 = new TempatMakan("Bebek Goreng Bu Tini", "Jl. man", "081234567810", 4.0, "Bebek", "Bebek goreng dengan cita rasa lezat dari Bu Tini.");
        TempatMakan TM22 = new TempatMakan("Bebek Bakar Pak Slamet", "Jl. negoro", "081234567811", 3.5, "Bebek", "Bebek bakar dengan bumbu khas dari Pak Slamet.");
        TempatMakan TM23 = new TempatMakan("Bebek Penyet Mas Paijo", "Jl. muda", "081234567812", 4.3, "Bebek", "Bebek penyet dengan rasa yang menggugah selera dari Mas Paijo.");
        TempatMakan TM24 = new TempatMakan("Bebek Goreng Ibu Eni", "Jl. Merde", "081234567813", 4.2, "Bebek", "Bebek goreng dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM25 = new TempatMakan("Bebek Betutu Pak Tarno", "Jl. Gajah", "081234567814", 4.5, "Bebek", "Bebek betutu yang nikmat dan lezat dari Pak Tarno.");
        TempatMakan TM26 = new TempatMakan("Bebek Goreng Mr. Hendra", "Jl. Sudi", "081234567815", 4.1, "Bebek", "Bebek goreng dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM27 = new TempatMakan("Bebek Bali Ibu Nyoman", "Jl.Bonjol", "081234567816", 3.8, "Bebek", "Bebek dengan bumbu Bali yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM28 = new TempatMakan("Bebek Ponorogo Mas Slamet", "Jl. Ahmad", "081234567817", 4.4, "Bebek", "Bebek Ponorogo dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM29 = new TempatMakan("Bebek Goreng Mbak Siti", "Jl. Ray", "081234567818", 3.7, "Bebek", "Bebek goreng dengan cita rasa pedas dan gurih dari Mbak Siti.");
        TempatMakan TM30 = new TempatMakan("Bebek Rica-Rica Bu Endang", "Jl. Ciko", "081234567819", 4.3, "Bebek", "Bebek rica-rica yang lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM31 = new TempatMakan("Soto Ayam Bu Tini", "Jl. komang", "081234567820", 4.0, "Soto", "Soto ayam dengan cita rasa lezat dari Bu Tini.");
        TempatMakan TM32 = new TempatMakan("Soto Betawi Pak Slamet", "Jl. mikey", "081234567821", 3.5, "Soto", "Soto Betawi dengan bumbu khas dari Pak Slamet.");
        TempatMakan TM33 = new TempatMakan("Soto Kudus Mas Paijo", "Jl. bener", "081234567822", 4.3, "Soto", "Soto Kudus dengan rasa yang menggugah selera dari Mas Paijo.");
        TempatMakan TM34 = new TempatMakan("Soto Sapi Ibu Eni", "Jl. salah", "081234567823", 4.2, "Soto", "Soto sapi dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM35 = new TempatMakan("Soto Lamongan Pak Tarno", "Jl. Gajah Mada", "081234567824", 4.5, "Soto", "Soto Lamongan yang nikmat dan lezat dari Pak Tarno.");
        TempatMakan TM36 = new TempatMakan("Soto Ayam Mr. Hendra", "Jl. Panglima rudi", "081234567825", 4.1, "Soto", "Soto ayam dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM37 = new TempatMakan("Soto Padang Ibu Nyoman", "Jl. Imam Bonjol 5", "081234567826", 3.8, "Soto", "Soto dengan bumbu Padang yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM38 = new TempatMakan("Soto Ponorogo Mas Slamet", "Jl. Ahmad Yani 5", "081234567827", 4.4, "Soto", "Soto Ponorogo dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM39 = new TempatMakan("Soto Ayam Mbak Siti", "Jl. Raya Magelang km 12", "081234567828", 3.7, "Soto", "Soto ayam dengan cita rasa pedas dan gurih dari Mbak Siti.");
        TempatMakan TM40 = new TempatMakan("Soto Madura Bu Endang", "Jl. Cikini nomor 3", "081234567829", 4.3, "Soto", "Soto Madura yang lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM41 = new TempatMakan("Seblak Bandung Bu Tini", "Jl. mase", "081234567830", 4.0, "Seblak", "Seblak Bandung dengan cita rasa lezat dari Bu Tini.");
        TempatMakan TM42 = new TempatMakan("Seblak Pedas Pak Slamet", "Jl. Diponegoro 4", "081234567831", 3.5, "Seblak", "Seblak pedas dengan bumbu khas dari Pak Slamet.");
        TempatMakan TM43 = new TempatMakan("Seblak Spesial Mas Paijo", "Jl. Pemuda sehat", "081234567832", 4.3, "Seblak", "Seblak spesial dengan rasa yang menggugah selera dari Mas Paijo.");
        TempatMakan TM44 = new TempatMakan("Seblak Ibu Eni", "Jl. Merdeka 45", "081234567833", 4.2, "Seblak", "Seblak dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM45 = new TempatMakan("Seblak Betawi Pak Tarno", "Jl. Gajah no 3", "081234567834", 4.5, "Seblak", "Seblak Betawi yang nikmat dan lezat dari Pak Tarno.");
        TempatMakan TM46 = new TempatMakan("Seblak Pedas Mr. Hendra", "Jl. Panglima tempur", "081234567835", 4.1, "Seblak", "Seblak pedas dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM47 = new TempatMakan("Seblak Bandung Ibu Nyoman", "Jl. Imam no 10", "081234567836", 3.8, "Seblak", "Seblak dengan bumbu Bandung yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM48 = new TempatMakan("Seblak Spesial Mas Slamet", "Jl. Ahmad Yanir", "081234567837", 4.4, "Seblak", "Seblak spesial dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM49 = new TempatMakan("Seblak Pedas Mbak Siti", "Jl. solo", "081234567838", 3.7, "Seblak", "Seblak pedas dengan cita rasa pedas dan gurih dari Mbak Siti.");
        TempatMakan TM50 = new TempatMakan("Seblak Bandung Bu Endang", "Jl. kudus", "081234567839", 4.3, "Seblak", "Seblak Bandung yang lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM51 = new TempatMakan("Es Dawet Bu Tini", "Jl. boruto", "081234567840", 4.0, "Es Dawet", "Es dawet dengan cita rasa lezat dari Bu Tini.");
        TempatMakan TM52 = new TempatMakan("Es Dawet Segar Pak Slamet", "Jl. ninja saga", "081234567841", 3.5, "Es Dawet", "Es dawet segar dengan bumbu khas dari Pak Slamet.");
        TempatMakan TM53 = new TempatMakan("Es Dawet Tradisional Mas Paijo", "Jl. gatot", "081234567842", 4.3, "Es Dawet", "Es dawet tradisional dengan rasa yang menggugah selera dari Mas Paijo.");
        TempatMakan TM54 = new TempatMakan("Es Dawet Khas Ibu Eni", "Jl. pepaya", "081234567843", 4.2, "Es Dawet", "Es dawet khas dengan bumbu khas yang menggugah selera dari Ibu Eni.");
        TempatMakan TM55 = new TempatMakan("Es Dawet Seger Pak Tarno", "Jl. Gajah muda", "081234567844", 4.5, "Es Dawet", "Es dawet yang segar dan lezat dari Pak Tarno.");
        TempatMakan TM56 = new TempatMakan("Es Dawet Segar Mr. Hendra", "Jl. Panglima dilan", "081234567845", 4.1, "Es Dawet", "Es dawet segar dengan cita rasa istimewa dari Mr. Hendra.");
        TempatMakan TM57 = new TempatMakan("Es Dawet Tradisional Ibu Nyoman", "Jl. milea", "081234567846", 3.8, "Es Dawet", "Es dawet tradisional dengan bumbu khas yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM58 = new TempatMakan("Es Dawet Spesial Mas Slamet", "Jl. anggara", "081234567847", 4.4, "Es Dawet", "Es dawet spesial dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM59 = new TempatMakan("Es Dawet Segar Mbak Siti", "Jl. cika", "081234567848", 3.7, "Es Dawet", "Es dawet segar dengan cita rasa manis dan lezat dari Mbak Siti.");
        TempatMakan TM60 = new TempatMakan("Es Dawet Khas Bu Endang", "Jl. jalan berdua", "081234567849", 4.3, "Es Dawet", "Es dawet khas yang lezat dan menggugah selera dari Bu Endang.");

        TempatMakan TM61 = new TempatMakan("Sop Ikan Sedap Bu Rina", "Jl. mbake", "081234567850", 4.0, "Sop", "Sop ikan dengan cita rasa lezat dari Bu Rina.");
        TempatMakan TM62 = new TempatMakan("Sop Ayam Segar Pak Slamet", "Jl. capek ah", "081234567851", 3.5, "Sop", "Sop ayam segar dengan bumbu khas dari Pak Slamet.");
        TempatMakan TM63 = new TempatMakan("Sop Kambing Enak Mas Budi", "Jl. Pemuda kuat", "081234567852", 4.2, "Sop", "Sop kambing enak dengan cita rasa yang menggugah selera dari Mas Budi.");
        TempatMakan TM64 = new TempatMakan("Sop Bening Seger Bu Yanti", "Jl. Merdeka 45", "081234567853", 4.1, "Sop", "Sop bening segar dengan bumbu khas yang menggugah selera dari Bu Yanti.");
        TempatMakan TM65 = new TempatMakan("Sop Sapi Spesial Bu Rini", "Jl. Gajah Mada nomor 5", "081234567854", 4.3, "Sop", "Sop sapi spesial dengan rasa yang istimewa dari Bu Rini.");
        TempatMakan TM66 = new TempatMakan("Sop Buntut Lezat Mas Slamet", "Jl. Panglima Sudirman no 5", "081234567855", 4.5, "Sop", "Sop buntut lezat dengan cita rasa yang menggugah selera dari Mas Slamet.");
        TempatMakan TM67 = new TempatMakan("Sop Iga Sedap Ibu Nyoman", "Jl. Imam Bonjol no 5", "081234567856", 3.8, "Sop", "Sop iga dengan bumbu khas yang menggugah selera dari Ibu Nyoman.");
        TempatMakan TM68 = new TempatMakan("Sop Ayam Spesial Mas Slamet", "Jl. Ahmad Yani no 5", "081234567857", 4.4, "Sop", "Sop ayam spesial dengan bumbu spesial dari Mas Slamet.");
        TempatMakan TM69 = new TempatMakan("Sop Bening Segar Mbak Siti", "Jl. godean", "081234567858", 3.7, "Sop", "Sop bening segar dengan cita rasa yang menggugah selera dari Mbak Siti.");
        TempatMakan TM70 = new TempatMakan("Sop Seafood Lezat Bu Endang", "Jl. ganjuran", "081234567859", 4.3, "Sop", "Sop seafood lezat dan menggoda selera dari Bu Endang.");

        TempatMakan TM71 = new TempatMakan("Pecel Lele Nikmat Mas Dodi", "Jl. kehidupan no 2", "081234567860", 4.2, "Pecel Lele", "Pecel lele nikmat dengan bumbu khas dari Mas Dodi.");
        TempatMakan TM72 = new TempatMakan("Warung Pecel Lele Ibu Siti", "Jl. kesesatan no 10", "081234567861", 3.9, "Pecel Lele", "Pecel lele lezat dengan cita rasa istimewa dari Ibu Siti.");
        TempatMakan TM73 = new TempatMakan("Pecel Lele Enak Mas Slamet", "Jl. Pemuda berani", "081234567862", 4.4, "Pecel Lele", "Pecel lele enak dengan rasa yang menggugah selera dari Mas Slamet.");
        TempatMakan TM74 = new TempatMakan("Pecel Lele Mantap Bu Yanti", "Jl. Merdeka no 12", "081234567863", 4.3, "Pecel Lele", "Pecel lele mantap dengan bumbu khas dari Bu Yanti.");
        TempatMakan TM75 = new TempatMakan("Pecel Lele Segar Pak Budi", "Jl. Mada", "081234567864", 4.5, "Pecel Lele", "Pecel lele segar dengan cita rasa yang istimewa dari Pak Budi.");
        TempatMakan TM76 = new TempatMakan("Pecel Lele Lezat Ibu Rini", "Jl. Panglima ehemm", "081234567865", 3.8, "Pecel Lele", "Pecel lele lezat dengan bumbu spesial dari Ibu Rini.");
        TempatMakan TM77 = new TempatMakan("Warung Pecel Lele Bu Maya", "Jl. setian", "081234567866", 4.1, "Pecel Lele", "Pecel lele dengan rasa yang menggugah selera dari Bu Maya.");
        TempatMakan TM78 = new TempatMakan("Pecel Lele Spesial Mas Agus", "Jl. kolowenang", "081234567867", 3.7, "Pecel Lele", "Pecel lele spesial dengan bumbu khas dari Mas Agus.");
        TempatMakan TM79 = new TempatMakan("Pecel Lele Segar Mbak Sari", "Jl. kudus no 2", "081234567868", 4.0, "Pecel Lele", "Pecel lele segar dengan cita rasa yang menggugah selera dari Mbak Sari.");
        TempatMakan TM80 = new TempatMakan("Pecel Lele Enak Bu Endang", "Jl. kasihan", "081234567869", 4.4, "Pecel Lele", "Pecel lele enak dan menggoda selera");

        TempatMakan TM81 = new TempatMakan("Ayam Goreng Sambel Merah Bu Rina", "Jl. mama", "081234567870", 4.3, "Ayam", "Ayam goreng dengan sambel merah yang pedas dan nikmat dari Bu Rina.");
        TempatMakan TM82 = new TempatMakan("Warung Ayam Bakar Pak Slamet", "Jl. papa", "081234567871", 4.1, "Ayam", "Ayam bakar dengan cita rasa khas dari Pak Slamet.");
        TempatMakan TM83 = new TempatMakan("Ayam Penyet Pedas Mas Budi", "Jl. kaliurang", "081234567872", 3.9, "Ayam", "Ayam penyet pedas dengan bumbu spesial dari Mas Budi.");
        TempatMakan TM84 = new TempatMakan("Ayam Goreng Kremes Bu Yanti", "Jl. meguwo", "081234567873", 4.4, "Ayam", "Ayam goreng kremes dengan rasa yang menggugah selera dari Bu Yanti.");
        TempatMakan TM85 = new TempatMakan("Ayam Bakar Spesial Pak Budi", "Jl. kulon progo", "081234567874", 4.5, "Ayam", "Ayam bakar spesial dengan bumbu khas dari Pak Budi.");
        TempatMakan TM86 = new TempatMakan("Ayam Geprek Pedas Ibu Rini", "Jl. madura", "081234567875", 3.7, "Ayam", "Ayam geprek pedas dengan rasa yang menggugah selera dari Ibu Rini.");
        TempatMakan TM87 = new TempatMakan("Warung Ayam Goreng Bu Maya", "Jl. Imam kuat", "081234567876", 4.0, "Ayam", "Ayam goreng dengan rasa yang menggugah selera dari Bu Maya.");
        TempatMakan TM88 = new TempatMakan("Ayam Bakar Spesial Mas Agus", "Jl. Ahmad Yani no 10", "081234567877", 3.8, "Ayam", "Ayam bakar spesial dengan bumbu khas dari Mas Agus.");
        TempatMakan TM89 = new TempatMakan("Ayam Geprek Sambel Matah Mbak Sari", "Jl. solo no 10", "081234567878", 4.2, "Ayam", "Ayam geprek dengan sambel matah yang segar dari Mbak Sari.");
        TempatMakan TM90 = new TempatMakan("Ayam Goreng Kriuk Bu Endang", "Jl. hahahah", "081234567879", 4.3, "Ayam", "Ayam goreng kriuk dengan tekstur renyah dan cita rasa yang lezat dari Bu Endang.");

        TempatMakan TM91 = new TempatMakan("Warung Kopi Sedap Pak Slamet", "Jl. mangga", "081234567880", 4.3, "Kopi", "Nikmati secangkir kopi sedap dengan cita rasa istimewa dari Pak Slamet.");
        TempatMakan TM92 = new TempatMakan("Kafe Kopi Enak Mas Budi", "Jl. leci", "081234567881", 4.1, "Kopi", "Rasakan kelezatan kopi yang enak dengan aroma yang menggoda dari Mas Budi.");
        TempatMakan TM93 = new TempatMakan("Kedai Kopi Mantap Bu Yanti", "Jl. nanas", "081234567882", 4.4, "Kopi", "Nikmati secangkir kopi yang mantap dengan rasa yang memikat dari Bu Yanti.");
        TempatMakan TM94 = new TempatMakan("Kopi Segar Pak Budi", "Jl. parangtritis", "081234567883", 4.5, "Kopi", "Rasakan ke segaran kopi dengan cita rasa yang istimewa dari Pak Budi.");
        TempatMakan TM95 = new TempatMakan("Kedai Kopi Lezat Ibu Rini", "Jl. terus capek", "081234567884", 3.7, "Kopi", "Nikmati secangkir kopi lezat dengan aroma yang menggugah selera dari Ibu Rini.");
        TempatMakan TM96 = new TempatMakan("Warung Kopi Nikmat Bu Maya", "Jl. terang", "081234567885", 4.0, "Kopi", "Nikmati secangkir kopi nikmat dengan cita rasa yang menggugah selera dari Bu Maya.");
        TempatMakan TM97 = new TempatMakan("Kafe Kopi Spesial Mas Agus", "Jl. hitam no 2", "081234567886", 3.8, "Kopi", "Rasakan keistimewaan kopi spesial dengan cita rasa yang istimewa dari Mas Agus.");
        TempatMakan TM98 = new TempatMakan("Kedai Kopi Segar Mbak Sari", "Jl. coklat no 1", "081234567887", 4.2, "Kopi", "Nikmati secangkir kopi segar dengan aroma yang memikat dari Mbak Sari.");
        TempatMakan TM99 = new TempatMakan("Warung Kopi Enak Bu Endang", "Jl. bikini no 4", "081234567888", 4.3, "Kopi", "Nikmati secangkir kopi enak dan lezat dari Bu Endang.");
        TempatMakan TM100 = new TempatMakan("Kedai Kopi Asik Pak Rudi", "Jl. Slamet akhirat", "081234567889", 4.5, "Kopi", "Rasakan sensasi asyik dengan secangkir kopi yang khas dari Pak Rudi.");

        TempatMakan TM101 = new TempatMakan("Warung Lotek Maknyus Bu Rina", "Jl. ganteng", "081234567890", 4.3, "Lotek", "Nikmati lotek maknyus dengan bumbu kacang yang lezat dari Bu Rina.");
        TempatMakan TM102 = new TempatMakan("Lotek Segar Mantap Pak Slamet", "Jl. cantii", "081234567891", 4.1, "Lotek", "Rasakan kelezatan lotek segar dan mantap dengan cita rasa istimewa dari Pak Slamet.");
        TempatMakan TM103 = new TempatMakan("Kedai Lotek Lezat Mas Budi", "Jl. bahenol", "081234567892", 3.9, "Lotek", "Nikmati lotek lezat dengan bumbu kacang yang khas dari Mas Budi.");
        TempatMakan TM104 = new TempatMakan("Lotek Segar Bu Yanti", "Jl. kuaci", "081234567893", 4.4, "Lotek", "Nikmati lotek segar dengan bumbu kacang yang memikat selera dari Bu Yanti.");
        TempatMakan TM105 = new TempatMakan("Warung Lotek Pedas Pak Budi", "Jl. malioboro", "081234567894", 4.5, "Lotek", "Rasakan sensasi lotek pedas dengan bumbu kacang yang khas dari Pak Budi.");
        TempatMakan TM106 = new TempatMakan("Lotek Enak Ibu Rini", "Jl. Pandangan pertama", "081234567895", 3.7, "Lotek", "Nikmati lotek enak dengan bumbu kacang yang lezat dari Ibu Rini.");
        TempatMakan TM107 = new TempatMakan("Warung Lotek Segar Mas Eko", "Jl. Ahmad dani", "081234567896", 4.2, "Lotek", "Nikmati lotek segar dengan bumbu kacang yang menggugah selera dari Mas Eko.");
        TempatMakan TM108 = new TempatMakan("Kedai Lotek Sedap Mbak Sari", "Jl. doni no 2", "081234567897", 4.0, "Lotek", "Nikmati lotek sedap dengan bumbu kacang yang lezat dari Mbak Sari.");
        TempatMakan TM109 = new TempatMakan("Warung Lotek Nikmat Bu Endang", "Jl. bubu no 2", "081234567898", 4.3, "Lotek", "Nikmati lotek nikmat dengan bumbu kacang yang menggugah selera dari Bu Endang.");
        TempatMakan TM110 = new TempatMakan("Kedai Lotek Asik Pak Rudi", "Jl. valdi 2", "081234567899", 4.5, "Lotek", "Rasakan sensasi asyik dengan lotek");

        TempatMakan TM111 = new TempatMakan("Sate Padang Uda Aryo","Jl. Klitren","081345491346",4.5,"Sate","Sate Padang Khas Padang yang dibuat dengan sepenuh hati");
        TempatMakan TM112 = new TempatMakan("Sate Madura Cak Kevin","Jl. Sudirman","082264584925",4.7,"Sate","Rasa yang diturunkan dari hati, jatuh ke dalam setiap penikmatnya");
        TempatMakan TM113 = new TempatMakan("Bakso Mas Bob","Jl. Monjali","083145689755",4.6,"Bakso","Bakso tiga turunan yang rasanya tiada tiganya.");
        TempatMakan TM114 = new TempatMakan("Bakso Pikul Mas Viko","Jl. Bendilan","087834348577",4.7,"Bakso","Bakso bercita rasa rumahan.");
        TempatMakan TM115 = new TempatMakan("Bakso Krikil Pak Gembul","Jl. Solo","081277613427",4.5,"Bakso","Bakso krikil namun dagingnya terasa.");
        TempatMakan TM116 = new TempatMakan("Bebek Madura Luis","Jl. Kliteren","081367739544",4.2,"Bebek","Bakso khas Madura dengan bumbu hitam yang lezat.");
        TempatMakan TM117 = new TempatMakan("Taichan Mas Wibi","Jl. Kliteren","089560783364",4.4,"Sate","Sate Taichan dengan rasa berbeda di setiap gigitan dagingnya.");
        TempatMakan TM118 = new TempatMakan("Soto Pak Ehud","Jl. Kliteren","081276758079",4.3,"Soto","Soto rumahan dengan bumbu yang akan kaya rempah.");
        TempatMakan TM119 = new TempatMakan("Seblak Om Kevin","Jl. Kliteren","089699613432",4.3,"Seblak","Seblak dengan kuah merah pedas membara, dijamin nagih.");
        TempatMakan TM120 = new TempatMakan("Es Dawet Mbak Yu","Jl. Sagan","081277758122",4.6,"Es Dawet","Es Dawet manis dan nyegerin.");
        TempatMakan TM121 = new TempatMakan("Sop Ayam Kampung Asli","Jl. Kota Baru","081275766464",4.4,"Sop","Sop Ayam Kampung dengan kaldu tanpa penyedap.");
        TempatMakan TM122 = new TempatMakan("Pecel Lele Lamongan Pak Deo","Jl. Sudirman","081376776363",4.7,"Pecel Lele","Pecel lele dengan sambelnya yang dijamin nagih.");
        TempatMakan TM123 = new TempatMakan("Sop Kaki Kambing Sudirman","Jl. Sudirman","081278797712",4.5,"Sop","Sop Kaki Kambing dengan kuahnya yang segar dan diolah dengan baik.");
        TempatMakan TM124 = new TempatMakan("Soto Kudus Kota Baru","Jl. Kota Baru","0895601258122",4.5,"Soto","Soto Khas Kudus dijamin maknyuss.");
        TempatMakan TM125 = new TempatMakan("Ayam Bakar Madu Pak Dio","Jl. Solo","089886498177",4.7,"Ayam","Ayam yang dibakar dengan bumbu madu rahasia 3 turunan.");
        TempatMakan TM126 = new TempatMakan("Bebek Bakar Ijo","Jl. Malioboro","087853666799",4.8,"Bebek","Bebek yang dimasak 7 jam dan dibakar dengan sambal ijonya yang nendang.");
        TempatMakan TM127 = new TempatMakan("Ngedawet Yuk","Jl. dr. Wahidin Sudirohusodo","087752448382",4.4,"Es Dawet","Es Dawet dengan topping kekinian.");
        TempatMakan TM128 = new TempatMakan("Bakso Raja","Jl. Perumnas","0896602263342",4.9,"Bakso","Bakso dengan daging pilihan.");
        TempatMakan TM129 = new TempatMakan("Es Kopi Pinggir Jalan","Jl. Klitren","08127765124",4.6,"Kopi","Tempatnya ngopi santai dipinggir jalan.");
        TempatMakan TM130 = new TempatMakan("Seblak Simpang Tiga ","Jl. Klitren","081375761212",4.4,"Seblak","Seblak dengan kuah pedas dan nikmat.");
        TempatMakan TM131 = new TempatMakan("Soto Lamongan Bu Cici","Jl. Sagan","087888953321",4.4,"Soto","Soto khas Lamongan dengan bumbu rahasia Ibu Cici.");
        TempatMakan TM132 = new TempatMakan("Lotek Mbah","Jl. Klitren","081264657781",4.9,"Lotek","Lotek dengan sayur fresh dan kuah kacangnya yang nikmat.");
        TempatMakan TM133 = new TempatMakan("Ayam Kremes Qiqi","Jl. Seturan","081375628821",4.7,"Ayam","Ayam goreng dengan kremesannya yang gurih dan sambel pedes nikmat.");
        TempatMakan TM134 = new TempatMakan("Nasi Goreng Brebes","Jl. Banguntapan","081277456898",4.6,"Nasi Goreng","Nasi Goreng Brebes nikmat dan nagihin.");
        TempatMakan TM135 = new TempatMakan("Lotek Bu Nur","Jl. Solo","089883263342",4.6,"Lotek","Lotek dengan kuah kacang gurih nikmat dan sayuran fresh.");
        TempatMakan TM136 = new TempatMakan("Pecel Lele Pak Heru","Jl. Babarsari","0897996337231",4.7,"Pecel Lele","Pecal lele dengan kremesan nikmat dan gurih.");
        TempatMakan TM137 = new TempatMakan("Ngopi Aja","Jl. Sudirman","087886434535",4.6,"Kopi","Ngopi dengan banyak biji kopi pilihan.");
        TempatMakan TM138 = new TempatMakan("Nasi Goreng Pak Oyong","Jl. Gejayan","081276744447",4.8,"Nasi Goreng","Nasi Goreng dengan porsi tidak pelit dan topping lengkap.");
        TempatMakan TM139 = new TempatMakan("Nasi Goreng Mas Bro","Jl. Selokan Mataram","081354668744",4.7,"Nasi Goreng","Nasi Goreng murah tapi rasanya dijamin tidak murahan.");
        TempatMakan TM140 = new TempatMakan("Bebek Penyet Setan","Jl. Babarsari","087886956643",4.6,"Bebek","Bebek goreng yang dipenyet dengan sambel setan yang pedasnya nendang.");


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
        DBTempatMakan.getDBTempatMakan().add(TM31);
        DBTempatMakan.getDBTempatMakan().add(TM32);
        DBTempatMakan.getDBTempatMakan().add(TM33);
        DBTempatMakan.getDBTempatMakan().add(TM34);
        DBTempatMakan.getDBTempatMakan().add(TM35);
        DBTempatMakan.getDBTempatMakan().add(TM36);
        DBTempatMakan.getDBTempatMakan().add(TM37);
        DBTempatMakan.getDBTempatMakan().add(TM38);
        DBTempatMakan.getDBTempatMakan().add(TM39);
        DBTempatMakan.getDBTempatMakan().add(TM40);
        DBTempatMakan.getDBTempatMakan().add(TM41);
        DBTempatMakan.getDBTempatMakan().add(TM42);
        DBTempatMakan.getDBTempatMakan().add(TM43);
        DBTempatMakan.getDBTempatMakan().add(TM44);
        DBTempatMakan.getDBTempatMakan().add(TM45);
        DBTempatMakan.getDBTempatMakan().add(TM46);
        DBTempatMakan.getDBTempatMakan().add(TM47);
        DBTempatMakan.getDBTempatMakan().add(TM48);
        DBTempatMakan.getDBTempatMakan().add(TM49);
        DBTempatMakan.getDBTempatMakan().add(TM50);
        DBTempatMakan.getDBTempatMakan().add(TM51);
        DBTempatMakan.getDBTempatMakan().add(TM52);
        DBTempatMakan.getDBTempatMakan().add(TM53);
        DBTempatMakan.getDBTempatMakan().add(TM54);
        DBTempatMakan.getDBTempatMakan().add(TM55);
        DBTempatMakan.getDBTempatMakan().add(TM56);
        DBTempatMakan.getDBTempatMakan().add(TM57);
        DBTempatMakan.getDBTempatMakan().add(TM58);
        DBTempatMakan.getDBTempatMakan().add(TM59);
        DBTempatMakan.getDBTempatMakan().add(TM60);
        DBTempatMakan.getDBTempatMakan().add(TM61);
        DBTempatMakan.getDBTempatMakan().add(TM62);
        DBTempatMakan.getDBTempatMakan().add(TM63);
        DBTempatMakan.getDBTempatMakan().add(TM64);
        DBTempatMakan.getDBTempatMakan().add(TM65);
        DBTempatMakan.getDBTempatMakan().add(TM66);
        DBTempatMakan.getDBTempatMakan().add(TM67);
        DBTempatMakan.getDBTempatMakan().add(TM68);
        DBTempatMakan.getDBTempatMakan().add(TM69);
        DBTempatMakan.getDBTempatMakan().add(TM70);
        DBTempatMakan.getDBTempatMakan().add(TM71);
        DBTempatMakan.getDBTempatMakan().add(TM72);
        DBTempatMakan.getDBTempatMakan().add(TM73);
        DBTempatMakan.getDBTempatMakan().add(TM74);
        DBTempatMakan.getDBTempatMakan().add(TM75);
        DBTempatMakan.getDBTempatMakan().add(TM76);
        DBTempatMakan.getDBTempatMakan().add(TM77);
        DBTempatMakan.getDBTempatMakan().add(TM78);
        DBTempatMakan.getDBTempatMakan().add(TM79);
        DBTempatMakan.getDBTempatMakan().add(TM80);
        DBTempatMakan.getDBTempatMakan().add(TM81);
        DBTempatMakan.getDBTempatMakan().add(TM82);
        DBTempatMakan.getDBTempatMakan().add(TM83);
        DBTempatMakan.getDBTempatMakan().add(TM84);
        DBTempatMakan.getDBTempatMakan().add(TM85);
        DBTempatMakan.getDBTempatMakan().add(TM86);
        DBTempatMakan.getDBTempatMakan().add(TM87);
        DBTempatMakan.getDBTempatMakan().add(TM88);
        DBTempatMakan.getDBTempatMakan().add(TM89);
        DBTempatMakan.getDBTempatMakan().add(TM90);
        DBTempatMakan.getDBTempatMakan().add(TM91);
        DBTempatMakan.getDBTempatMakan().add(TM92);
        DBTempatMakan.getDBTempatMakan().add(TM93);
        DBTempatMakan.getDBTempatMakan().add(TM94);
        DBTempatMakan.getDBTempatMakan().add(TM95);
        DBTempatMakan.getDBTempatMakan().add(TM96);
        DBTempatMakan.getDBTempatMakan().add(TM97);
        DBTempatMakan.getDBTempatMakan().add(TM98);
        DBTempatMakan.getDBTempatMakan().add(TM99);
        DBTempatMakan.getDBTempatMakan().add(TM100);
        DBTempatMakan.getDBTempatMakan().add(TM101);
        DBTempatMakan.getDBTempatMakan().add(TM102);
        DBTempatMakan.getDBTempatMakan().add(TM103);
        DBTempatMakan.getDBTempatMakan().add(TM104);
        DBTempatMakan.getDBTempatMakan().add(TM105);
        DBTempatMakan.getDBTempatMakan().add(TM106);
        DBTempatMakan.getDBTempatMakan().add(TM107);
        DBTempatMakan.getDBTempatMakan().add(TM108);
        DBTempatMakan.getDBTempatMakan().add(TM109);
        DBTempatMakan.getDBTempatMakan().add(TM110);
        DBTempatMakan.getDBTempatMakan().add(TM111);
        DBTempatMakan.getDBTempatMakan().add(TM112);
        DBTempatMakan.getDBTempatMakan().add(TM113);
        DBTempatMakan.getDBTempatMakan().add(TM114);
        DBTempatMakan.getDBTempatMakan().add(TM115);
        DBTempatMakan.getDBTempatMakan().add(TM116);
        DBTempatMakan.getDBTempatMakan().add(TM117);
        DBTempatMakan.getDBTempatMakan().add(TM118);
        DBTempatMakan.getDBTempatMakan().add(TM119);
        DBTempatMakan.getDBTempatMakan().add(TM120);
        DBTempatMakan.getDBTempatMakan().add(TM121);
        DBTempatMakan.getDBTempatMakan().add(TM122);
        DBTempatMakan.getDBTempatMakan().add(TM123);
        DBTempatMakan.getDBTempatMakan().add(TM124);
        DBTempatMakan.getDBTempatMakan().add(TM125);
        DBTempatMakan.getDBTempatMakan().add(TM126);
        DBTempatMakan.getDBTempatMakan().add(TM127);
        DBTempatMakan.getDBTempatMakan().add(TM128);
        DBTempatMakan.getDBTempatMakan().add(TM129);
        DBTempatMakan.getDBTempatMakan().add(TM130);
        DBTempatMakan.getDBTempatMakan().add(TM131);
        DBTempatMakan.getDBTempatMakan().add(TM132);
        DBTempatMakan.getDBTempatMakan().add(TM133);
        DBTempatMakan.getDBTempatMakan().add(TM134);
        DBTempatMakan.getDBTempatMakan().add(TM135);
        DBTempatMakan.getDBTempatMakan().add(TM136);
        DBTempatMakan.getDBTempatMakan().add(TM137);
        DBTempatMakan.getDBTempatMakan().add(TM138);
        DBTempatMakan.getDBTempatMakan().add(TM139);
        DBTempatMakan.getDBTempatMakan().add(TM140);




        KategoriTempatMakan KTM1 = new KategoriTempatMakan("Sate", "Sate Enak sekali");
        KategoriTempatMakan KTM2 = new KategoriTempatMakan("Bakso", "Bakso Mantap Sekali");
        KategoriTempatMakan KTM3 = new KategoriTempatMakan("Bebek", "Bebek Lezat Sekali");
        KategoriTempatMakan KTM4 = new KategoriTempatMakan("Soto", "Soto Gurih Sekali");
        KategoriTempatMakan KTM5 = new KategoriTempatMakan("Seblak", "Seblak Nikmat Sekali");
        KategoriTempatMakan KTM6 = new KategoriTempatMakan("Es Dawet", "Es Dawet Seger Sekali");
        KategoriTempatMakan KTM7 = new KategoriTempatMakan("Sop", "Sop Maknyus Sekali");
        KategoriTempatMakan KTM8 = new KategoriTempatMakan("Pecel Lele", "Pecel Lele Juara Sekali");
        KategoriTempatMakan KTM9 = new KategoriTempatMakan("Ayam", "Ayam Lezat Sekali");
        KategoriTempatMakan KTM10 = new KategoriTempatMakan("Kopi", "Kopi Mantul Sekali");
        KategoriTempatMakan KTM11 = new KategoriTempatMakan("Lotek", "Lotek Mantap Sekali");
//        KategoriTempatMakan KTM12 = new KategoriTempatMakan("Nasi Goreng", "Nasi Goreng Nagihin Sekali");
//      KategoriTempatMakan KTM13 = new KategoriTempatMakan("es Buah", "es buah yang segar");
//      KategoriTempatMakan KTM14 = new KategoriTempatMakan("Gudeg", "gudeg bikin candu");



        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM1);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM2);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM3);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM4);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM5);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM6);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM7);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM8);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM9);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM10);
        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM11);
//        DBKategoriTempatMakan.getDBKategoriTempatMakan().add(KTM12);



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
