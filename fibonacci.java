public class fibonacci{
    public static void main(String args[]){
        int n=10;
        int firstnum=0;
        int secondnum=1;
        System.out.println("fibonacci number "+ n + "terms");
        for(int i=1; i<=n; i++){
            System.out.print(firstnum + " ");
            int nextterm = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextterm;
            
        }

    }
}