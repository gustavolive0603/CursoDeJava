package loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ex_NomeEIddades {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("continua aqui......");
    }
}
