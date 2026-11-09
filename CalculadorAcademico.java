public class CalculadorAcademico {

    public static double calcularPromedio(double sumaNotas, int cantidadMaterias) {
        if (cantidadMaterias == 0) {
            throw new ArithmeticException("La cantidad de materias no puede ser cero para el cálculo del promedio");
        }
        return sumaNotas / cantidadMaterias;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Intentando calcular promedio con 0 materias...");
            double promedio = calcularPromedio(45.0, 0);
            System.out.println("Promedio: " + promedio);
        } catch (ArithmeticException e) {
            System.err.println("Error capturado: " + e.getMessage());
        }
    }
}