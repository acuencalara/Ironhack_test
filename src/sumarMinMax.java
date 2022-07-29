import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class sumarMinMax {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int numero;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        Scanner sc=new Scanner(System.in);

        String choice;

        do{
            System.out.println("Escribe un numero");
            numero=sc.nextInt();

            if(numero>max){
                max=numero;
            } if(numero<min){
                min=numero;
            }
            System.out.println("Quieres Seguir? (yes,no)");
            choice=sc.next();
        } while (choice.equals("yes"));

        System.out.println(max);
        System.out.println(min);
    }

}
