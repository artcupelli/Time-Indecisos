import java.util.Scanner;

public class Desafio01{
// ETAPA 0 DESAFIO 1
// Sua miss ̃ao  ́e escrever um algoritmo que traduza os resultados desse teste para uma linguagem
// mais acess ́ıvel para os novatos da nave. Desenvolva um algoritmo que, ao informar o resultado de
// um teste GADO, imprima o n ́ıvel do teste. Por exemplo, se o resultado do teste for “GADO D+”,
// o dano  ́e de n ́ıvel 1, e se for “GADO D+++”, o dano  ́e de n ́ıvel 3, e se for apenas “GADO D”, o
// combust ́ıvel n ̃ao possui dano, e isso deve ser informado.
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i<N;i++){
            String teste = sc.nextLine();
            System.out.println(Dano(teste));
        }

    }
    public static String Dano(String teste){
        int nivel=0;
        String test = teste;
        while(test.contains("+")){
                test = test.substring(test.indexOf("+")+1);
                nivel++;
            }
            return nivel==0?"O combustivel nao possui dano" : "Dano de nivel "+nivel;
    }
}