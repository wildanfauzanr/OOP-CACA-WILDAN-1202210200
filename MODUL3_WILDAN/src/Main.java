import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void SelectMenu(){
        System.out.println("=== Menu Program===");
        System.out.println("1.Square");
        System.out.println("2.Circle");
        System.out.println("3.Trapezoid");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Calculation cal = new Calculation();
        boolean repeat = true;
        boolean report = false;
        do{
            try{
                SelectMenu();
                System.out.print("Select Menu : ");
                int menu = input.nextInt();
                switch (menu){
                    case 1 :
                        System.out.print("\nEnter the length of the side of the square : ");
                        double side = input.nextDouble();
                        cal.setSquare(side);
                        cal.run();
                        System.out.println();
                        System.out.println("\nThe Calculation result : " + cal.getSquare());
                        break;
                    case 2:
                        System.out.print("\nEnter the radius of the circle : ");
                        double rad = input.nextDouble();
                        cal.setCircle(rad);
                        cal.run();
                        System.out.println("The calculation result : " + cal.getCircle());
                        break;
                    case 3:
                        System.out.print("\nEnter the side of the base of the trapezoid : ");
                        double sisi_bawah = input.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double sisi_atas = input.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double tinggi = input.nextDouble();
                        cal.setTrapezoid(sisi_bawah,sisi_atas,tinggi);
                        cal.run();
                        System.out.println("\nThe Calculation result : " + cal.getTrapezoid());
                        break;
                    default:
                        System.out.println("\noption not avalable");
                        continue;
                }
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("\n====Error: input must be a integer ====");
            }catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }while (repeat);
        input.close();
    }
}