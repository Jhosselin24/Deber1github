import java.util.Scanner;
public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("Calculadora de Áreas");
            System.out.println("1. Calcular área de un triángulo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un círculo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;

                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = lado * lado;
                    System.out.println("El área del cuadrado es: " + areaCuadrado);
                    break;

                case 3:
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }

            System.out.println(); // Línea en blanco para separar iteraciones del menú
        } while (opcion != 4);

        scanner.close();
    }
}
