/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author bigma
 */
public class Mago extends Personagem {
    
    public Mago() {
        this.setMana(100);
        this.setVida(150);
        this.setAtaque(15);
        this.getMana();
        this.getVida();
        this.getAtaque();
    }
    
    public void infoMago(){
        System.out.println("Classe: Mago");
        System.out.println("Vida: " +this.getVida());
        System.out.println("Mana: " +this.getMana());
        System.out.println("Ataque: " +this.getAtaque());
        
    
    }
    
}
