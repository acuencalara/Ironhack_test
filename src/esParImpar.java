import java.util.Scanner;

public class esParImpar  {

    public static void main(String[] args) {
        boolean esPar=true;

        Scanner sc=new Scanner(System.in);

        while (esPar) {

            System.out.println("Introduce un numero para decir si es par o impar");

            int numero=sc.nextInt();

            if(numero%2==0){
                System.out.println("Enhorabuena, es un numero par");
                esPar=false;
            } else {
                System.out.println("Has fallado, no es par!");
            }

        }

    }
}
