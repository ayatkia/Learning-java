public class InsertOperation {
    public int[] InsertionSort(int[] arry,int pos,int value) {
        int[] newArray= new int[arry.length+1];
        for(int i=0;i<pos;i++){
            newArray[i]=arry[i];
        }
        newArray[pos]=value;
        for(int i=pos;i<arry.length;i++){
            newArray[i+1]=arry[i];
        }

        return newArray;
    }
}
