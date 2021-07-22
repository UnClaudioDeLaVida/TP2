/*Ejercicio 4
Cree una clase llamada Rectángulo con los atributos longitud y anchura, cada uno con un valor
predeterminado de 1. Debe tener métodos para calcular el perímetro y el área del rectángulo. Debe
tener métodos get y set para longitud y anchura. Los métodos set deben verificar que longitud y
anchura sean números de punto flotante mayores de 0.0, y menores de 20.0. Escriba un programa
para probar la clase Rectángulo y cada uno de sus métodos.*/

package ejercicio4;

public class Rectangulo {
    private float longitud;
    private float anchura;
    public Rectangulo(){
        this.longitud = (float) 1.0;
        this.anchura = (float) 1.0;
    }
    
    public Rectangulo(float _longitud, float _anchura){
        setLongitud(_longitud);
        setAnchura(_anchura);
    }

    public float getLongitud() {
        return longitud;
    }

    private void setLongitud(float _longitud) {
        if ((_longitud > 0) && (_longitud <20 )){
            this.longitud = _longitud;
        }
        else {
            this.longitud = 1;
        }
    }

    public float getAnchura() {
        return anchura;
    }

    private void setAnchura(float _anchura) {
        if ((_anchura > 0) && (_anchura <20 )){
            this.anchura = _anchura;
        }
        else {
            this.anchura = 1;
        }
    }
    
    public float calcularPerimetro() {
        return (this.anchura + this.longitud) * 2;
    }
    
    public void calcularArea() {
        System.out.println("Área del rectángulo: " + this.anchura * this.longitud);
    }
    
    public void mostrarYCalcular() {
        System.out.println("Longitud: " + this.getLongitud());
        System.out.println("Anchura: " + this.getAnchura());
        System.out.println("Perímetro: " + this.calcularPerimetro());
        this.calcularArea();
    }
}
