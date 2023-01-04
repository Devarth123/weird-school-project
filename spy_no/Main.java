import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt(),pd=1,sm=0;
        
        while(no != 0) {
            pd*=(no % 10);
            sm+=(no % 10);
            no /= 10;
        }
        if(pd == sm) System.out.println("Its a spy no");
        else System.out.println("Its not a spy no");
        
    }
}