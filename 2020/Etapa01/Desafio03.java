/*
	Código Base para execução dos Desafio do BXComp!!
inhaiiiii
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;

public class Desafio03{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            char[] data = (scan.nextLine()).toCharArray();
            String dia="", mes="";

            boolean barra =false;
            for(int j =data.length-1; j>=0;j--){
                
                if(data[j]=='/'){
                    barra=true;
                }

                if(barra==true&&data[j]!='/'){
                    mes+=data[j];
                }

                if(barra==false&&data[j]!='/'){
                    dia+=data[j];
                }

            }

            int diaN = Integer.valueOf(dia);
            int mesN = Integer.valueOf(mes);
            if(((diaN>=20)&&(mesN==3))||(mesN==4)||(mesN==5)||(mesN==6)||(mesN==7)||(mesN==8)||(diaN<=21)&&(mesN==9)){
                System.out.println(dia+"/"+mes+" O solo nao estara ao nosso favor nesse dia.");
            }else{
                System.out.println(dia+"/"+mes+" O solo estara ao nosso favor nesse dia.");
            }
            
        }
		
        
    }

}