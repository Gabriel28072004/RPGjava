/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author bigma
 */
public class Curandeiro extends Personagem {
    
    public Curandeiro(){
        this.setMana(350);
        this.setVida(75);
        this.setAtaque(5);
        this.getMana();
        this.getVida();
        this.getAtaque();
    }
    
    public void infoCurandeiro(){
        System.out.println("Classe: Curandeiro");
        System.out.println("Vida: " +this.getVida());
        System.out.println("Mana: " +this.getMana());
        System.out.println("Ataque: " +this.getAtaque());
        
    
    }
    
}
