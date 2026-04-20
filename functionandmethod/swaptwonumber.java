

public class swaptwonumber{
    // public static void main(String args[]){
    //     int a = 48;
    //     int b = 65;
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("a : " + a);
    //     System.out.println("b : " + b);
    // }
    // call by value
       public static void ChangeA(int a){
        a = 10;
       }
      public static void main(String args[]){
        int a = 5;
        ChangeA(a);
        System.out.println(a);
    }


}