public class DeleteOperation {
    public int[] DeleteionSort(int[] arry,int pos) {
        int[] newArray= new int[arry.length-1];
        for(int i=0;i<pos;i++){
            newArray[i]=arry[i];
        }

        for(int i=pos;i<newArray.length;i++){
            newArray[i]=arry[i+1];
        }

        return newArray;
    }
}


