/*
	Código Base para execução dos Desafio do BXComp!!
inhaiiiii
	Autor: Time Os Indecisos <3
*/
import java.util.Scanner;
import java.lang.Math;

public class Desafio01{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());

		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){

            char[] linha = (scan.nextLine()).toCharArray();
            char operacao=' ';
            boolean muda =false;
            String num1="",num2="";

            for(int j=0; j<linha.length;j++){

                if(Character.isDigit(linha[j])&&muda==false){
                    num1+=linha[j];
                }else if(Character.isDigit(linha[j])&&muda!=false){
                    num2+=linha[j];
                }else if(linha[j]=='n'){
                    operacao='n';
                    muda=!muda;
                }else if(linha[j]=='a'){
                    operacao='a';
                    muda=!muda;
                }else if(linha[j]=='r'){
                    operacao='r';
                    muda=!muda;
                }else if(linha[j]=='c'){
                    operacao='c';
                    muda=!muda;
                }else if(linha[j]=='i'){
                    operacao='i';
                    muda=!muda;
                }else if(linha[j]=='s'){
                    operacao='s';
                    muda=!muda;
                }else if(linha[j]=='o'){
                    operacao='o';
                    muda=!muda;
                }

            }

            switch(operacao){

                case 'n': 
                System.out.println(Integer.valueOf(num1)+Integer.valueOf(num2));
                break;

                case 'a':
                System.out.println(Integer.valueOf(num1)-Integer.valueOf(num2));
                break;

                case 'r': 
                System.out.println(Integer.valueOf(num1)*Integer.valueOf(num2));
                break;

                case 'c':
                System.out.println(Integer.valueOf(num1)/Integer.valueOf(num2));
                break;

                case 'i': 
                System.out.println(Math.round(fatorial(Integer.valueOf(num1))/fatorial(Integer.valueOf(num2))));
                break;

                case 's':
                System.out.println(Integer.valueOf(num1)%Integer.valueOf(num2));
                break;

                case 'o': 
                System.out.println(Math.round(Math.pow(Integer.valueOf(num1),Integer.valueOf(num2))));
                break;

            }

        }
		

    }

    public static int fatorial(int a){

        int fat=a;
        while(a>1){
            fat = fat*(a-1);
            a--;
        }
        return fat;
    }
}