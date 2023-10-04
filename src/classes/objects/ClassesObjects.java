/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes.objects;

import shapes.Rectangle;
import shapes.Triangle;



/**
 *
 * @author victor pc
 */
public class ClassesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangle trill1 = new Triangle();
        Triangle trill2 = new Triangle();
        Triangle trill3 = new Triangle();
        Triangle trill4 = new Triangle();
        Triangle trill5 = new Triangle();
        Triangle trill6 = new Triangle();
        
        int[] sideLengths = new int [18];
        //lengths of trill 1's side will be first, then the legths of trill2's side etc
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        // tri 5 (4,7,2)
        sideLengths[12]=4;
        sideLengths[13]= 7;
        sideLengths[14] =2;
        
        
        
        // we want to set the middle side of each triangle to be 3 
       sideLengths[0] = 5;
        sideLengths[0] = 5;
         sideLengths[0] = 5;
          sideLengths[0] = 5;
          
          
          
          
          
          Rectangle rect1 = new Rectangle();
          
          double reactArea = rect1.getArea();
         System.out.println(reactArea); 
          
          
         
        
        
    }
      
}
