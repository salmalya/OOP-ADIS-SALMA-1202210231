public class MainApp {
    public static void main(String[] args) throws Exception {
        // objek name> perangkat ngambil dari> class Perangkat
        TransportasiAir transportasiAir = new TransportasiAir(50,20000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();

        // objek name> handphone ngambil dari> class Handphone
        Sampan sampan = new Sampan(20, 50000, 2);
        sampan.informasi();
        sampan.berlayar(2);
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal kapal = new Kapal(50, 10000, "Diesel");
        kapal.informasi();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
}
