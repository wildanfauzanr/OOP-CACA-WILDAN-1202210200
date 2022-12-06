public class MainApp {
    public static void main(String[] args) throws Exception {

        TransportasiAir Ta = new TransportasiAir(50,20000);
        Ta.informasi();
        Ta.berlayar();
        Ta.berlabuh();

        System.out.println(" ");
        Sampan sampan = new Sampan(6,35000,3);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(1);

        System.out.println(" ");
        Kapal kapal = new Kapal(6,50000,"turbo");
        kapal.informasi();
        kapal.berlabuh();
        kapal.berlayar();
        kapal.berlayar(75);

    }
}
