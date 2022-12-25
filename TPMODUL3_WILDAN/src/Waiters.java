public class Waiters implements Runnable{
    private int orderQty;
    private int customerID;
    static int foodPrice = 25000;
    public Waiters  (int orderQty, int customerID){
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        } 
    }
    public void orderInfo(){
        System.out.println("================================");
        System.out.println("Customer ID: "+ customerID);
        System.out.println("Number of Food: "+ orderQty);
        System.out.println("Total Price: "+ (foodPrice*orderQty));
        System.out.println("================================");
    }
    public void makeFood(){
        synchronized(Restaurant.getLock()) {
            System.out.println("Waiter: Food is ready to deliver");
            Restaurant coffeeMachine = new Restaurant();
            coffeeMachine.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the restaurant to make another food\n");
        }
    }
}
