package FigurasGeometricas;

public class Circulo {
    // crear atributos
    private float radio;

    public Circulo (float radio){
        this.radio=radio;
    }
//getters
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
//setters
    public void calcularArea() {
        double area=0;
        final double pi =3.14;
        area=pi*(radio*radio);
        System.out.println("Usted ingreso un radio de  "+ radio);
        System.out.println("El area para esta figura es : " + area + "cm2");
     }
    
}
