import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

    public static int binarySer(int[] arr, int target){
        int low=0;
        int high = arr.length -1;

        while(low <= high){
            int mid =low +(high -low)/2;

            if (arr[mid] == target) return mid;
            if(arr[mid]<target) low=mid+1;
            else high =mid-1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements");
    }



}