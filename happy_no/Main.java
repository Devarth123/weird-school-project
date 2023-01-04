import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt(),temp=0;
        while(true){
            temp= (temp*10) + (int)Math.pow((no%10),2);

            no/=10;
            System.out.println(no+" "+temp);
            // if (temp<10) break;
            if (no==0) no = temp;
            
        }
        // if (temp == 1) System.out.println("Happy no");
        // else System.out.println("sad no");
    }   
}