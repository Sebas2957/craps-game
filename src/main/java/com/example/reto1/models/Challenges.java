package com.example.reto1.models;

/**
 * Challenges This class have the challenges that we did in class
 * @author Sebastian Niño
 * @version 1.0.0
 */
public class Challenges {

    /**
     * IT is the student's full name
     * @serialField
     */
    private String studentName;
    /**
     * To calculate rectangle area
     * @param width: To represent the base of the rectangle
     * @param height: To represent the height of the rectangle
     * @return The rectangle's area
     * @see #calculateRectangleArea(double, double)
     * @since 1.0.0
     */
    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    /**
     * To calculate triangle area
     * @param width: To represent the base of the triangle
     * @param height: To represent the height of the triangle
     * @return The triangle's area
     @throws ArithmeticException Division by 2
     */
    public double calculateTriangleArea(double width, double height) {
        int divisor = 2;
        return (width * height) / 2;
    }

    public void showRectangleArea (double width, double height) {
        printIn("The rectangle area is: " + this.calculateRectangleArea(width,height));
    }
}


