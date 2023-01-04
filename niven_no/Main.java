import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt(),sm=0  ;
        for(;no!=0;no/=10){
            sm+=no %10;
        }       
        if (no % sm == 0) System.out.println("its a niven no.");
        else System.out.println("its not a niven no.");
    }
}