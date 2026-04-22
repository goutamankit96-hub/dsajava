public class practice {
    
        public static void main(String[] args){

    int n = 3;
    for(int i=n; i>0; i--){  
        for(int j=n; j>n-i; j--){
            System.out.print("_");
            
        }
        System.out.println();

    }
        for(int k=0; k<n; k++){  
        for(int l=0; l<k+1; l++){
            System.out.print("* " );
        }
        System.out.println();

    }
}
}
