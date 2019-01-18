package HeadFirst_DesignPattern.ChepterOne.ObserverPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
    }
}
