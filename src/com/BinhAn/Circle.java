package com.BinhAn;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius=1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)* Math.PI;
        // Math.pow được sử dụng để tính toán một số nâng lên thành lũy thừa của một số khác. Hàm này chấp nhận hai tham số và trả về giá trị của tham số đầu tiên được nâng lên tham số thứ hai
    }
}
