public class pattern7 {
    public static void main(String[ ]args){
        for (int a = 0; a <5;a++){
        for(int i = 5-a; i>= 0; i--){
            System.out.print(" ");
        }
        for(int j =0; j<2*a+1; j++){
            System.out.print("*");
        }
         for(int i = 5-a; i>= 0; i--){
            System.out.print(" ");
        }
        System.out.println("");
    }
    }
}
