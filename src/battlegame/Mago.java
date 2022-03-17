/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlegame;

import java.util.Random;

/**
 *
 * @author amand
 */
public class Mago extends Personaje{
    public Mago()
    {
        super("Mago",40,50,5,0.85,"hechizo");
    }
    
    public void mejorarAtaque()
    {
        if(this.getSalud()<=10)
        {
            int ataque = this.getAtaque();
            ataque +=20;
            this.setAtaque(ataque);
            System.out.println("Vocatis tenebris copias");
            System.out.println("Mi hechizo funciona... He mejorado mi ataque");
        }
    }
    
    public void mejorarVida()
    {
        Random r = new Random();
        
        int a = r.nextInt(100);
        if(a>60&& this.getSalud()<=15)
        {
            int salud = this.getSalud();
            salud+=15;
            this.setSalud(salud);
            System.out.println("altiore sanitas");
            System.out.println("Mi hechizo funciona... He recuperado mis fuerzas");
        }
        
    }
}
