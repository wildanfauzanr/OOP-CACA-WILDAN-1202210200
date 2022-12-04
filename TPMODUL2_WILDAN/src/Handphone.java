public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone(String drive, int ram, double processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        if (fingerprint == true){
                System.out.println("Handphone ini memiliki drive tipe "+drive+", dengan ram sebesar "+ram+" gb, dan processor secepat "+processor+" Ghz."+" Selain itu handphone ini memiliki fingerprint");
        }
        else{
                System.out.println("Handphone ini memiliki drive tipe "+drive+", dengan ram sebesar "+ram+" gb, dan processor secepat "+processor+" Ghz."+" Namun handphone ini tidak memiliki fingerprint");
        }
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menghubungi no "+no_hp);
    }
    
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS pada no "+no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS pada no "+no_hp1+" dan "+no_hp2);
    }
}
