/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegocarta;

/**
 *
 * @author APRENDIZ
 */
public class Carta {
   
    private String elemento;
    private int vida;
    private int defensa;
    private int fuerza;

    public Carta(String elemento, int fuerza) {
        this.elemento = elemento;
        this.vida = 1000;
        this.defensa = 200;
        this.fuerza = fuerza;
    }

    public String getElemento() {
        return elemento;
    }

    public int getVida() {
        return vida;
    }

    public int getDefensa() {
        return defensa;
    }
    

    public int getFuerza() {
        return fuerza;
    }
// metodo de resivir ataque
    public void recibirAtaque(int ataque) {
        int dano = Math.max(0, ataque - defensa);
        vida = Math.max(0, vida - dano);
    }

    @Override
    public String toString() {
        return elemento + " - Vida: " + vida + ", Defensa: " + defensa;
    }
}

