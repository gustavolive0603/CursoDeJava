package loops;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuadaDo = 0;
        int resul=0;

        System.out.println("Qual tabuada você deseja ver? ");
        tabuadaDo = scan.nextInt();

        for (int  i = 0; i <= 10; i++ ){
            resul = tabuadaDo * i;
            System.out.println(tabuadaDo + " x " + i + " = " + resul );
        }
    }
}
