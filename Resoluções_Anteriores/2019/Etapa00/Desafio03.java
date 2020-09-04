import java.util.Scanner;
import java.lang.Math;

public class Desafio03{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = Integer.valueOf(scan.nextLine());
        String[] nomes = new String[n];

        for(int i=0;i<n;i++){
            
            nomes[i]="";
            char[] nome = (scan.nextLine()).toCharArray();
            String nomeInvertido ="";

            int j = nome.length-1;
            while(nome[j]!=' '){
                nomeInvertido += nome[j];
                j--;
            }

            nomeInvertido.toUpperCase();
            char[] nomeInvertidoChar = nomeInvertido.toCharArray();

            for(int h=nomeInvertidoChar.length-1; h>=0;h--){
                nomes[i]+= nomeInvertidoChar[h];
            }

            
            nomes[i] += ", "+nome[0]+". ";

            for(int h=0; h<(nome.length-nomeInvertidoChar.length-1);h++){
                if(nome[h]==' '){
                    nomes[i] += nome[h+1] +". ";
                }
            }
        }

        for(int i=0; i<n;i++){
            System.out.println(nomes[i].toUpperCase());
        }

    }

}
