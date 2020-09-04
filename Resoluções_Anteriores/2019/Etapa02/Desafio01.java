import java.util.Scanner;
import java.lang.Math;

public class Desafio01 {
    
    public static final int massaNave = 100000;
    public static final double pesoMax = (1.5*(Math.pow(10, 10)));
    public static final double G =  (6/(Math.pow(10, 7)));

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.valueOf(scan.nextLine());
        String planeta[][] = new String[n][2];
        String resp[] = new String[n];

        for(int i=0; i<n;i++){

            planeta[i][0]= "Planeta: "+scan.nextLine();
            char[] massaCompleta = (scan.nextLine()).toCharArray();
            int raio = Integer.valueOf(scan.nextLine())*1000;

            String massaSt ="", baseSt="", potenciaSt="";

            int x=0;
            for(int j=0; j<massaCompleta.length;j++){
                
                if(massaCompleta[j]!='x'&&massaCompleta[j]!=' '){
                    if(x==0){
                        massaSt += massaCompleta[j];
                    }else if(x==1){
                        baseSt += massaCompleta[j];
                    }else if(x==3){
                        potenciaSt += massaCompleta[j];
                    }
                }else if(massaCompleta[j]=='x'){
                    x++;
                }
            }

            double massaPlaneta = (Double.parseDouble(massaSt))*(Math.pow((Integer.valueOf(baseSt)),(Integer.valueOf(potenciaSt))));
            double peso = massaNave*(G*massaPlaneta)/(Math.pow(raio,2));
            
            System.out.println(pesoMax);
            if(peso>pesoMax){
                planeta[i][1]="Nao eh seguro aterrissar neste planeta, pois sua estrutura cederia";
            }else{
                planeta[i][1]="Eh seguro aterrissar neste planeta, pois sua estrutura aguentaria";
            }
        }

        for(int i=0; i<n;i++){
            for(int j=0; j<2; j++){
                System.out.println(planeta[i][j]);
            }
        }

    }

    
}
