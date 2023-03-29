package Salud;

import java.util.Scanner;

public class Persona {
    //Creacion de atributos

private String tipoDoc;
private String nombre;
private String apellido;
private String sexo;
private int documento;
private int edad;
private double peso;
private double estatura;

public Persona(String tipoDoc2, int documento2, String apellido2, String sexo2, double peso3, double estatura2, double peso2, String sexo3){
   
}

public Persona(String tipoDoc, int documento, String nombre, String apellido, int edad, String sexo, double peso, double estatura) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
}

public Persona() {
}

//Getters
public String getTipoDoc() {
    return tipoDoc;
}
public String getNombre() {
    return nombre;
}
public String getApellido() {
    return apellido;
}
public String getSexo() {
    return sexo;
}
public int getDocumento() {
    return documento;
}
public int getEdad() {
    return edad;
}
public double getpeso(){
    return peso;
}
public double getestatura(){
    return estatura;
}

//setters

public void setPeso(double peso) {
    this.peso = peso;
}
public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

    //Creacion de los metodos

    public void pedirDatos(){
Scanner Leer=new Scanner(System.in);

        System.out.println("Por favor digite el tipo de documento");
        tipoDoc=Leer.nextLine();
        System.out.println("Por favor digite el numero de su documento");
        documento=Leer.nextInt();
        System.out.println("Por favor digite su nombre");
        nombre=Leer.next();
        System.out.println("Por favor digite su apellido");
        apellido=Leer.next();
        /* comentareado para ejecutar reto 3 
        System.out.println("Por favor digite su peso");
        peso=Leer.nextDouble();
        System.out.println("Por favor digite su estatura");
        estatura=Leer.nextDouble();
        System.out.println("Por favor digite su edad");
        edad=Leer.nextInt();
        System.out.println("Por favor digite su sexo");
        sexo=Leer.next();
        Leer.close();
        */
    }


/* 
    public void calcularImc () {
        double imc;
        imc=peso/(estatura*estatura);
        if(imc<20){
                System.out.println("el peso está por debajo de lo ideal");}
                else if (imc>25){
                    System.out.println("tiene sobrepeso");}
                    else {
                   System.out.println("el peso es ideal");
           
    }
*/



public double calcularImc ( double peso, double estatura) {
    double imc=0,cuadrado;
    cuadrado=estatura*estatura;
    imc=(peso/cuadrado);
    System.out.println("Su imc es :" + imc);
    return imc;
}
        public void mayorEdad() {

            if(edad>17){
                System.out.println("Es mayor de edad");
            }
            else {
                System.out.println("Es menor de edad");
            }

        }
        public void mostrarPersona() {
            System.out.println("Su :" + tipoDoc + " De numero :" + documento  + " A nombre de :" + nombre + " Y apellido " + apellido + " Registra un peso de :" + peso 
            + " Y estatura :" + estatura + " La edad es :" + edad + " Y el sexo :" + sexo );
           
            
                    }

    }
  

