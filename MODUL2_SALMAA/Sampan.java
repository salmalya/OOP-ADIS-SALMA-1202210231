public class Sampan extends TransportasiAir {
    protected int layar;
    

public Sampan(int jumlahKursi,int biaya, int layar){
    super(jumlahKursi, biaya);
    this.layar = layar;
    }
@Override
public void informasi(){
    System.out.println("Transportasi air jenis sampan degan jumlah kursi "+jumlahKursi+" ditetapkan dengan biaya sebesar RP. "+biaya);
    }
public void berlayar(int layar){
    System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan "+ layar +" layar");
    }
public void berlabuh(){
    System.out.println("Transportasi air jenis sampan sedang berlabuh di pantai tanpa jangkar");
    }
public void berlabuh(int jangkar){
    System.out.println("Transportasi air jenis sampan sedang berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}
