/*
	Código Base para execução dos Desafio do BXComp!!
inhaiiiii
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;

public class Desafio02{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        char[] charLinha = (scan.nextLine()).toCharArray();;

        while(charLinha[0]!='C'){
            
            int  g=0, a=0;
            String num="";
            for(int j=0; j<charLinha.length;j++){

                if(charLinha[j]=='G'){
                    g++;
                }else if(charLinha[j]=='A'){
                    a++;
                }else if(charLinha[j]!=' '){
                    num+=charLinha[j];
                }
            }

            if(a==0&&g>=Integer.valueOf(num)){
                System.out.println("Recuar!");
            }else if(a!=0&&(a*10+g)>=Integer.valueOf(num)){
                System.out.println("Eu que nao fico no caminho dele!");
            }else if((a*10+g)<=Integer.valueOf(num)){
                System.out.println("Atacar!");
            }

            charLinha = (scan.nextLine()).toCharArray();;

            if(charLinha[0]=='C'){
                System.out.println("Ah que mal deve ser receber um presente de grego?");
            }

        }


        
    }

}
