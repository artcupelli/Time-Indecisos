import java.util.Scanner;

public class Desafio02 {
    public static void main(String[]args){

        Scanner ler = new Scanner(System.in);

        int n = Integer.valueOf(ler.nextLine()) ;
        String frases[] = new String[n];

        for(int i=0; i<n;i++){

            String frase = ler.nextLine();
            char letras[] = frase.toCharArray();
            frases[i]="";

            boolean copiando=false;
            for(int j=0; j<frase.length();j++){

                if(letras[j]!='!'){   
                    if(copiando==true){
                        frases[i]+=letras[j];
                    }
                }else{
                    copiando = !copiando;
                }
            }

        }

        for(int i=0; i<n;i++){
            System.out.println(frases[i]);
        }
        


    }
}
