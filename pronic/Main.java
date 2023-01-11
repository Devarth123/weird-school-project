import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        for(int j=0;j<=((int)Math.sqrt(x)); ++j){
            if ((j *(j+1)) == x){
                System.out.println("Its a pronic number");
                System.exit(0);
            }
        }
        System.out.println("its not a pronic number");
    }
}
