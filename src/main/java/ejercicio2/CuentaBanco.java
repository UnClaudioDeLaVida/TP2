/*Ejercicio 2
Realizar una aplicación sencilla para simular una cuenta bancaria (caja de ahorro). Una cuenta
bancaria vista como un objeto tiene, por una parte, atributos que definen su estado, como Tipo de
interés y Saldo, y por otra, operaciones que definen su comportamiento, como Establecer tipo de
interés, Ingresar dinero, Retirar dinero, Saldo actual o Abonar intereses. Asegúrese que el monto a
retirar no exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin cambio y el método
debe imprimir un mensaje que indique " El monto a retirar excede el saldo de la cuenta.” Realice la
clase PruebaCuenta para probar los diferentes métodos.*/

package ejercicio2;

public class CuentaBanco {
    private float saldo;
    private float interesTipo;
    private static final float INTERESPORDEFECTO = 10;
    
    public CuentaBanco() {
        this.setSaldo(0);
        this.interesTipo = INTERESPORDEFECTO;
        System.out.println("Nueva cuenta creada correctamente.");
    }
    
    //Como lo uso en el constructor, que es público, este set puedo hacerlo privado.
    private void setSaldo(float _saldo) {
        this.saldo = _saldo;
    }
    
    //Como a este get lo llama un método público, lo puedo usar aunque este sea privado
    private float getSaldo() {
        return saldo;
    }
    
    public void consultarSaldo() {
        System.out.println("Saldo: $" + this.saldo);
    }
    
    public void setInteresTipo(float _interesTipo) {
        this.interesTipo = _interesTipo;
        System.out.println("Interés modificado exitosamente al %" + this.interesTipo);
    }
    
    public void retirarDinero (float importeARetirar) {
        if (importeARetirar < 0) {
            importeARetirar = importeARetirar * -1;
        }
        if (importeARetirar > this.saldo) {
            System.out.println("No se pudo realizar la operación. El monto a extraer excede el saldo en cuenta.\nSaldo: $" + this.saldo);
        } else {
            this.saldo = this.saldo - importeARetirar;
            System.out.println("Extracción realizada correctamente.\nSaldo: $" + this.saldo);
        }
    }
    
    public void ingresarDinero (float importeAIngresar) {
        if (importeAIngresar < 0) {
            importeAIngresar = importeAIngresar * -1;
        }
        this.saldo = this.saldo + importeAIngresar;
        System.out.println("Depósito realizado correctamente.\nSaldo: $" + this.saldo);
    }
    
    public void abonarIntereses ()
    {
        System.out.println("Saldo a fin de mes: $" + this.getSaldo() + "\nInterés mensual: %" + this.interesTipo + "\nIntereses a abonar: $" + this.saldo*this.interesTipo/100);
        this.saldo = this.saldo * (1 + (this.interesTipo/100));
        System.out.println("Saldo: $" + this.getSaldo());
    }
}
