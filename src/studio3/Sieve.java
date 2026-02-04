import java.util.Scanner; 
public class Sieve {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    System.out.println("Enter n: "); 
    int n = in.nextInt(); 
    if (n >= 2); {
        boolean prime[] = new boolean[n+1]; 
        int multiple = 2;
        for (int j=1; j*j<=n; j++); {
        for (int i = 2; i <= n; i += j){
            i = i+2; 
        }

}
    }
}