/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author victor pc
 */
public class Circle extends Shape {
    private String base;
    private int radius;
    
    public Circle(boolean isFilled, String colour) {
        super(isFilled, colour);
        
    }

    @Override
    public double getArea() {
    return radius * radius * 3.14 ;
    }
    
    
}
