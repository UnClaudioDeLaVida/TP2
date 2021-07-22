/*Ejercicio 3
Cree una clase llamada Factura, que una ferretería podría utilizar para representar una factura para
un artículo vendido en la tienda. Una Factura debe incluir un número de factura, un número de
articulo, la descripción del articulo, la cantidad de artículos de ese tipo que se van a comprar y el
precio por artículo. Su clase debe tener un constructor que inicialice las variables de instancia.
Proporcione los métodos get y set para cada variable de instancia. Además, proporcione un método
llamado obtenerMontoFactura, que calcule el monto de la factura (es decir, que multiplique la
cantidad por el precio por artículo) y después lo devuelva como un valor double. Si la cantidad no
es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse en 0.0.
Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase
Factura.*/

package ejercicio3;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura venta1 = new Factura(3000, "Destornillador Phillips", 3, 250);
        Factura venta2 = new Factura(3000, "Destornillador Phillips", 5, 250);
        Factura venta3 = new Factura(3001, "Destornillador punta plana", 2, 200);
        Factura venta4 = new Factura(237, "Fichas RJ45", 20, 30);
        Factura venta5 = new Factura();
        venta1.generarFactura();
        venta2.generarFactura();
        venta3.generarFactura();
        venta4.generarFactura();
        venta5.generarFactura();
    }
}
