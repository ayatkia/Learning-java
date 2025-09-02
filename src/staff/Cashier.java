package staff;

public class Cashier implements Employer{
    public Cashier(String[] fodeOrder) {
        doNecessaryTask(fodeOrder);
    }
    @Override
    public void doNecessaryTask(String[] fodeOrder) {
        System.out.println("Cashier ->\n"
        +"print the customer's food bill \n"+
                "get"+fodeOrder[2]+"from customers");
        System.out.println("----------------------------------------------");
    }
}
