package SimpleFactoryPattern;

import java.util.HashMap;

/*
简单工厂模式
 */
public class Caculator {

    //原本这个方法每次会创建四个对象，不好，没有必要，可以使用switch
    //代替，虽然在极端情况下会增加判断次数，但是不需要多次创建无用对象
    public static Operation getOperationFactory(String operate){
        Operation oper = null;
//        HashMap<String,Operation> operation = new HashMap<String,Operation>();
//        operation.put("+",new OperationAdd());
//        operation.put("-",new OperationSub());
//        operation.put("*",new OperationMul());
//        operation.put("/",new OperationDiv());
        switch (operate){
            case "+": oper = new OperationAdd();break;
            case "-": oper = new OperationSub();break;
            case "*": oper = new OperationMul();break;
            case "/": oper = new OperationDiv();break;
        }
        return oper;
    }
}
