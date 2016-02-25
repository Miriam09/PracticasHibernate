/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogit;

/**
 *
 * @author Miriam
 */
public class EjemploGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola, soy Miriam");
         System.out.println("Este es el primer cambio");
         System.out.println("este cambio lo he hecho Yo Eloino");
         
         Git nuevoGit = new Git();
         nuevoGit.setNombreAdministrador("Miriam");
         
         nuevoGit.setNombreColaborador("Elo");
    }
    
}
