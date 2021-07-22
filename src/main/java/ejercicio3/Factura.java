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

import java.util.Scanner;

public class Factura {
    private static int NUMERO_ACTUAL_FACTURA = 1000;
    private int numeroFactura;
    private int numeroArticulo;
    private String descripcionArticulo;
    private int cantidadArticulos;
    private float precioArticulo;

    public Factura(int nroArt, String descArt, int cntArt, float preArt){
        this.cantidadArticulos = cntArt;
        this.descripcionArticulo = descArt;
        this.numeroArticulo = nroArt;
        this.numeroFactura = NUMERO_ACTUAL_FACTURA;
        this.precioArticulo = preArt;
        NUMERO_ACTUAL_FACTURA++;
    }
    
    public Factura(){
        int numArt, cantArt;
        String descArt;
        float precArt;
        Scanner ingresarString = new Scanner(System.in);
        Scanner ingresarNumero = new Scanner(System.in);
        System.out.println("Ingrese número de artículo: ");
        numArt = ingresarNumero.nextInt();
        System.out.println("Ingrese descripción de artículo: ");
        descArt = ingresarString.nextLine();
        System.out.println("Ingrese cantidad de artículos: ");
        cantArt = ingresarNumero.nextInt();
        System.out.println("Ingrese precio de venta: ");
        precArt = ingresarNumero.nextFloat();
        this.cantidadArticulos = cantArt;
        this.descripcionArticulo = descArt;
        this.numeroArticulo = numArt;
        this.numeroFactura = NUMERO_ACTUAL_FACTURA;
        this.precioArticulo = precArt;
        NUMERO_ACTUAL_FACTURA++;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int _numeroFactura) {
        this.numeroFactura = _numeroFactura;
    }
    
    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int _numeroArticulo) {
        this.numeroArticulo = _numeroArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String _descripcionArticulo) {
        this.descripcionArticulo = _descripcionArticulo;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int _cantidadArticulos) {
        this.cantidadArticulos = _cantidadArticulos;
    }

    public float getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(float _precioArticulo) {
        this.precioArticulo = _precioArticulo;
    }
    
    public double obtenerMontoFactura() {
        if (this.cantidadArticulos < 0) {
            this.cantidadArticulos = 0;
        }
        if (this.precioArticulo < 0) {
            this.precioArticulo = (float) 0.0;
        }
        
        double montoFactura = (float)this.cantidadArticulos * this.precioArticulo;
        return (double) montoFactura;
    }
    
    public void generarFactura() {
        System.out.println("Número de factura: " + this.getNumeroFactura() + ". Número de artículo: " + this.getNumeroArticulo() + ". Descripción: " + this.getDescripcionArticulo());
        System.out.println("Cantidad de Artículos: " + this.getCantidadArticulos() + ". Precio Unitario: $" + this.getPrecioArticulo() + ". Total: $" + this.obtenerMontoFactura());
    }
}
