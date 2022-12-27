public class Calculation implements Runnable{
    double radius;
    double area;
    double side;
    double phi = 3.14;

    @Override
    public void run() {
        System.out.println("\n===== Program Will Statr in =====");
        for (int i = 3;i>0;i--){
            try {
                System.out.println("Starting with thread " + i);
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void setSquare(double side) throws IllegalArgumentException{
        this.side = side;
        if (side < 1){
            throw new IllegalArgumentException("Nilai sisi kurang dari 1");
        }else {
            this.area = side * side;
        }
    }

    public double getSquare(){
        return area;
    }

    public void setCircle(double radius){
        this.radius = radius;
        if(radius < 1){
            throw new IllegalArgumentException("Nilai sisi kurang dari 1");
        }else{
            this.area = phi * radius * radius;
        }
    }

    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if(a < 1||b < 1||t < 1){
            throw new IllegalArgumentException("Nilai sisi kurang dari 1");
        }else {
            this.area = 0.5 * t *(a + b);
        }
    }

    public double getTrapezoid(){
        return area;
    }
}
