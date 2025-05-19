import java.util.Scanner;

public class Calculadora_de_Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Seleccione tu figura geometrica para calcular:");
        System.out.println("Circulo");
        System.out.println("Rectangulo");
        System.out.println("Cuadrado");
        System.out.print("Opción: ");
        int opcion = sc.nextInt();

        double area = 0;
        double perimetro = 0;

        switch (opcion) {
            case Circulo: // Círculo
                System.out.print("Dime el radio del círculo: ");
                double radio = sc.nextDouble();
                area = calcularAreaCirculo(radio);
                perimetro = calcularPerimetroCirculo(radio);
                mostrarResultados("Círculo", area, perimetro);
                break;

            case Rectangulo: // Rectángulo
                System.out.print("Dime el largo del rectángulo: ");
                double largo = sc.nextDouble();
                System.out.print("Dime el ancho del rectángulo: ");
                double ancho = sc.nextDouble();
                area = calcularAreaRectangulo(largo, ancho);
                perimetro = calcularPerimetroRectangulo(largo, ancho);
                mostrarResultados("Rectángulo", area, perimetro);
                break;

            case Cuadrado: // Cuadrado
                System.out.print("Dime el lado del cuadrado: ");
                double lado = sc.nextDouble();
                area = calcularAreaRectangulo(lado);  // Usando la sobrecarga para el cuadrado
                perimetro = 4 * lado;  // Perímetro de un cuadrado
                mostrarResultados("Cuadrado", area, perimetro);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        sc.close(); // Cerrar el Scanner después de usarlo
    }

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el perímetro de un círculo
    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // Función para calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }

    // Sobrecarga para calcular el área de un cuadrado (solo recibe un lado)
    public static double calcularAreaRectangulo(double lado) {
        return lado * lado;
    }

    // Función para calcular el perímetro de un rectángulo
    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    // Procedimiento para mostrar los resultados en pantalla
    public static void mostrarResultados(String figura, double area, double perimetro) {
        System.out.println("Figura: " + figura);
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}

	


    


