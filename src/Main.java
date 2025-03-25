//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
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

=======
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
>>>>>>> d40e086 (Initial commit with observer pattern project)
    }
}