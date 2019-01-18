package HeadFirst_DesignPattern.ChepterOne.StrategyPattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<slient>");
    }
}
