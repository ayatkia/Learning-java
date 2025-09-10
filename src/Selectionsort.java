public class Selectionsort {
    private int[] arry;
    public Selectionsort(int[] arry) {
        this.arry = arry;
    }

    public int[] getArry() {
        return arry;
    }

    public void setArry(int[] arry) {
        this.arry = arry;
    }
    public void sorting() {
        for (int i = 0; i < arry.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arry.length; j++) {
                if(arry[j]<arry[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=arry[minIndex];
            arry[minIndex]=arry[i];
            arry[i]=temp;
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+",");
        }
    }
}
