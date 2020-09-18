import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


public class Desafio03{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        char  letras[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// Inteiro 'n' para coletar o número de casos que será digitado
        int n = Integer.valueOf(scan.nextLine());
        
		// Colocar o código que será repetido 'n' vezes		
        for(int i=0;i<n;i++){
            ArrayList<String> p = new ArrayList<String>();
            char[] proxLinha=(scan.nextLine()).toCharArray();

            while(proxLinha[0] !='-'){
                char[] palavraBinario = proxLinha;
                String palavra="";
                String bin="";
                int espaco =0;
                for(int j=0; j<palavraBinario.length; j++){

                    if(palavraBinario[j]!=' '){
                        System.out.println(j);
                        bin += palavraBinario[j];
                        
                        if(j==palavraBinario.length-1){
                            System.out.println(bin);
                            palavra+=letras[Integer.parseInt(bin,2)];
                        }
                        
                    }else{
                        
                        palavra+=letras[Integer.parseInt(bin,2)];
                        bin="";
                        espaco++;
                    }
                    
                }
                p.add(palavra);
                System.out.println(palavra);
                proxLinha = (scan.nextLine()).toCharArray();
            }

            
        }
		
		// Colocar a saída que deverá ser exibidas 'n' vezes
        for(int i=0; i<n;i++){
            
        }

        
    }

}