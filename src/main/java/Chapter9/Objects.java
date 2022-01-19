package Chapter9;

public class Objects {
    public static void main(String[] args) {

        Circle circle1=new Circle();
        Circle circle2=new Circle(25);
        Circle circle3=new Circle(125);
        System.out.println("The area of the circe of raduis "+ circle1.radius + " is " + circle1.getArea());
        System.out.println("The area of the circe of raduis "+ circle2.radius + " is " + circle2.getArea());
        System.out.println("The area of the circe of raduis "+ circle3.radius + " is " + circle3.getArea());
        circle2.radius=100;
        System.out.println("The area of the circe of raduis "+ circle2.radius + " is " + circle2.getArea());

    }
}

class Circle  {
    double radius;

    Circle(){
        radius=1;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getPerimeter(){
        return 2*radius*Math.PI;
    }

    void setRadius(double newRadius){
        radius=newRadius;
    }
}
