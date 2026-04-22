
public class substring {
    // static void subset(String p, String up){
    // //base case
    // if(up.isEmpty()){
    // System.out.println(p);
    // return;

    // }
    // char ch = up.charAt(0);

    // //include
    // subset(p + ch,up.substring(1));
    // //exclude
    // subset(p ,up.substring(1));
    // }
    // public static void main(String[] args){
    // String str = "abc";
    // subset("",str);

    // }



    // //count substring
    // static int subset(String str) {

    //     if (str.isEmpty()) {
    //         return 1;

    //     }
    //     return subset(str.substring(1)) + subset(str.substring(1));

      
    // }

    // public static void main(String[] args) {
    //     String str = "abc";
    //     System.out.println(subset(str));
    // }
//       static void path(String str, int r, int c){
//         if(r == 1 && c == 1) {
//             System.out.println(str);
//             return;
//         }
//         if(r > 1) path(str + "D" ,r-1, c);
//         if(c > 1) path(str + "R" ,r, c-1);
//       }
    
//     public static void main(String[] args) {
//         int r = 3;
//         int c = 3;
//         path(" ",r,c);
// }
static int path(int n){
        if(n == 1 || n == 1) {
         
            return 1;
        }
        return path(n-1) + path(n-2);
        
      }
    
    public static void main(String[] args) {
        int n = 3;
        
        System.out.println(path(n));
}
}