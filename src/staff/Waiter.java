package staff;

public class Waiter implements Employer {

    public Waiter(String[] fodeOrder) {
        doNecessaryTask(fodeOrder);
    }

    @Override
    public void doNecessaryTask(String[]fodeOrder) {
        System.out.println("Waiting -> \n"+
                "get costumer order to the chef\n"+
                "wate for "+fodeOrder[1]+"\n"+
                "deliver"+fodeOrder[0]+"to costomers");
        System.out.println("----------------------------------------------");

    }
}
