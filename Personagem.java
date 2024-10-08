/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;
import java.util.Scanner;

public class Personagem {
    
    private String nome;
    private int vida,mana,ataque,classe;
    Scanner sc1 = new Scanner(System.in);
    
    
    public Personagem(){
        
    }
    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public void criarPersonagem(){
        boolean opcao = true;
        char confirma_classe;
        
        System.out.println("Digite o nome do seu personagem e a classe que deseja: ");
        System.out.println("Nome: ");
        this.nome = sc1.nextLine();
        
       
        
        while(opcao == true){
            System.out.println("Ola "+this.nome+" selecione uma classe: ");
            System.out.println("1.Guerreiro | 2.Mago | 3.Curandeiro | 4.Necromante");
            classe = sc1.nextInt();
            
            if(classe == 1){
                
            Guerreiro guerreiro = new Guerreiro();
            guerreiro.infoGuerreiro();
            System.out.println("Deseja ser um Guerreiro? S/N");
            confirma_classe = sc1.next().charAt(0);
            
            if (confirma_classe == 'S'){
                opcao = false;
            }
            
           }else if(classe == 2){
            Mago mg = new Mago(); 
            mg.infoMago();
            System.out.println("Deseja ser um Mago? S/N");
            confirma_classe = sc1.next().charAt(0);
            
            if (confirma_classe == 'S'){
                opcao = false;
            }
            
          }else if(classe == 3){
            Curandeiro cr = new Curandeiro(); 
            cr.infoCurandeiro();
            System.out.println("Deseja ser um Curandeiro? S/N");
            confirma_classe = sc1.next().charAt(0);
            
            if (confirma_classe == 'S'){
                opcao = false;
            }
          } 
        
        }
        
        
    
    
    }
    
    
    
    
}
