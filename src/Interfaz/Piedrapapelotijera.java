package Interfaz;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapelotijera implements Juego { 
    int seleccionusuario;
    int seleccionmaquina;
   
   
     //instanciar clase
     Scanner Leer  = new Scanner(System.in);
   
           public  void iniciar() {
               System.out.println("Bienvenido al juego de piedra papel o tijera");
           }
   
           public void jugar() {
   
            seleccionmaquina = (int)(Math.random() * 2) + 1;
 
            System.out.println("Seleccione 1 para piedra 2 para papel o 3 para tijera ");
            seleccionusuario = Leer.nextInt();
     
            
            switch (seleccionusuario)
            { 
                case 1: System.out.println(" Haz seleccionado PIEDRA ");
                break;
                case 2: System.out.println(" Haz seleccionado PAPEL ");
                break;
                case 3: System.out.println(" Haz seleccionado TIJERA ");
                break;
            }
           
           }
                  
       public void finalizar() {
   
        System.out.print(" Ha caido : ");

        switch ( seleccionmaquina )
        {
            case 1:
                System.out.println(" PIEDRA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz empatado ");
                    break;
                   case 2: System.out.println(" Haz ganado ");
                    break;
                    case 3: System.out.println("Haz perdido");
                    break;
                }
                break;
 
                case 2:
                System.out.println(" PAPEL ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                    break;
                   case 2: System.out.println(" Haz empatado ");
                    break;
                    case 3: System.out.println("Haz ganado");
                    break;
                }
                break;

                case 3:
                System.out.println(" TIJERA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz ganado ");
                    break;
                   case 2: System.out.println(" Haz perdido ");

                    break;
                    case 3: System.out.println("Haz empatado");
                }
                break;
        }
           
       }
    }