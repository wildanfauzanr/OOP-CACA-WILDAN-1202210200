public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("===== Class Perangkat =====");
        Perangkat perangkat = new Perangkat ("adata", 4, 1.10);
        perangkat.informasi();

        System.out.println(" ");


        System.out.println("===== Class Handphone =====");
        Handphone handphone = new Handphone("Vgen",2,1.80, false);
        handphone.informasi();
        handphone.telfon(12341);
        handphone.kirimSMS(98762);
        handphone.kirimSMS(6666, 45232);
        System.out.println(" ");


        System.out.println("===== Class Laptop =====");
        Laptop laptop = new Laptop ("Samsung",16,2.40, true);
        laptop.informasi();
        laptop.bukaGame("FIFA22");
        laptop.kirimEmail("telyu@gmail.com");
        laptop.kirimEmail("unisba@gmail.com","telyu@gmail.com");
    }
}
