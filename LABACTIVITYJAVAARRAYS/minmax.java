package anudip.LABACTIVITYJAVAARRAYS;

public class minmax {
    static void minmax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min="+min+" max="+max);
    }
    public void main(String[] args) {
        minmax obj=new minmax();
        int [] arr=new int [10];
        arr = new int[] {1,2,3,4,5,6,7,8,8};
       minmax(arr);
    }
}
