import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(),y=0,j=1,k=1;
        while(true){            
            ++j;
            k+=2;
            y = k * j;
            if (x == y) {
                System.out.println("Its a pronic no.");
                break;
            }
            else if((y>x) || (y<x)){
                System.out.println("Its not a pronic no.");
                break;
            }
        }
    }
}