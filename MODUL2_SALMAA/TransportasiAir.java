public class TransportasiAir {
    // var protected
    protected int jumlahKursi;
    protected int biaya;

    // constructor
public TransportasiAir(int jumlahKursi,int biaya){
    this.jumlahKursi = jumlahKursi;
    this.biaya = biaya;
    }

    // methodnya
public void informasi(){
    System.out.println("Transportasi air jenis tidak diketahui degan jumlah kursi "+jumlahKursi+" ditetapkan dengan biaya sebesar RP. "+biaya);
    }
public void berlayar(){
    System.out.println("Transportasi air jenis tidak diketahui sedang berlayar");
    }
public void berlabuh(){
    System.out.println("Transportasi air jenis tidak diketahui sedang berlabuh di pantai");
    }
}