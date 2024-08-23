package Ejemplo

// Clase Persona
// La palabra clave 'open' permite que esta clase pueda ser heredada por otras clases
open class Persona(
    val nombre: String, // Propiedad que almacena el nombre de la persona
    val edad: Int       // Propiedad que almacena la edad de la persona
) {
    // Método para mostrar la información de la persona
    // La palabra clave 'open' permite que este método sea sobrescrito en las clases derivadas
    open fun mostrarInfo() {
        println("Nombre: $nombre")  // Imprime el nombre de la persona
        println("Edad: $edad")      // Imprime la edad de la persona
    }
}

// Clase Empleado que hereda de Persona y añade propiedades adicionales
// La palabra clave 'class' se usa para definir una nueva clase. La herencia se indica con ': Persona'
class Empleado(
    nombre: String,    // Propiedad heredada de la clase Persona
    edad: Int,         // Propiedad heredada de la clase Persona
    val puesto: String, // Nueva propiedad específica de la clase Empleado
    val salario: Double // Nueva propiedad específica de la clase Empleado
) : Persona(nombre, edad) { // Hereda de Persona

    // Sobrescribir el método para mostrar la información del empleado
    // La palabra clave 'override' se usa para indicar que se esta sobrescribiendo un método de la superclase
    override fun mostrarInfo() {
        super.mostrarInfo() // Llama al método 'mostrarInfo' de la superclase Persona
        println("Puesto: $puesto")  // Imprime el puesto del empleado
        println("Salario: $salario") // Imprime el salario del empleado
    }

    // Método para calcular el salario anual del empleado
    fun calcularSalarioAnual(): Double {
        return salario * 12 // El salario mensual por 12 es para obtener el salario anual
    }
}

