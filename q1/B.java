
class B{
    public static void main(String args[]){
        int x = 12345, rev=0;
        for(;x!=1;x/=10){
            rev = (rev*10)+(x % 10);
            System.out.println(x);
        }
        System.out.println(x);
        
        for(;rev!=0;rev/=10){
            x = (x*10)+(rev%10);
            System.out.println(x);
        }
    }
}