package HeadFirst_DesignPattern.ChepterOne.StrategyPattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
