/*Ejercicio 4
Cree una clase llamada Rectángulo con los atributos longitud y anchura, cada uno con un valor
predeterminado de 1. Debe tener métodos para calcular el perímetro y el área del rectángulo. Debe
tener métodos get y set para longitud y anchura. Los métodos set deben verificar que longitud y
anchura sean números de punto flotante mayores de 0.0, y menores de 20.0. Escriba un programa
para probar la clase Rectángulo y cada uno de sus métodos.*/

package ejercicio4;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(12, 13);
        Rectangulo r3 = new Rectangulo(38, (float) 0.5);
        Rectangulo r4 = new Rectangulo(-10, 40);
        System.out.println("Rectángulo creado con constructor sin parámetros y prueba de getters en main:");
        System.out.println("Longitud: " + r1.getLongitud());
        System.out.println("Anchura: " + r1.getAnchura());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        r1.calcularArea();
        System.out.println("Rectángulo creado con constructor con parámetros y prueba de getters en main:");
        System.out.println("Longitud: " + r2.getLongitud());
        System.out.println("Anchura: " + r2.getAnchura());
        System.out.println("Perímetro: " + r2.calcularPerimetro());
        r2.calcularArea();
        System.out.println("Rectángulo creado con un parámetro que debería corregirse con setters, usando directamente método para mostrar y calcular:");
        r3.mostrarYCalcular();
        System.out.println("Rectángulo creado con parámetros que deberían corregirse con setters, usando directamente método para mostrar y calcular:");
        r4.mostrarYCalcular();
    }
    
}
