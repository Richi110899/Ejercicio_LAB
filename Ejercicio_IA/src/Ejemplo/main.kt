// Importa las clases Empleado desde el paquete ejemplo
import Ejemplo.Empleado

// Función para crear instancias de Empleado, y mostrar sus datos
fun crearPersonasYEmpleados() {
    // Crear una instancia de la clase Empleado
    val empleado = Empleado("Carlos Gómez", 40, "Desarrollador", 3000.0)

    // Imprime la información del empleado usando el método sobrescrito en Empleado
    println("Información del Empleado:")
    empleado.mostrarInfo() // Llama al método 'mostrarInfo' que imprime la información del empleado
    // Imprime el salario anual del empleado
    println("Salario Anual: ${empleado.calcularSalarioAnual()}") // Llama al método 'calcularSalarioAnual' y muestra el resultado
    println() // Línea en blanco para separar la salida
}

// Función principal que ejecuta el programa
fun main() {
    crearPersonasYEmpleados() // Llama a la función 'crearPersonasYEmpleados' para mostrar la información de los empleados
}
