//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("The program without Polymorphism is : ");
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.drawCircle();
        rectangle.drawRectangle();
        System.out.println("The program with Polymorphims is :");

        Shape shape1 = new Circle1();
        Shape shape2 = new Rectangle1();

        shape1.draw();
        shape2.draw();

    }
}