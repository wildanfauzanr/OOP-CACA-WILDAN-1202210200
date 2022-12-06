public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi air tidak diketahui jenisnya memiliki jumlah kursi "+jumlahKursi+". Dengan biaya sebesar Rp."+biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi air dengan jenis tidak diketahui bisa berlayar di laut, danau, hingga sungai");
    }
    
    public void berlabuh(){
        System.out.println(" Transportasi air dengan jenis tidak dapat berlabuh di tepi pantai dan dermaga");
    }
}
