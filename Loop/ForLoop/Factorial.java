package ForLoop;

public class Factorial {
    public static void main(String[] args){
    int n=3, i, fact=1;
    i=1;
    for(i=1;i<=n;i++)
    {
        fact = fact * i;
    }

    System.out.println(fact);
    }
    
}
