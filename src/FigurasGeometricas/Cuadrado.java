package FigurasGeometricas;

public class Cuadrado extends Figura {
    //atributos
   private float lado;
   public Cuadrado (float lado){
   this.lado=lado;
   }

   //getters
    public float getLado() {
        return lado;
    }
//setters
    public void setLado(float lado) {
        this.lado = lado;
    }

       //metodo
    public void calcularArea() {
       float area=0;
       area=lado*lado;
       System.out.println("Usted ingreso : " + lado + "Para la medida de cada lado");
       System.out.println("El area de su cuadrado es : " + area + "cm2");
    }
}