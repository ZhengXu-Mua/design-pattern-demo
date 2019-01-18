package StrategyPattern.AbandonDemo_StrategyPattern;

import org.junit.jupiter.api.Test;

public class TestCase {
    @Test
    public void TestOne(){

        CashContext cashContext = new CashContext("打8折");
        double totalPrices = 0.0d;
        totalPrices = cashContext.GetResult(100);

        System.out.println(totalPrices);
    }
}
