import java.util.Scanner;

public class arreglos2 {
    public static void main(String[] args) {
        String[]nombre;
        String[]estados;
        double dinero[];
        long tels[];
        int edades[];
     
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos elementos quieres capturar: ");
        int elementos=scanner.nextInt();
        nombre=new String[elementos];
        for(int i=0;i<nombre.length;i++){
            System.out.printf("\nDame el nombre %d: ",i+1);
            nombre[i]=scanner.next();
            System.out.printf("Dame la edad de %s: ",nombre[i]);
            edades[i]=scanner.nextInt();
            System.out.printf("Dame el telefono de %s: ",nombre[i]);
            tels[i]=scanner.nextLong();
            System.out.printf("Dame el estado de %s: ",nombre[i]);
            estados[i]=scanner.next();
        }
        System.out.println("\nDatos: ");
        for(int i=0;i<nombre.length;i++){
            System.out.println(nombre[i]);
            System.out.println(edades[i]);
            System.out.println(tels[i]);
            System.out.println(estados[i]);
        }

    }
}
