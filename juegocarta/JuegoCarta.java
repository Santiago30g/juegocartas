/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocarta;

/**
 *
 * @author APRENDIZ
 */
public class JuegoCarta {

 public static void main(String[] args) {
       
         Jugador jugador1 = new Jugador("Jugador1");
        Jugador jugador2 = new Jugador("Jugador2");

        Juego juego = new Juego(jugador1, jugador2);
        juego.jugar();
        
    }
}
        
    
    