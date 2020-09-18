/*
	Código Base para execução dos Desafio do BXComp!!
inhaiiiii
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;

public class Desafio04{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            char[] linha = (scan.nextLine()).toCharArray();
            String v1="", c1="", v2="", c2="";

            int espaco =0;
            for(int j=0;j<linha.length;j++){

                if(espaco==0){
                    v1+=linha[j];
                }else if(espaco==1){
                    c1+=linha[j];
                }else if(espaco==2){
                    v2+=linha[j];
                }else if(espaco==3){
                    c2+=linha[j];
                }else if(linha[j]==' '){
                    espaco++;
                }

                float v1float = Float.valueOf(v1);
                float c1float = Float.valueOf(c1);
                float v2float = Float.valueOf(v2);
                float c2float = Float.valueOf(c2);

                float vMenor, cMenor, vMaior, cMaior;
                int maior;

                if(v1float>=v2float){
                    vMaior=v1float;
                    cMaior=c1float;
                    vMenor=v2float;
                    cMenor=c2float;
                    maior=1;
                }else{
                    vMaior=v2float;
                    cMaior=c2float;
                    vMenor=v1float;
                    cMenor=c1float;
                    maior=2;
                }

                double res;

                res = (0.14*(vMaior+vMenor))/((0.14-cMaior)*((0.14-cMaior)*(cMenor*vMenor+cMaior*vMaior)));

                if(res==1){
                    System.out.println("Hehe, esse aqui ta no ponto.");
                }else if(res<vMaior){
                    System.out.println("Hehe, esse aqui ta no ponto. Guardem o barril "+maior+"pra depois.");
                }else if(res>vMaior){
                    System.out.println("Assim n vai dar. A bebida tem que estar perfeita!");
                }
            
            }


        }
		
        
    }

}