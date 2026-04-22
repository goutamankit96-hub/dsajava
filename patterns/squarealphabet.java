

import java.util.Scanner;

public class squarealphabet {
      public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a number : ");
    int n = sc.nextInt();
       char ch = 'A';

    for(int i=0;i<n;i++){
        // char ch = 'A';
        for(int j=1;j<=n;j++){
            System.out.print(ch +" ");
            ch++;
        }
        System.out.println();
    }

}
    
}
