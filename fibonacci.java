import java.util.*;

class Main{
  public static void main (String[] args){
    int x = 0 , y = 1;



    //Enter number to get 1-20 fibonacci sequence.
    Scanner fibo = new Scanner(System.in);
    System.out.print("Enter value for fibonacci sequence \n");
    int n = fibo.nextInt();

    for(int i = 1; i <= n; ++i){

      int next = x + y;
      x = y;
      y = next;
    }
    System.out.print("Fibonacci value of " + x );
  }
}
