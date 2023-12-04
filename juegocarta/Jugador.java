/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocarta;

import java.util.Random;

/**
 *
 * @author APRENDIZ
 */
public class Jugador {
    
    private String nombre;
    private Carta[] mazo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mazo = new Carta[5];
        inicializarMazo();
    }
// se crea el metodo mazo para inicializar la partida
    private void inicializarMazo() {
        mazo[0] = new Carta("Rayo", 300);
        mazo[1] = new Carta("Fuego", 200);
        mazo[2] = new Carta("Agua", 250);
        mazo[3] = new Carta("Tierra", 180);
        mazo[4] = new Carta("Viento", 220);
    }

    public Carta[] getMazo() {
        return mazo;
    }

    public String getNombre() {
        return nombre;
    }
// cartas aleatorias
    public Carta seleccionarCartaAleatoria() {
        return mazo[new Random().nextInt(5)];
    }
//este metodo muestra en consola la informacion del mazo

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nombre).append(":\n");
        for (Carta carta : mazo) {
            stringBuilder.append("   ").append(carta).append("\n");
        }
        return stringBuilder.toString();
    }
}
