/*Ejercicio 1
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String), un
apellido (String) y un salario mensual (double). Su clase debe tener un constructor que inicialice las
tres variables de instancia. Proporcione los métodos get y set para cada variable de instancia. Si el
salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba llamada
PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado
y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del
10% y muestre el salario anual de cada Empleado otra vez.*/

package ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleadoUno = new Empleado();
        Empleado empleadoDos = new Empleado();
        
        empleadoUno.setNombre("Martín");
        empleadoUno.setApellido("Fue Fletado");
        empleadoUno.setSalarioMensual(-25000);
        
        empleadoDos.setNombre("Liliana");
        empleadoDos.setApellido("Sigue Laburando");
        empleadoDos.setSalarioMensual(52000);
        
        empleadoUno.mostrarSalarioAnual();
        empleadoDos.mostrarSalarioAnual();
        
        empleadoUno.aumentarSalarioMensual(10);
        empleadoDos.aumentarSalarioMensual(10);
        
        empleadoUno.mostrarSalarioAnual();
        empleadoDos.mostrarSalarioAnual();
    }
}
