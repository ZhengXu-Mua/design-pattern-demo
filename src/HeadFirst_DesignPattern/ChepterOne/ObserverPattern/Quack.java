package HeadFirst_DesignPattern.ChepterOne.ObserverPattern;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
