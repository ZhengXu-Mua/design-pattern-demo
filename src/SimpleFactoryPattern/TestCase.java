package SimpleFactoryPattern;

import org.junit.jupiter.api.Test;

public class TestCase {
    @Test
    public void testOne(){
        Operation oper = Caculator.getOperationFactory("*");
        oper.set_numberA(1);
        oper.set_numberB(2);
        System.out.println(oper.GetResult());
    }
}
