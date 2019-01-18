package HeadFirst_DesignPattern.ChepterOne.ObserverPattern;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<slient>");
    }
}
