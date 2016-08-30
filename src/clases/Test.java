/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author gvega2
 */
public class Test {
    public static void main(String[] args) {
        Persona p;
        p = new Persona(114515616,"German","Vega");
        Persona q = new Persona(114568754,"Bones","James");
        JOptionPane.showMessageDialog(null,"El nombre del Objeto p es:"+p.primer_nombre);
       
    }
    
}
