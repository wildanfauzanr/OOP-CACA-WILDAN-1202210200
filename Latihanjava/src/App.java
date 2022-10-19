import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String nama, NIM;
        int tubes, quiz, tugas, uts, uas;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan nama : ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukan NIM : ");
        NIM = keyboard.nextLine();

        System.out.print("Masukan nilai TUBES: ");
        tubes = keyboard.nextInt();

        System.out.print("Masukan nilai quiz: ");
        quiz = keyboard.nextInt();
        
        System.out.print("Masukan nilai tugas: ");
        tugas = keyboard.nextInt();
        
        System.out.print("Masukan nilai UTS: ");
        uts = keyboard.nextInt();
        
        System.out.print("Masukan nilai UAS: ");
        uas = keyboard.nextInt();
        
        int TotalNilai = (int) (0.3*tubes) + (int) (0.1*quiz) + (int) (0.1*tugas) + (int) (0.25*uts) + (int) (0.25*uas);

        System.out.println("--------------------");
        System.out.println("Nama : " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek : " + TotalNilai);
    }
    
}

