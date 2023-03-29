package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego{
 //Declarar variables
 int seleccionusuario;
 int seleccionmaquina;


  //instanciar clase
  Scanner Leer  = new Scanner(System.in);

        public  void iniciar() {
            System.out.println("Bienvenido al juego de cara y sello");
        }

        public void jugar() {

            seleccionmaquina = (int)(Math.random() * 2) + 1;
 
            System.out.println("Seleccione 1 para cara o 2 para sello ");
            seleccionusuario = Leer.nextInt();
     
            
            switch (seleccionusuario)
            { 
                case 1: System.out.println(" Haz seleccionado CARA ");
                break;
                case 2: System.out.println(" Haz seleccionado SELLO");
                break;
            }
        
        }
               
    public void finalizar() {

        System.out.print(" Ha caido : ");

        switch ( seleccionmaquina )
        {
            case 1:
                System.out.println(" CARA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz ganado ");
                    break;
                   case 2: System.out.println(" Haz perdido ");
                    break;
                }
                break;
 
                case 2:
                System.out.println(" SELLO ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                    break;
                   case 2: System.out.println(" Haz ganado");
                    break;
                }
                break;

        }
    }
        
    
            }