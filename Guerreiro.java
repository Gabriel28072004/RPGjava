/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

public class Guerreiro extends Personagem {
    
    public Guerreiro() {
        this.setMana(0);
        this.setVida(250);
        this.setAtaque(20);
        this.getMana();
        this.getVida();
        this.getAtaque();
    }
    
    public void infoGuerreiro(){
        System.out.println("Classe: Guerreiro");
        System.out.println("Vida: " +this.getVida());
        System.out.println("Mana: " +this.getMana());
        System.out.println("Ataque: " +this.getAtaque());
        
    
    }
    
}
