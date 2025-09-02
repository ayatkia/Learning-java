package staff;

public class Chef implements Employer {
    public Chef(String[] fodeOrder) {
        doNecessaryTask(fodeOrder);
    }
    @Override
    public void doNecessaryTask(String[] fodeOrder) {
        System.out.println("chef -> \n"+
                "Wash hands \n"+
                "cook "+fodeOrder[0]);
        System.out.println("----------------------------------------------");
    }
}
