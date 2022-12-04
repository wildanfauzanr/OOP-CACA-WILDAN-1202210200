public class Perangkat {
    public String drive;
    public int ram;
    public float processor;
    
    public Perangkat(String drive, int ram, double processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = (float) processor;
    }

    public void informasi(){
        System.out.println("Perangkat ini memiliki drive tipe "+drive+", dengan ram sebesar "+ram+" gb, dan processor secepat "+processor+" Ghz");
    }    
}
