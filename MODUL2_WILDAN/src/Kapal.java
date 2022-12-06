public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.println("Kapal merupakan transportasi air dengan jumlah kursi " +jumlahKursi+". Dengan biaya sebesar Rp."+biaya );
    }

    @Override
    public void berlayar(){
        System.out.println("Kapal spreed boat biasa menggunakan mesin "+mesin);
    }
    
    @Override
    public void berlabuh(){
        System.out.println("Kapal biasa berlabuh di dermaga dan pelabuhan");
    }
    

    public void berlayar(int kecepatan){
        System.out.println("Kapal dapat berlayar dengan kecepatan "+kecepatan+" Km/jam");
    }
    
}
