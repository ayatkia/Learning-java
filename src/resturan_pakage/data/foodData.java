package resturan_pakage.data;

public class foodData {
    public  static final String[][] MENUE={
            {"Pizza","10 min","$12" },
            {"Burger","9 min","$16" },
            {"Rice","6 min","$9" },
            {"Kebab","10 min","$20" }

};

    @Override
    public String toString() {
        String food="";
        for(int i=0;i<MENUE.length;i++){
            food+=i+1+" ->"+MENUE[i][0]+"\n";
        }
        return food;
    }
}




