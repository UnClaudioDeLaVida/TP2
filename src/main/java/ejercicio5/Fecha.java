/*Ejercicio 5
Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (int), un día (int) y un
año (int). Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe
verificar que los valores que se proporcionan son correctos. Proporcione los métodos get y set para
cada variable de instancia. Proporcione un método mostrarFecha , para Imprimir la fecha en varios
formatos, como "05/21/2010", "Junio 14, 2012" y "20 Agosto 11".
Usar constructores sobrecargados para crear objetos Fecha inicializados con fechas de los formatos
solicitados para imprimir. En el primer caso, el constructor debe recibir tres valores enteros. En el
segundo, debe recibir un objeto String y dos valores enteros. En el tercero debe recibir un valor
entero, string y otro entero. Escriba una aplicación de prueba llamada PruebaFecha, que demuestre
las capacidades de la clase Fecha.*/

package ejercicio5;

public class Fecha {
    int mes;
    int dia;
    int anio;
    
    Fecha(int _dia, int _mes, int _anio){
        if ( (_dia < 0) || (_dia > 31) )
            this.setDia(1);
        else
            this.setDia(_dia);
        if ( (_mes < 0) || (_mes > 12) )
            this.setMes(1);
        else
            this.setMes(_mes);
        this.setAnio(_anio);
    }
    
    Fecha(String _mes, int _dia, int anio){
        this.setAnio(anio);
        if ( (_dia < 0) || (_dia > 31) )
            this.setDia(1);
        else
            this.setDia(_dia);
        this.mes = this.mesLetrasANumero(_mes);
    
    }

    Fecha(int _dia, String _mes, int anio){
        this.setAnio(anio);
        if ( (_dia < 0) || (_dia > 31) )
            this.setDia(1);
        else
            this.setDia(_dia);
        this.mes = this.mesLetrasANumero(_mes);
    }
    
    private int getMes() {
        return mes;
    }

    private void setMes(int _mes) {
        this.mes = _mes;
    }

    private int getDia() {
        return dia;
    }

    private void setDia(int _dia) {
        this.dia = _dia;
    }

    private int getAnio() {
        return anio;
    }

    private void setAnio(int _anio) {
        this.anio = _anio;
    }
    
    private String mesNumeroALetras(int mesEnNumero) {
        String[] mesesEnLetras = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return mesesEnLetras[mesEnNumero - 1];
    }
    
    private int mesLetrasANumero(String mesEnLetras) {
        String[] mesesEnLetras = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int numeroDeMesDevuelto = 1;
        for (int posicionDelMes = 0; posicionDelMes<mesesEnLetras.length; posicionDelMes++){
            if(mesEnLetras.equals(mesesEnLetras[posicionDelMes])){
                numeroDeMesDevuelto = posicionDelMes+1;
            }
        }
        return numeroDeMesDevuelto;
    }
    
    public void mostrarFecha() {
        System.out.println("DD/MM/AAAA: " + this.getDia() + "/" + this.getMes() + "/" + this.getAnio());
        System.out.println("Mes DD, AAAA: " + this.mesNumeroALetras(this.mes) + " " + String.format("%02d", this.dia) + ", " + String.format("%02d", this.anio));
        System.out.println("DD Mes AA: " + String.format("%02d", this.dia) + " " + this.mesNumeroALetras(this.mes) + " " + String.format("%02d", this.anio%100) + "\n");
    }
    
     
    
    
}
