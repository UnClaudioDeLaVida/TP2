/*
Ejercicio 8
Cree una clase llamada CuentaDeAhorros. Use una variable static llamada tasalnteresAnual para
almacenar la tasa de interés anual para todos los clientes. Cada objeto de la clase debe contener una
variable de instancia llamada saldoAhorros, que indique la cantidad que el ahorrador tiene
actualmente en depósito. Proporcione el método calcularlnteresMensual para calcular el interés
mensual, multiplicando el saldoAhorros por la tasalnteresAnual dividida entre 12; este interés debe
sumarse al saldoAhorros. Proporcione un método static llamado modificarTasalnteres para
establecer la tasalnteresAnual en un nuevo valor. Escriba un programa para probar la clase
CuentaDeAhorros. Cree dos instancias de objetos CuentaDeAhorros, ahorradorl y ahorrador2, con
saldos de $20000.00 y $30000.00. Establezca la tasalnteresAnual en 4%, después calcule el interés
mensual para cada uno de los 12 meses e imprima los nuevos saldos para ambos ahorradores. Luego
establezca la tasalnteresAnual en 5%, calcule el interés del siguiente mes e imprima los nuevos
saldos para ambos ahorradores.
 */
package ejercicio8;

public class CuentaDeAhorros {

    private static double TASA_INTERES_ANUAL = 0;
    private double saldoAhorros;

    public CuentaDeAhorros() {
        this.setSaldoAhorros(0);
    }

    public CuentaDeAhorros(double saldoAsignado) {
        this.setSaldoAhorros(saldoAsignado);
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    private void setSaldoAhorros(double _saldoAhorros) {
        this.saldoAhorros = _saldoAhorros;
    }

    public void calcularInteresMensual() {
        double interesMensual = this.getSaldoAhorros() * (CuentaDeAhorros.TASA_INTERES_ANUAL / 1200);
        System.out.println("Saldo actual: " + String.format("%.2f", this.getSaldoAhorros()) + ". Interés mensual a sumarse en cuenta: " + String.format("%.2f", interesMensual));
        this.setSaldoAhorros(this.saldoAhorros + interesMensual);
    }

    public static void modificarTasaInteres(double valorModificado) {
        TASA_INTERES_ANUAL = valorModificado;
    }

}
