public class rec {
  
    public static int num(int i){
         if (i==0){
            return 1;
        }
       return i * num(i-1);
      }
    public static void main(String args[]){
        
       int r =  num(9);
       System.out.println(r);
       
    }}

     

    

