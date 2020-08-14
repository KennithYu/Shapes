/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesdemo;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Kennith Yu
 */
public class ShapesDemo {

    public static void main(String[] args) {
        ShapesDemo.calculateArea(new Rectangle());
        
        ShapesDemo.calculateArea(new Square());
        
    }
    
    public static void calculateArea(Rectangle r) {
        r.setWidth(2);
        r.setHeight(3);
        
        assertEquals("Area calculation is incorrect.", r.getArea(), 6);
        
        //System.out.println(r.getArea());
    }
    
}
