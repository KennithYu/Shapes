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
public class Rectangle {
    protected int height;
    protected int width;
    
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    
    public Rectangle() {}
    
    public void setHeight(int height) {
        this.height = height;
    }
    
     public void setWidth(int width) {
        this.width = width;
    }
    
    public int getArea() {
        return height * width;
    }
    
    public int getPerimeter() {
        return (height + width) * 2;
    }
}
