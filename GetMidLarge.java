import java.util.*;

public class GetMidLarge{
  static void bubbleSort(int[] x, int mid, int largest){
    int lnt = x.length;
    int temp = 0;

    for(int i = 0; i < lnt; i++){
      for(int j = 1; j < (lnt-i); j++){
        if(x[j-1] > x[j]){
          temp = x[j-1];
          x[j-1] = x[j];
          x[j] = temp;
        }
      }
    }
    mid = (lnt + 1) /2;
    System.out.print("Median: " + mid);
    System.out.print("Largest Value: " + x[6]);
  }


  public static void main (String [] args){
    int a[] = {5,6,3,10,9,78,40};
    int mid = 0, largest = 0;

    bubbleSort(a, mid, largest);

    for (int i=0; i < a.length; i++){
      System.out.print(" " +a[i] + " ");
    }

  }

}
