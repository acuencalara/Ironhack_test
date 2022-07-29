import java.util.Scanner;

public class bucleMultiplicar {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Introduce un numero que quieras multiplicar: ");
            int numeroIntroducido=sc.nextInt();

            for (int i=0;i<=10;i++){
                int resultado=numeroIntroducido*i;
                System.out.println(resultado);
            }
        }
    }
