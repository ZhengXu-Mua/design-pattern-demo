package HeadFirst_DesignPattern.ChepterOne.ObserverPattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
