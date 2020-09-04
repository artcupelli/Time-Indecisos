import java.util.Scanner;
import java.lang.Math;

public class Desafio01{
	public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        long litros[] = new long[n] ;

        for(int i=0; i<n;i++){
            
            int m = ler.nextInt();
            litros[i]= Math.round((energia(m)/(1.5*Math.pow(10,9)))) ;
        }

        for(int i=0; i<n;i++){
            System.out.println(litros[i]);
        }
    }
    
    public static double energia(int m){
        double e;
        e = (m*(Math.pow(12,2)*(Math.pow(10,5))))/2;
        System.out.println(e);
        return e;
    }
}
