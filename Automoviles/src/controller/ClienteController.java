/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Bd.Conexion;
import java.awt.List;
import java.util.ArrayList;
import models.Cliente;
import java.sql.PreparedStatement;
/**
 *
 * @author Cetecom
 */
public class ClienteController {
Conexion cx;

     
    public ClienteController() {
       cx = new Conexion();
       cx.conectar();
    }
    
    
    
    
    
    
    
public void agregarCliente(String nombre, int rut, int numero_contacto, String direccion, String tipo_cliente){
    String query = "INSERT INTO `cliente` (nombre,rut,numero_contacto,direccion,tipo_cliente) VALUES (?,?,?,?,?,?)";
    try {
        PreparedStatement st = cx.getConnection().prepareStatement(query);
        st.setString(1,nombre);
        st.setInt(2, rut);
        st.setInt(3, numero_contacto);
        st.setString(4, direccion);
        st.setString(5, tipo_cliente);
        st.executeUpdate();
        System.out.println("Cliente agregado correctamente..");
    } catch (Exception e) {
        System.out.println("Cliente ya existente o error al agregar");
        }
    }
}

//public void editarCliente(int rut,String nombre, int numero_contacto, String direccion, String tipo_cliente){
    //String query = "UPDATE CLIENTE SET nombre = '" + nombre + "', rut = " + rut + "', numero_contacto = " + numero_contacto + "', direccion = "
                    //+ direccion + "', tipo_cliente" ";";
    //sout 
//}