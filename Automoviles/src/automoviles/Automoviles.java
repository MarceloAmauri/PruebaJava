/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automoviles;

import Bd.Conexion;
import controller.ClienteController;
import views.MenuPrincipal;

/**
 *
 * @author Cetecom
 */
public class Automoviles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cx = new Conexion();
        cx.conectar();
        
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        
        ClienteController cl = new ClienteController();
        
        
    }
    
}
