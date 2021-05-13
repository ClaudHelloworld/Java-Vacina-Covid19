import java.util.Locale;
import java.util.Scanner;

/**
 * @author Adriel Dias - Claudinei Gomes - Vitor Targino 
 */
public class LP1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        //VARIAVEL DA POPULAƒO
        System.out.println("Total da populacao do pais: ");
        int N1 = leia.nextInt();
        if (N1 >= 10000 && N1 <= 100000000) //CONDICIONAL DE POPULACAO
        {
            float N2 = N1 / 100;// VARIAVEL DA DIVISAO DA PORCENTAGEM
            System.out.println("Quantidade de meses de aplicacao das vacinas: ");//VARIAVEL DE MESES
            int M1 = leia.nextInt();
            if (M1 >= 1 && M1 <= 10) {
                int M = M1; //VARIAVEIS CONTADORAS DE DOSES
                int extra = 0;
                float D1 = 0;
                float D2 = 0;
                float maior = 0;
                int mesMaior = 0;
                float Z1 = 0;
                float Z2 = 0;
                //LACO FOR DE ACORDO COM AS DOSES
                for (int Q = 1; Q <= M; Q++) {
                    D1 = 0;
                    D2 = 0;
                    System.out.println("Primera dose: " + Q + "° MES");
                    extra = leia.nextInt();
                    D1 = D1 + extra;
                    Z1 = Z1 + D1;
                    System.out.println("Segunda dose: " + Q + "° MES");
                    extra = leia.nextInt();
                    D2 = D2 + extra;
                    Z2 = Z2 + D2;
                    if (D1 + D2 > maior) {
                        maior = D1 + D2;
                        mesMaior = Q;
                    }
                }//AREA DE DIVISÃO FINAL PARA AS SAIDAS
                float R1 = Z1 / N2;
                float R2 = Z2 / N2;
                System.out.printf("Porcentagem de vacinados 1° Dose: %.1f \n", R1);
                System.out.printf("Porcentagem de vacinados 2° Dose: %.1f \n", R2);
                System.out.println("Maior mes de vacinados 1° e 2° Dose: " + mesMaior + "°Mes");
            }//SAIDAS CASO HAJA DADOS INSUFICIENTES
            else {
                System.out.printf("Quantidade de meses invalidos!\n");
            }
        } else {
            System.out.printf("populacao insuficiente!");
        }
    }
}