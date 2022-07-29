import java.util.Scanner;
import java.util.Random;

public class randomNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        int max=25;
        int min=0;
        boolean fallo=true;

        int randomNumber=random.nextInt(25);

        while(fallo){
            System.out.println("introduce un número  entre el 0 i el 25 para saber si coincide con el numero aleatorio: ");
            int numeroIntroducido=sc.nextInt();

            if(numeroIntroducido==randomNumber){
                System.out.println("Has acertado el numero");
                fallo=false;
            } if (numeroIntroducido!=randomNumber){
                System.out.println("Has fallado, vuelve a intentarlo");
            }
        }

        System.out.println(randomNumber);

    }
}
