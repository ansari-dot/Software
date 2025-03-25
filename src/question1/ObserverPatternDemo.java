package question1;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexObserver = new HexaObserver(subject);
        OctalObserver octObserver = new OctalObserver(subject);
        BinaryObserver binObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        subject.detach(octObserver);

        System.out.println("\nSecond state change: 10 (OctalObserver detached)");
        subject.setState(10);
    }
}
