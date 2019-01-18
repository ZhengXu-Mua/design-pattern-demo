package StrategyPattern.AbandonDemo_StrategyPattern;

/**
 * 返利
 */
public class CashReturn extends CashSuper {
    private double moneyCondtion = 0.0d;
    private double moneyReturn  = 0.0d;
    public CashReturn (String moneyCondtion,String moneyReturn){
        this.moneyCondtion = Double.parseDouble(moneyCondtion);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondtion){
            result = money - Math.floor(money / moneyCondtion) * moneyReturn;
        }
        return result;
    }
}
