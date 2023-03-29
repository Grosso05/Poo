package Principal;
import Salud.Persona;
import Salud.Empleado;
public class Inicio {
    public static void main(String[] args) {
      //  double imc;

        //  Instanciar objeto

        Persona datos=new Persona();
        Empleado datosEmpleado=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        datosEmpleado.pedirDatos();
        datosEmpleado.pedirDatosempleado();
        datosEmpleado.mostrarEmpleado();
        datosEmpleado.calcularHonorarios();
        
       datos.pedirDatos();
        
/* 
        imc=datos.calcularImc(datos.getestatura(),datos.getpeso());
       
        
        if(imc<20){
            System.out.println("PESOBAJO");}
            else if (imc>25){
                System.out.println("SOBREPESO");}
                else {
               System.out.println("PESOIDEAL");

        datos.mostrarPersona();
        datos.mayorEdad();
*/
        
        
        
    }
}
