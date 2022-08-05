package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 1;

        int media = 0;
        int maior = 0;
        int soma = 0;

        do  {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count++;
            soma = soma + numero;
            if (numero > maior){
                maior = numero;
            }
        } while (count <= 5);

        media = soma / (count-1);

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println(count);
    }
}
