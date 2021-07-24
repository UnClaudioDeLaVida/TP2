/*Ejercicio 1
Cree una clase llamada Empleado, que incluya tres variables de instancia: el nombre (String), un
apellido (String) y un salario mensual (double). Su clase debe tener un constructor que inicialice las
tres variables de instancia. Proporcione los métodos get y set para cada variable de instancia. Si el
salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba llamada
PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado
y muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del
10% y muestre el salario anual de cada Empleado otra vez.*/
package ejercicio1;

public final class Empleado{

    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado() {
        this.nombre = "";
        this.apellido = "";
        this.salarioMensual = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String _apellido) {
        this.apellido = _apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double _salarioMensual) {
        if (_salarioMensual >= 0) {
            this.salarioMensual = _salarioMensual;
        }
    }

    public void mostrarSalarioAnual() {
        System.out.println(this.apellido + ", " + this.nombre + ". Salario mensual: " + String.format("%.2f", this.salarioMensual)  + ". Salario anual: " + String.format("%.2f", this.salarioMensual * 12));
    }

    public void aumentarSalarioMensual(double porcentajeAumento) {
        if (this.salarioMensual > 0) {
            this.salarioMensual = this.salarioMensual * (1 + (porcentajeAumento / 100));
        System.out.println("Salario mensual modificado exitosamente a " + String.format("%.2f", this.getSalarioMensual()));
        }
    }

}
