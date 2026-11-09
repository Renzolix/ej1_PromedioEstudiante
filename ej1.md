# Ejercicio 1: PromedioEstudiante

## Explicación Lógica
1. **Lanzamiento de Excepción:** El método `calcularPromedio` evalúa mediante `if (cantidadMaterias == 0)` si el divisor es cero y lanza manualmente una instancia de `ArithmeticException`.
2. **Captura en `main`:** El bloque `try-catch` intercepta la excepción emitida, impidiendo el colapso del programa e imprimiendo una notificación clara por `System.err`.