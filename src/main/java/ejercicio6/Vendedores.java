/*Ejercicio 6
El sector de ventas online de notebooks Lenovo paga a sus vendedores mediante comisiones. Los
vendedores reciben $2000 por semana, más el 6% de sus ventas brutas durante esa semana. Por
ejemplo, un vendedor que vende $50000 de mercancía en una semana, recibe $2000 más el 6% de
$50000, o un total de $5000. Usted acaba de recibir una lista de los artículos vendidos por cada
vendedor. Los valores de estos artículos son los siguientes:
Articulo Valor
1        $ 7239.99
2        $ 9129.75
3        $ 6899.95
4        $ 13150.89
Desarrolle una aplicación en JAVA que reciba como entrada los artículos vendidos por un vendedor
durante cada día de la última semana, y que calcule y muestre los ingresos de ese vendedor. No hay
límite en cuanto al número de artículos que un representante puede vender.*/

package ejercicio6;

public class Vendedores extends Articulos {
    
    private double gananciaVendedor;

    private double getGananciaVendedor() {
        return gananciaVendedor;
    }

    private void setGananciaVendedor(float _gananciaVendedor) {
        this.gananciaVendedor = _gananciaVendedor;
    }
    
    Vendedores(){
        this.gananciaVendedor = 0;
    }
    
    public void vender(int... articulosVendidos) {
        this.setGananciaVendedor(2000);
        for (int numeroDeVenta = 0; numeroDeVenta < articulosVendidos.length ; numeroDeVenta++){
            if ((articulosVendidos[numeroDeVenta]>0)&&(articulosVendidos[numeroDeVenta]<5)){
                this.gananciaVendedor = this.gananciaVendedor + (this.getListaDeArticulos()[articulosVendidos[numeroDeVenta]-1] * 0.06);
            }
        }
        System.out.println("Ganancia del vendedor: $" + String.format("%.2f", this.getGananciaVendedor()));
    }
}
