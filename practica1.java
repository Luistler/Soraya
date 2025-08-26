import java.util.Scanner;

public class practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
        int num_par = 0;
        int num_neg = 0;
        int num_imp = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\nTeclea el numero %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                num_par++;
            } else {
                num_imp++;
            }
            if (numeros[i] < 0) {
                num_neg++;
            }
        }
        System.out.printf("\nCantidad de numeros impares: %d\nCantidad de numeros pares: %d\nCantidad de numeros negativos: %d", num_imp, num_par, num_neg);

    }
}