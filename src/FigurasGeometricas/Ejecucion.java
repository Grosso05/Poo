package FigurasGeometricas;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        //variables
        float lado=0, altura=0, base=0,radio=0;
        int figura, repeticion=1;
        Scanner Leer = new Scanner(System.in);


        do {
            System.out.println("Bienvenido a la calculadora de areas");
        System.out.println("DIGITE 1 para cuadrado, 2 para triangulo,3 para circulo o 4 para rectangulo");
        figura=Leer.nextInt();

        switch(figura){
            case 1: 
                System.out.println("Vamos a calcular el area de un cuadrado");
                System.out.println("Ingrese cuanto mide el lado del cuadrado");
                lado=Leer.nextFloat();
                Cuadrado cuadrado=new Cuadrado(lado);
                cuadrado.calcularArea();
            break;
            case 2 :
            System.out.println("Vamos a calcular el area de un triangulo");
            System.out.println("Ingrese cuanto mide la base del triangulo");
            base=Leer.nextInt();
            System.out.println("Ingrese que altura tiene el triangulo");
            altura=Leer.nextInt();
            Triangulo triangulo=new Triangulo(base, altura);
            triangulo.calcularArea();
            break;
            case 3:
            System.out.println("Vamos a calcular el area de un circulo");
            System.out.println("Ingrese cuanto mide el radio del circulo");
            radio=Leer.nextFloat();
            Circulo circulo=new Circulo(radio);
            circulo.calcularArea();
            break;

            case 4:
            System.out.println("Vamos a calcular el area de un rectangulo");
            System.out.println("Ingrese cuanto mide la base del rectangulo");
            base=Leer.nextInt();
            System.out.println("Ingrese que altura tiene el rectangulo");
            altura=Leer.nextInt();
            Rectangulo rectangulo=new Rectangulo(base, altura);
            rectangulo.calcularArea();
            break;
            default:
            System.out.println("Usted digito un numero invalido");

            }
            System.out.println("Digite 1 para calcular otra area o 0 para finalizar");
            repeticion=Leer.nextInt();    
    } 
    
while(repeticion==1);
   
    if(repeticion!=1){
        System.out.println("Programa finalizado");
    }
    }  
}
