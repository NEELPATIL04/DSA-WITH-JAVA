import java.util.Scanner;

public class binarysearch {
    static int[] sorts2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static  int binarysearch (int[] arr, int target){
                  int start=0;
                  int end= arr.length-1;
                      while (start<=end) {
                          int mid=  (start+ end)/2;
                          if(target<arr[mid]){
                              end=mid-1;
                          }else if (target >arr[mid]){
                              start=mid + 1;
                          }else {
                              return mid;
                          }
                      }
                      return -1;
    }

    public static void main(String[] args) {

        int[] array ={3,4,2,53,4,5,3,54};
        int[] sorted =sorts2(array);
        for(int num :sorted){

            System.out.print(" "+num+" ");
        }
        System.out.println("enter the no to search ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int binarysearch1=binarysearch(sorted, a);
        System.out.println(binarysearch1);



    }
}

