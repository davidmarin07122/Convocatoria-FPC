
package convocar;

import java.util.Scanner;

public class Convocar {

    
    
    public static void main(String[] args) {
      
        
        Scanner entrada = new Scanner(System.in);
        
        int contador = 0;
        int opcion;
        boolean salir = false;
        
        Jugador [] jugadores = new Jugador[5];
        
        while(!salir){
            System.out.println("Welcomeeeee");
            System.out.println("*******");
            
            System.out.println("1. Agregar un Jugador");
            System.out.println("2. Mostar un Jugador");
            System.out.println("3. Editar un Jugador");
            System.out.println("4. Mostrar toda la convocatoria");
            System.out.println("5. Salir");
            
            System.out.println("Digite una opcion");
            
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    
                    jugadores[contador]= new Jugador();
                    
                    System.out.println("Digite el id del jugador:");
                    jugadores[contador].setId(entrada.nextInt());
                    
                    System.out.println("Digite el nombre:");
                    jugadores[contador].setNombre(entrada.next());
                    
                    System.out.println("Digite el apellido:");
                    jugadores[contador].setApellido(entrada.next());
                    
                    System.out.println("Digite el numero de la dorsal:");
                    jugadores[contador].setDorsal(entrada.nextInt());
                    
                    System.out.println("Digite la posicion:");
                    jugadores[contador].setPosicion(entrada.next());
                    
                    System.out.println("Digite la edad:");
                    jugadores[contador].setEdad(entrada.nextInt());
                    
                    System.out.println("Digite el equipo:");
                    jugadores[contador].setEquipo(entrada.next());
                    
                    contador ++;
                    break;
                    
                case 2:
                    
                    System.out.println("Digite el id del jugador");
                    int id = entrada.nextInt();
                    int encontrado = 0;
                    for (int i=0; i<jugadores.length;i++){
                        if (id == jugadores[i].getId()) {
                        System.out.println(jugadores[i].getNombre());
                        System.out.println(jugadores[i].getApellido());
                        System.out.println(jugadores[i].getDorsal());
                        System.out.println(jugadores[i].getPosicion());
                        System.out.println(jugadores[i].getEdad());
                        System.out.println(jugadores[i].getEquipo());
                        encontrado = 1;
                        }else if (encontrado == 0 ) {
                        System.out.println("El id no esta registrado");     
                    }
                    
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("Digite el id del jugador a modificar");
                    int idSearch = entrada.nextInt();
                    for (int i=0; i<jugadores.length;i++) {
                      if (jugadores[i].id == idSearch) {
                          
                        System.out.println("digite el nombre");
                        jugadores[i].nombre = entrada.next();
                        
                        System.out.println("digite el apellido");
                        jugadores[i].apellido = entrada.next();
                        
                        System.out.println("digite la dorsal");
                        jugadores[i].dorsal = entrada.nextInt();
                        
                        System.out.println("digite la edad");
                        jugadores[i].edad = entrada.nextInt();
                        
                        System.out.println("digite el equipo");
                        jugadores[i].equipo = entrada.next();
                        
                        System.out.println("digite la posicion");
                        jugadores[i].posicion = entrada.next();

                           }   
                    }  
                    break;
                    
                case 4:
                    
                    for (int i=0; i<contador;i++){
                        
                        System.out.println(jugadores[i].getNombre());
                        System.out.println(jugadores[i].getApellido());
                        System.out.println(jugadores[i].getDorsal());
                        System.out.println(jugadores[i].getPosicion());
                        System.out.println(jugadores[i].getEdad());
                        System.out.println(jugadores[i].getEquipo());
                        
                    
                    }
                    break;
                    
                case 5:
                      salir=true;                  
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            
            }                           
        }     
    }
    
}
