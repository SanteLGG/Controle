/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulacontrole;

/**
 *
 * @author luisg
 */
public class AulaControle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleRemoto c = new ControleRemoto();
       c.ligar();
       c.maisVolume();
       c.play();
       c.abrirMenu();
        
        
    }
    
}
