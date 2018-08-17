/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video37Empleado5Kev;

/**
 *
 * @author HP ENVY
 */
public class Video37Empleado5Kev {

    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado t1 = new Empleado("Paco");
        
        Empleado t2 = new Empleado("Ana");
        
        Empleado t3 = new Empleado("Antonio");
        
        t1.cambiaSeccion("Recursos Humanos"); //rrhh
       
        System.out.println(t1.devuelveDatos());       
        System.out.println(t2.devuelveDatos());
        System.out.println(t3.devuelveDatos());
    }
}


