import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no =in.nextInt(),h1=0,rev=0,c=0,no2=0;
        no2 = no;
        for(;no!=0;no /= 10){
            rev=(rev*10)+(no % 10); 
            c++;
        } 
        for(int i=1;i<=(c/2);++i){
            
            h1= (h1*10) + (rev % 10);
            rev/=10;
        }
        c*=0;
        for(;rev!=0;rev/=10){
            c = (c*10)+(rev%10);
        }
        if (no2 == Math.pow((h1+c),2)) System.out.println("its a tech no.");
        else System.out.println("its not a tech no.");
    }
}