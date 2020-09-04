import java.util.ArrayList;
import java.util.Scanner;
public class Desafio03{
//ETAPA 2 DESAFIO 3
// Com a ajuda da tabela fornecida, desenvolva um algoritmo que converta as frases recebidas em
// codigo morse.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
       int N = Integer.parseInt(sc.nextLine());
       char  letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
       String simbolos []= {".-","-..","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

       for(int i =0; i<N;i++){

        String palavra = sc.nextLine();
        palavra = palavra.toUpperCase().replace(" ","/");

        for(int l=0;l<letras.length;l++){
            palavra = palavra.replace(letras[l]+"", simbolos[l]+" ");
            System.out.println(palavra);
        }

       }


    }


}