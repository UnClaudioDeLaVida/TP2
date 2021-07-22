/*Ejercicio 2
Realizar una aplicación sencilla para simular una cuenta bancaria (caja de ahorro). Una cuenta
bancaria vista como un objeto tiene, por una parte, atributos que definen su estado, como Tipo de
interés y Saldo, y por otra, operaciones que definen su comportamiento, como Establecer tipo de
interés, Ingresar dinero, Retirar dinero, Saldo actual o Abonar intereses. Asegúrese que el monto a
retirar no exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin cambio y el método
debe imprimir un mensaje que indique " El monto a retirar excede el saldo de la cuenta.” Realice la
clase PruebaCuenta para probar los diferentes métodos.*/

package ejercicio2;

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBanco miCuenta = new CuentaBanco();
        miCuenta.consultarSaldo();
        miCuenta.setInteresTipo(15);
        miCuenta.ingresarDinero(10000);
        miCuenta.retirarDinero(15000);
        miCuenta.retirarDinero(1200);
        miCuenta.abonarIntereses();
    }
}