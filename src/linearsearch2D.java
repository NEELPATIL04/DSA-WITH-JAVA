import java.util.Arrays;
import  java.util.Scanner;
public class linearsearch2D {
    static int[] linearsearch(int[][] arr, int target){
        if (arr.length==0){
            return new int[] {-1,-1};
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {


                int element = arr[i][j];
                if (element == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={ {2,4,2}, {3,4,2},{2,4,6}
        };
        System.out.println("enter the number to search");
        int a = sc.nextInt();
        int target= a;
        int[] system=linearsearch(arr,target);
        System.out.println("the number you are looking for is on index :" + Arrays.toString(system));
    }
}
