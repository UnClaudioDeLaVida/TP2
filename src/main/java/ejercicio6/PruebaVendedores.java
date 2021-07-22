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

public class PruebaVendedores {
    public static void main(String[] args) {
        Vendedores vendedor1 = new Vendedores();
        Vendedores vendedor2 = new Vendedores();
        Vendedores vendedor3 = new Vendedores();
        vendedor1.vender(0,1,2,3,4,5,6,7,6,5,4,3,2,1);
        vendedor2.vender(4,4,4,4,9,3,7);
        vendedor3.vender(0,5,6,7);
    }
}
