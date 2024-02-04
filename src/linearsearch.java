import java.lang.module.FindException;
import java.util.Scanner;

public class linearsearch {
  static  int linearsearch(int[] arr,int target){
      if (arr.length==0){
           return -1;
      }
      for (int i=0;i<arr.length;i++){
          int element=arr[i];
          if (element==target){
              return i;
          }
      }
      return -1;
  }

    public static void main(String[] args) {
        int[] array={1,34,23,56,78,90,54};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to scan");
        int  a=sc.nextInt();
        int system=linearsearch(array,a);
        System.out.println(system);

    }

}
