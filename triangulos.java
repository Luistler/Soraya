import java.util.Scanner;

public class triangulos {
    public static void main(String[] args) {
        int[][]coordenadas = new int[3][2];
        double lado1=0, lado2=0, lado3=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea las coordenas de los triangulos:");
        for (int i = 0; i <coordenadas.length; i++) {
            for(int x=0;x <coordenadas[i].length;x ++){
                System.out.printf("\nTeclea la coordenada [%d][%d]: ", i+1, x+1);
                coordenadas[i][x] = scanner.nextInt();
            }
        }
        //Tipos de coordenadas (cada una se guarda en la posicion [x][y] y con eso se hace el calculo respectivo)
        //00=x1 01=y1
        //10=x2 11=y2
        //20=x3 21=y3
        lado1 = Math.sqrt(Math.pow((coordenadas[1][0]-coordenadas[0][0]),2)+Math.pow((coordenadas[1][1]-coordenadas[0][1]),2));
        lado2 = Math.sqrt(Math.pow((coordenadas[2][0]-coordenadas[1][0]),2)+Math.pow((coordenadas[2][1]-coordenadas[1][1]),2));
        lado3 = Math.sqrt(Math.pow((coordenadas[2][0]-coordenadas[0][0]),2)+Math.pow((coordenadas[2][1]-coordenadas[0][1]),2));

        System.out.printf("Lado 1: %.2f\n", lado1);
        System.out.printf("Lado 2: %.2f\n", lado2);
        System.out.printf("Lado 3: %.2f\n", lado3);

        if (lado1 == 0 || lado2 == 0 || lado3 == 0){
            System.out.println("No es un triangulo");
        }
        else if (lado1 == lado2 && lado2 == lado3){
            System.out.println("El triangulo es equilatero");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("El triangulo es isosceles");
        }
        else{
            System.out.println("El triangulo es escaleno");
        }
    }
}
