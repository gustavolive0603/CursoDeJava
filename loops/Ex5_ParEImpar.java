package loops;

import java.util.Scanner;

public class Ex5_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdnumero = 0,count = 0, numero = 0;

        int par = 0, impar = 0;

        System.out.print("Qual a quantidade de numeros? ");
        qtdnumero = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            if (numero % 2 == 0){
                par++;
            }else {
                impar++;
            }
        } while (count < qtdnumero);


        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}
