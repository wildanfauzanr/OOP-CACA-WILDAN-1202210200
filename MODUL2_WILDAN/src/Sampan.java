public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Sampan merupakan transportasi air yang memiliki "+jumlahKursi+". Dengan biaya sebesar Rp."+biaya);
    }

    @Override
    public void berlayar(){
        System.out.println("Sampan berlayar dapat berlayar dengan "+layar+" layar");
    }
    
    @Override
    public void berlabuh(){
        System.out.println("Sampan dapat berlabuh di tepi pantai");
    }
    
    public void berlabuh(int jangkar){
        System.out.println("sampan dapat berlabuh di tengah laut menggunakan "+jangkar+" jangkar");
    }
}
