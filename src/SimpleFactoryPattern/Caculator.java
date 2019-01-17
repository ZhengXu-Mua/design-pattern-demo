package SimpleFactoryPattern;

import java.util.HashMap;

/*
简单工厂模式
 */
public class Caculator {
//    HashMap<String,Operation> operation = new HashMap<String,Operation>();
//
//    public Caculator(){
//        this.operation.put("+",new OperationAdd());
//        this.operation.put("-",new OperationSub());
//        this.operation.put("*",new OperationMul());
//        this.operation.put("/",new OperationDiv());
//    }
    public static Operation getOperationFactory(String operate){
        Operation oper = null;
        HashMap<String,Operation> operation = new HashMap<String,Operation>();
        operation.put("+",new OperationAdd());
        operation.put("-",new OperationSub());
        operation.put("*",new OperationMul());
        operation.put("/",new OperationDiv());
        oper = operation.get(operate);
        return oper;
    }
}
