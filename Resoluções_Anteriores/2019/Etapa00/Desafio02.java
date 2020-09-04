import java.util.Scanner;
import java.lang.Math;

public class codigoBase{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.valueOf(scan.nextLine());
        String[] frases = new String[n];

        for(int i=0;i<n;i++){

            frases[i]="";
            char[] fraseInvertida = (scan.nextLine()).toCharArray();
            
            for(int j=fraseInvertida.length-1; j>=0; j--){
                frases[i] += fraseInvertida[j];
            }

        }

        for(int i=0; i<n;i++){
            System.out.println(frases[i]);
        }

        
    }

}