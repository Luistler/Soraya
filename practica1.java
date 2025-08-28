import java.util.Scanner;
import java.lang.Math;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        int num_neg = 0;
        int num_par = 0;
        int num_imp = 0;
        int sum_imp=0;
        float promedio=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\nTeclea el numero %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                double raiz = Math.sqrt(numeros[i]);
                System.out.printf("\nLa raiz cuadrada del numero: %d es %.2f", numeros[i], raiz);
                num_par++;
            } else {
                sum_imp+=numeros[i];
                num_imp++;
            }
            if (numeros[i] < 0) {
                num_neg++;
            }
            
        }
        if(num_imp==0){
                System.out.println("\nNo hay numeros impares");
            }
        promedio = (float) sum_imp / num_imp;
        System.out.printf("\nCantidad de numeros negativos: %d", num_neg);
        System.out.printf("\nPromedio de numeros impares: %.2f", promedio);
    }
}
