package anudip.LABACTIVITYJAVAARRAYS;

public class DeclareandDisplay {
    static void problem(int[] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int [] arr = new int[5];
        arr = new int[]{1,2,3,4,5};
        problem(arr);
    }
}
