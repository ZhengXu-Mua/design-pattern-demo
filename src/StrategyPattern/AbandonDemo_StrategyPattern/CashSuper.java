package StrategyPattern.AbandonDemo_StrategyPattern;
/*
现金收取的抽象方法，收取现金。参数为原价，返回为当前价
 */
public abstract class CashSuper {
    public abstract double acceptCash(double money);
}
