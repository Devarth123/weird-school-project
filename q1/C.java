class C {
    public static void main(String[] args) {
        for(short i=5; i>=0;--i){
            for(short j=0;j<i;++j){
                if (j==(i-1)) System.out.print(i);
                else System.out.print('$');
            }
            System.out.println();
        }
    }
}