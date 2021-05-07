import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adriel Dias
 */
public class TrabalhoProgramação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        Locale.setDefault(Locale.US);
            Scanner leia = new Scanner(System.in);
            //variavel população
            System.out.println("Digite a população do seu país: ");
            int N1 = leia.nextInt();

                if(N1 >= 10000 && N1 <=100000000) //Variavel meses contadora.
                { 
                System.out.println("Insirra a quantidade de meses de aplicação das vacinas: ");
                int M1 = leia.nextInt();

                    if (M1>= 1 && M1<=10){
                    int M = M1; //Variavel contadora das doses.
                    int extra=0;
                    float D1=0;
                    float D2=0;
                    float maior = 0;
                    int mesMaior = 0;
                    //Laço For de acordo com as doses.
                    for(int Q = 1; Q<=M; Q++){
                    System.out.println("Primera dose: "+Q+"° Mês");
                    extra = leia.nextInt();
                    D1 = D1+extra;
                   
                    System.out.println("Segunda dose: "+Q+"° Mês");
                    extra = leia.nextInt();
                    D2 = D2+extra;
                     if(D1+D2>maior){
                      maior = D1+D2;
                      mesMaior = Q;
                    }    
                }
                    
                        System.out.println(D1);
                        System.out.println(D2);
                        System.out.println(mesMaior);
                }
                else
                System.out.printf("Quantidade de meses invalidos!\n");
                    
                    
                    
            }else 
            System.out.printf("população insuficiente!");
         }

    }
