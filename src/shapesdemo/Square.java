/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesdemo;

/**
 *
 * @author Kennith Yu
 */
public class Square extends Rectangle{
    
    public Square (int height, int width) {
        super(height, width);
    }
    
    public Square() {}
    
    public int getArea() {
        if (height == 0) {
            return width * width;
        } else if (width == 0) {
            return height * height;
        } else {
            return height * width;
        }
    }
}
