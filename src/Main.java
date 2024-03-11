import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

abstract class Figure{
        abstract double area();
        abstract double perimeter();
}

class Сircle extends Figure{
    double radius;
    Сircle(double radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
    double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Square extends Figure{
    double side;
    Square(double side){
        this.side = side;
    }
    double area(){
        return side * side;
    }
    double perimeter(){
        return 4 * side;
    }
}

class Triangle extends Figure{
    double side1;
    double side2;
    double side3;
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double area() {
        double half_meter = (side1 + side2 + side3) / 2;
        return Math.sqrt(half_meter * (half_meter - side1) * (half_meter - side2) * (half_meter - side3));
    }
    double perimeter(){
        return side1 + side2 + side3;
    }
}

class Pentagon  extends Figure {
    double side;

    Pentagon (double side) {
        this.side = side;
    }

    double area() {
        return (side * side * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }

    double perimeter() {
        return 5 * side;
    }
}

class Trapeze extends Figure {
    double top_side;
    double bot_side;
    double high;
    Trapeze(double top_side, double bot_side, double high) {
        this.top_side = top_side;
        this.bot_side = bot_side;
        this.high = high;
    }
    double area() {
        return (top_side + bot_side) * high / 2;
    }
    double perimeter() {
        return top_side + bot_side + 2 * Math.sqrt(high * high + Math.pow((bot_side - top_side) / 2, 2));
    }
}

class Rectangle extends Figure {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}

class Parallelogram extends Figure {
    double base;
    double high;

    Parallelogram(double base, double high) {
        this.base = base;
        this.high = high;
    }
    double area() {
        return base * high;
    }
    double perimeter() {
        return 2 * (base + high);
    }
}

class Parallelepiped extends Figure {
    double length;
    double width;
    double high;

    Parallelepiped(double length, double width, double high) {
        this.length = length;
        this.width = width;
        this.high = high;
    }
    double area() {
        return 2 * (length * width + high * high + width * high);
    }
    double perimeter() {
        return 4 * (length + width + high);
    }
}

class Cylinder extends Figure {
    double radius;
    double high;

    Cylinder(double radius, double high) {
        this.radius = radius;
        this.high = high;
    }
    double area() {
        return 2 * Math.PI * radius * (radius + high);
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Sphere extends Figure {
    double radius;
    Sphere(double radius) {
        this.radius = radius;
    }
    double area() {
        return 4 * Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rhomb extends Figure {
    double side;
    double high;
    Rhomb(double side, double high) {
        this.side = side;
        this.high = high;
    }
    double area() {
        return side * high;
    }
    double perimeter() {
        return 4 * side;
    }
}

class Cone extends Figure {
    double radius;
    double high;
    Cone(double radius, double high) {
        this.radius = radius;
        this.high = high;
    }
    double area() {
        return Math.PI * radius * (radius + Math.sqrt(high * high + radius * radius));
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите номер фигуры:");
        System.out.println("1. Круг");
        System.out.println("2. Квадрат");
        System.out.println("3. Треугольник");
        System.out.println("4. Пятиугольник");
        System.out.println("5. Трапеция");
        System.out.println("6. Прямоугольник");
        System.out.println("7. Параллелограмм");
        System.out.println("8. Параллелепипед");
        System.out.println("9. Цилиндр");
        System.out.println("10. Сфера");
        System.out.println("11. Ромб");
        System.out.println("12. Конус");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Введите радиус круга:");
                double radius = sc.nextDouble();
                Сircle circle = new Сircle(radius);
                System.out.println("Площадь: " + circle.area());
                System.out.println("Периметр: " + circle.perimeter());
                break;
            case 2:
                System.out.println("Введите сторону квадрата:");
                double side = sc.nextDouble();
                Square square = new Square(side);
                System.out.println("Площадь: " + square.area());
                System.out.println("Периметр: " + square.perimeter());
                break;
            case 3:
                System.out.println("Введите сторону треугольник:");
                double side1 = sc.nextDouble();
                double side2 = sc.nextDouble();
                double side3 = sc.nextDouble();
                Triangle tri = new Triangle(side1, side2, side3);
                System.out.println("Площадь: " + tri.area());
                System.out.println("Периметр: " + tri.perimeter());
                break;
            case 4:
                System.out.println("Введите сторону пятиугольника:");
                double side_pentagon = sc.nextDouble();
                Pentagon pentagon = new Pentagon(side_pentagon);
                System.out.println("Площадь: " + pentagon.area());
                System.out.println("Периметр: " + pentagon.perimeter());
                break;
            case 5:
                System.out.println("Введите верхнюю сторону трапеции:");
                double top = sc.nextDouble();
                System.out.println("Введите нижнюю сторону трапеции:");
                double bot = sc.nextDouble();
                System.out.println("Введите высоту трапеции:");
                double hi = sc.nextDouble();
                Trapeze trapeze = new Trapeze(top, bot, hi);
                System.out.println("Площадь: " + trapeze.area());
                System.out.println("Периметр: " + trapeze.perimeter());
                break;
            case 6:
                System.out.println("Введите ширину прямоугольника:");
                double width = sc.nextDouble();
                System.out.println("Введите длину прямоугольника:");
                double length = sc.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Площадь: " + rectangle.area());
                System.out.println("Периметр: " + rectangle.perimeter());
                break;
            case 7:
                System.out.println("Введите основание параллелограмма:");
                double base = sc.nextDouble();
                System.out.println("Введите высоту параллелограмма:");
                double high = sc.nextDouble();
                Parallelogram parallelogram = new Parallelogram(base, high);
                System.out.println("Площадь: " + parallelogram.area());
                System.out.println("Периметр: " + parallelogram.perimeter());
                break;
            case 8:
                System.out.println("Введите ширину параллелепипеда:");
                double width_par = sc.nextDouble();
                System.out.println("Введите длину параллелепипеда:");
                double length_par = sc.nextDouble();
                System.out.println("Введите высоту параллелепипеда:");
                double high_par = sc.nextDouble();
                Parallelepiped parallelepiped = new Parallelepiped(length_par, width_par, high_par);
                System.out.println("Площадь: " + parallelepiped.area());
                System.out.println("Периметр: " + parallelepiped.perimeter());
                break;
            case 9:
                System.out.println("Введите радиус цилиндра:");
                double r_cyl = sc.nextDouble();
                System.out.println("Введите высоту цилиндра:");
                double high_cyl = sc.nextDouble();
                Cylinder cylinder = new Cylinder(r_cyl, high_cyl);
                System.out.println("Площадь: " + cylinder.area());
                System.out.println("Периметр: " + cylinder.perimeter());
                break;
            case 10:
                System.out.println("Введите радиус сферы:");
                double radius_sphere = sc.nextDouble();
                Sphere sphere = new Sphere(radius_sphere);
                System.out.println("Площадь: " + sphere.area());
                System.out.println("Периметр: " + sphere.perimeter());
                break;
            case 11:
                System.out.println("Введите сторону ромба:");
                double side_rhomb = sc.nextDouble();
                System.out.println("Введите высоту ромба:");
                double high_rhomb = sc.nextDouble();
                Rhomb rhomb = new Rhomb(side_rhomb, high_rhomb);
                System.out.println("Площадь: " + rhomb.area());
                System.out.println("Периметр: " + rhomb.perimeter());
                break;
            case 12:
                System.out.println("Введите радиус конуса:");
                double radius_cone = sc.nextDouble();
                System.out.println("Введите высоту конуса:");
                double high_cone = sc.nextDouble();
                Cone cone = new Cone(radius_cone, high_cone);
                System.out.println("Площадь: " + cone.area());
                System.out.println("Периметр: " + cone.perimeter());
                break;
            default:
                System.out.println("Некорректный выбор");
                return;
        }
    }
}
