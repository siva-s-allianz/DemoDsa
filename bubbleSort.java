import java.util.Arrays;

public class bubbleSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr ={84984,6842,15,6428,15,64,2653,3,6,4,2,1,5,7,8,19};
        System.out.println("Before sorting : "+Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting : "+Arrays.toString(arr));
    }

}
